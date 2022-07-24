/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraDatos;

import Finanzas.Factura;
import java.io.Serializable;

/**
 *
 * @author victo
 */
public class NodoFactura implements Serializable{
    private Factura factura;
    private NodoFactura sig;
    
    NodoFactura() {
    	sig = null;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public NodoFactura getSig() {
        return sig;
    }

    public void setSig(NodoFactura sig) {
        this.sig = sig;
    }
    
    

    


}
