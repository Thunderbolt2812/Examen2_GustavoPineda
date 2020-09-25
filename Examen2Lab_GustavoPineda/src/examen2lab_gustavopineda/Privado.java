/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_gustavopineda;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Privado extends Chat{
    private ArrayList<Mensaje> listaM;
    private Usuario user;

    public Privado() {
        super();
    }

    public Privado(ArrayList<Mensaje> listaM, Usuario user) {
        super();
        this.listaM = listaM;
        this.user = user;
    }
    
    
}
