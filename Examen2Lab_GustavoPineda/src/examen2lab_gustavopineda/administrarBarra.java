/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_gustavopineda;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Usuario
 */
public class administrarBarra extends Thread {
    private JProgressBar barra;
    private int limit;
    private boolean avanzar;
    private boolean vive;

    public administrarBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar=true;
        vive=true;
    }
    
    
    

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }


    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    public void setLimit(int value){
       limit= value;
    }
    
    public int getLimit(){
        return limit;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue((barra.getValue()+1));
                Usuario u = new Usuario();
                if(barra.getValue()==limit){
                    vive=false;
                    JOptionPane.showMessageDialog(null, "Tiempo transcurrido: "+limit);
                }                
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
