/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraDatos;

/**
 *
 * @author victo
 */
public class NodoMarca {
    private String marca;
    private int cantidadVentas; 
    private NodoMarca sig;
    
    NodoMarca() {
    	sig = null;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public NodoMarca getSig() {
        return sig;
    }

    public void setSig(NodoMarca sig) {
        this.sig = sig;
    }
    
    public void Mostrar(){}
    
    
    
    

}
