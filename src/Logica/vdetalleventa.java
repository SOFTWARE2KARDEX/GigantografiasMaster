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
public class vdetalleventa {
    private int idDetalleventa;
    private int Cantidad;
    private String Descripcion;
    private int idPlancha;
    private int idVenta;
    private int idUsuario;

    public vdetalleventa() {
    }

    public vdetalleventa(int idDetalleventa, int Cantidad, String Descripcion, int idPlancha, int idVenta, int idUsuario) {
        this.idDetalleventa = idDetalleventa;
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.idPlancha = idPlancha;
        this.idVenta = idVenta;
        this.idUsuario = idUsuario;
    }

    public int getIdDetalleventa() {
        return idDetalleventa;
    }

    public void setIdDetalleventa(int idDetalleventa) {
        this.idDetalleventa = idDetalleventa;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdPlancha() {
        return idPlancha;
    }

    public void setIdPlancha(int idPlancha) {
        this.idPlancha = idPlancha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    
    
}
