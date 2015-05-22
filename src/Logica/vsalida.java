/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Date;

/**
 *
 * @author HENRY
 */
public class vsalida {
    private int idSalida ;
    private String TipoSalida;
    private Date Fecha;

    public vsalida() {
    }

    public vsalida(int idSalida, String TipoSalida, Date Fecha) {
        this.idSalida = idSalida;
        this.TipoSalida = TipoSalida;
        this.Fecha = Fecha;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }

    public String getTipoSalida() {
        return TipoSalida;
    }

    public void setTipoSalida(String TipoSalida) {
        this.TipoSalida = TipoSalida;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
    
}
