/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.vdetallesalida;
import Logica.vplancha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HENRY
 */
public class fdetallesalida {
    
    private conexion mysql= new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer totalregistros;
    
    //Mostrar Consulta
    public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","IdPlancha","Plancha","IdSalida","Tipo","Descripcion","Cantidad","IdUsuario","Usuario"};
       
       String [] registro =new String [9];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select d.idDetalleSalida, d.idPlancha,p.Tamaño,p.Medida,d.idSalida,(select TipoSalida from Salida where idSalida=d.idSalida) as Tipo,"+
            "d.Descripcion,d.Cantidad,d.idUsuario,(select nombre from Usuario where idUsuario=d.idUsuario) as Nombre from DetalleSalida d inner join Plancha p on d.idPlancha=p.idPlancha where d.idSalida ="+ buscar + " order by idDetalleSalida desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idDetalleSalida");
               registro [1]=rs.getString("idPlancha");
               registro [2]=rs.getString("Tamaño") + " " + rs.getString("Medida");
               registro [3]=rs.getString("idSalida");
               registro [4]=rs.getString("Tipo");
               registro [5]=rs.getString("Descripcion");
               registro [6]=rs.getString("Cantidad");
               registro [7]=rs.getString("idUsuario");
               registro [8]=rs.getString("Nombre");
                                             
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
   
   
 
   
   //Funcion Insertar
   public boolean insertar (vdetallesalida dts){
       sSQL="insert into DetalleSalida (idPlancha,idSalida,Descripcion,Cantidad,idUsuario)" +
               "values (?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdPlancha());
           pst.setInt(2, dts.getIdSalida());
           pst.setString(3, dts.getDescripcion());
           pst.setInt(4, dts.getCantidad());
           pst.setInt(5, dts.getIdUsuario());
                                 
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
           
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   
   //Funcion Editar
   public boolean editar (vdetallesalida dts){
       sSQL="update DetalleSalida set idPlancha=?,idSalida=?,Descripcion=?,Cantidad=?,idUsuario=?"+
               " where idDetalleSalida=?";
                  
       try {
            
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdPlancha());
           pst.setInt(2, dts.getIdSalida());
           pst.setString(3, dts.getDescripcion());
           pst.setInt(4, dts.getCantidad());
           pst.setInt(5, dts.getIdUsuario());
           
           pst.setInt(6, dts.getIdDetalleSalida());
                                 
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
           
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
   
   //Funcio Eliminar
   public boolean eliminar (vdetallesalida dts){
       sSQL="delete from DetalleSalida where idDetalleSalida=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdDetalleSalida());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
    
}
