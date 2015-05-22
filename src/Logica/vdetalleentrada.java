/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author HENRY
 */
public class vdetalleentrada {
    private int idDetalleEntrada;
    private String Descripcion;
    private int Cantidad;
    private int idEntrada;
    private int idPlancha;
    private int idUsuario;

    public vdetalleentrada() {
    }

    public vdetalleentrada(int idDetalleEntrada, String Descripcion, int Cantidad, int idEntrada, int idPlancha, int idUsuario) {
        this.idDetalleEntrada = idDetalleEntrada;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.idEntrada = idEntrada;
        this.idPlancha = idPlancha;
        this.idUsuario = idUsuario;
    }

    public int getIdDetalleEntrada() {
        return idDetalleEntrada;
    }

    public void setIdDetalleEntrada(int idDetalleEntrada) {
        this.idDetalleEntrada = idDetalleEntrada;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public int getIdPlancha() {
        return idPlancha;
    }

    public void setIdPlancha(int idPlancha) {
        this.idPlancha = idPlancha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    
    
}
