/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.vdetallesalida;
import Logica.vventa;
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
public class fventa {
    private conexion mysql= new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer totalregistros;
    
    //Mostrar Consulta
    public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","IDCliente","Cliente","Fecha"};
       
       String [] registro =new String [4];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select v.idVenta,v.idCliente, c.RazonSocial, v.Fecha from Venta v inner join Cliente c on v.idCliente=c.idCliente where v.Fecha like '%"+ buscar + "%' order by idVenta desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idVenta");
               registro [1]=rs.getString("idCliente");
               registro [2]=rs.getString("RazonSocial");
               registro [3]=rs.getString("Fecha");
               
                                             
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
   public boolean insertar (vventa dts){
       sSQL="insert into Cliente (idCliente,Fecha)" +
               "values (?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdVenta());
           pst.setDate(2, dts.getFecha());
           
          
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
   public boolean editar (vventa dts){
       sSQL="update Venta set idCliente=?,Fecha=?"+
               " where idVenta=?";
                  
       try {
            
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdVenta());
           pst.setDate(2, dts.getFecha());
           
           pst.setInt(3, dts.getIdCliente());
                                 
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
   public boolean eliminar (vventa dts){
       sSQL="delete from Venta where idVenta=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdCliente());
           
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
