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
public class adminGrupal {
    private ArrayList<Grupal> listaGrupal = new ArrayList();
    private File archivo = null;

    public adminGrupal(String path) {
        archivo = new File(path);
    }

    public ArrayList<Grupal> getListaGrupal() {
        return listaGrupal;
    }

    public void setListaEntrada(ArrayList<Grupal> listaGrupal){
        this.listaGrupal = listaGrupal;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista Grupal=" + listaGrupal;
    }

    public void setCorreo(Grupal g) {
        this.listaGrupal.add(g);
    }

    public void cargarArchivo() {
        try {            
            listaGrupal = new ArrayList();
            Grupal temp;
            if (archivo.exists()) {
                  FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Grupal) objeto.readObject()) != null) {
                        listaGrupal.add(temp);
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
            for (Grupal t : listaGrupal) {
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
