/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.vplancha;
import Logica.vsalida;
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
public class fsalida {
    
     private conexion mysql= new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer totalregistros;
    
    //Mostrar Consulta
    public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","TipoSalida","Fecha"};
       
       String [] registro =new String [3];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from Salida where TipoSalida like '%"+ buscar + "%' order by idSalida";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idSalida");
               registro [1]=rs.getString("TipoSalida");
               registro [2]=rs.getString("Fecha");
                                             
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
   public boolean insertar (vsalida dts){
       sSQL="insert into Salida (TipoSalida,Fecha)" +
               "values (?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getTipoSalida());
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
   public boolean editar (vsalida dts){
       sSQL="update Salida set TipoSalida=?,Fecha=?"+
               " where idSalida=?";
                  
       try {
            
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getTipoSalida());
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
  
   
   //Funcio Eliminar
   public boolean eliminar (vsalida dts){
       sSQL="delete from Salida where idSalida=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdSalida());
           
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
