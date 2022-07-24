/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraDatos;

import java.io.Serializable;
import kollasuyo.archer.Inventario.dispositivo;

/**
 *
 * @author victo
 */
public class NodoDispositivo implements Serializable{

    private dispositivo dispo;
    private NodoDispositivo sig;
    public NodoDispositivo() {
    	sig = null;
    }

    public dispositivo getDispo() {
        return dispo;
    }

    public NodoDispositivo getSig() {
        return sig;
    }

    public void setDispo(dispositivo dispo) {
        this.dispo = dispo;
    }

    public void setSig(NodoDispositivo sig) {
        this.sig = sig;
    }
    
  
}  
    
