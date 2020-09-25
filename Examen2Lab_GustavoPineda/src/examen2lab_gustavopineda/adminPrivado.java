/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_gustavopineda;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class adminPrivado {
    private ArrayList<Privado> listaPrivado = new ArrayList();
    private File archivo = null;

    public adminPrivado(String path) {
        archivo = new File(path);
    }

    public ArrayList<Privado> getListaPrivado() {
        return listaPrivado;
    }

    public void setListaPrivado(ArrayList<Privado> listaPrivado){
        this.listaPrivado = listaPrivado;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista Privado=" + listaPrivado;
    }

    public void setCorreo(Privado c) {
        this.listaPrivado.add(c);
    }

    public void cargarArchivo() {
        try {            
            listaPrivado = new ArrayList();
            Privado temp;
            if (archivo.exists()) {
                  FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Privado) objeto.readObject()) != null) {
                        listaPrivado.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }          
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Privado t : listaPrivado) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
