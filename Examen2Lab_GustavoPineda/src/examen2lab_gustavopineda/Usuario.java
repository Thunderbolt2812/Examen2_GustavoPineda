/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_gustavopineda;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Usuario extends Persona implements Serializable  {
    private String username;
    private String contraseña;
    private ArrayList<Chat> chats;
    private ArrayList<Usuario> amigos;
    private int calidad;

    private static final long SerialVersionUID=6789L;
    
    public Usuario() {
        super();
    }

    public Usuario(String username, String contraseña, ArrayList<Chat> chats, ArrayList<Usuario> amigos, int calidad, String nombre, String apellido, int numTel) {
        super(nombre, apellido, numTel);
        this.username = username;
        this.contraseña = contraseña;
        this.chats = chats;
        this.amigos = amigos;
        this.calidad = calidad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        return "Usuario: "+username;
    }

    @Override
    public int ENVIAR(Usuario user1) {
        double temp = (user1.getCalidad()*0.6)+(calidad*0.85);
        int tiempo = (int)(temp);
        return tiempo;
    }
    
    
}
