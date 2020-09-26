/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_gustavopineda;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Solicitud implements Serializable {
    private String nombre;
    private String usuario;
    
    private static final long SerialVersionUID=7483L;

    public Solicitud(String nombre, String usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Solicitud: "+usuario;
    }
    
    
}
