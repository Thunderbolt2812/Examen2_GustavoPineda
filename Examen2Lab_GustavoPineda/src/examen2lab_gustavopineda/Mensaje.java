/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_gustavopineda;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Mensaje {
    private String contenido;
    private Date fecha;
    private String leido;

    public Mensaje() {
    }

    public Mensaje(String contenido, Date fecha,  String leido) {
        this.contenido = contenido;
        this.fecha = fecha;
        this.leido = leido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLeido() {
        return leido;
    }

    public void setLeido(String leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Mensaje: " + "Contenido:" + contenido + ", Fecha:" + fecha +  ", Leido:" + leido;
    }

    
    
    
            
}
