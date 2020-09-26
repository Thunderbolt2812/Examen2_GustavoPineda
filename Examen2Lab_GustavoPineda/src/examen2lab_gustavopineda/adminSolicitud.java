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
public class adminSolicitud {
    private ArrayList<Solicitud> listaSolicitud = new ArrayList();
    private File archivo = null;

    public adminSolicitud(String path) {
        archivo = new File(path);
    }

    public ArrayList<Solicitud> getListaSolicitud() {
        return listaSolicitud;
    }

    public void setListaSolicitud(ArrayList<Solicitud> listaSolicitud){
        this.listaSolicitud = listaSolicitud;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista Solicitud=" + listaSolicitud;
    }

    public void setSolicitud(Solicitud s) {
        this.listaSolicitud.add(s);
    }

    public void cargarArchivo() {
        try {            
            listaSolicitud = new ArrayList();
            Solicitud temp;
            if (archivo.exists()) {
                  FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Solicitud) objeto.readObject()) != null) {
                        listaSolicitud.add(temp);
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
            for (Solicitud t : listaSolicitud) {
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
