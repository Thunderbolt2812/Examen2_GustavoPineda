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
public class Privado extends Chat implements Serializable{
    private ArrayList<Mensaje> listaM;
    private Usuario user;

    private static final long SerialVersionUID=3828L;
    
    public Privado() {
        super();
    }

    public Privado(ArrayList<Mensaje> listaM, Usuario user) {
        super();
        this.listaM = listaM;
        this.user = user;
    }

    public ArrayList<Mensaje> getListaM() {
        return listaM;
    }

    public void setListaM(ArrayList<Mensaje> listaM) {
        this.listaM = listaM;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Privado: "+user.getUsername();
    }
    
    
}
