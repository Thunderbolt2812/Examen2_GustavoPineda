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
public abstract class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int numTel;

     private static final long SerialVersionUID=6789L;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, int numTel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTel = numTel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    @Override
    public String toString() {
        return "Persona: "+nombre;
    }
    
    /**
     *
     * @param user1
     * @return
     */
    public abstract int ENVIAR(Usuario user1);
}
