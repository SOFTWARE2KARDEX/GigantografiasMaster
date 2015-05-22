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
public class vdetallesalida {
    private int idDetalleSalida;
    private int idPlancha;
    private int idSalida;
    private String Descripcion;
    private int Cantidad;
    private int idUsuario;

    public vdetallesalida() {
    }

    public vdetallesalida(int idDetalleSalida, int idPlancha, int idSalida, String Descripcion, int Cantidad, int idUsuario) {
        this.idDetalleSalida = idDetalleSalida;
        this.idPlancha = idPlancha;
        this.idSalida = idSalida;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.idUsuario = idUsuario;
    }

    public int getIdDetalleSalida() {
        return idDetalleSalida;
    }

    public void setIdDetalleSalida(int idDetalleSalida) {
        this.idDetalleSalida = idDetalleSalida;
    }

    public int getIdPlancha() {
        return idPlancha;
    }

    public void setIdPlancha(int idPlancha) {
        this.idPlancha = idPlancha;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    

    
    
    
    
}
