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
public class ListaFactura implements Serializable {
    
        private NodoFactura p;
	
        // Metodos Basicos de listas
        
        ListaFactura() {
		p = null;
	}
	public NodoFactura getP() {
		return p;
	}
	public void setP(NodoFactura p) {
		this.p = p;
	}
	public int nroNodos() {
		int c = 0;
		NodoFactura aux = getP();
		while(aux != null) {
			c++;
			aux = aux.getSig();
		}
		return c;
	}
	public void mostrar() {
		NodoFactura aux = getP();
		while(aux != null) {
			aux.getFactura().Mostrar();
			aux = aux.getSig();
		}
	}
	public void adiprincipio(Factura factura) {
		NodoFactura nuevo = new NodoFactura();
		nuevo.setFactura(factura);
		nuevo.setSig(getP());
		setP(nuevo);
	}
	public void adifinal(Factura factura) {
		NodoFactura nuevo = new NodoFactura();
		nuevo.setFactura(factura);
		if(getP() == null) {
			setP(nuevo);
		}else {
			NodoFactura aux = getP();
			while(aux.getSig() != null)
				aux = aux.getSig();
			aux.setSig(nuevo);
		}
	}
	public NodoFactura eliprincipio() {
		NodoFactura aux = getP();
		if(getP() != null) {
			setP(aux.getSig());
			aux.setSig(null);
		}else{
			System.out.println("Lista vacia");
                }
		return aux;
	}
	public NodoFactura elifinal() {
		NodoFactura a = getP();
		NodoFactura b = getP();
		if(getP() != null) {
			if(a.getSig() == null)
				setP(null);
			else {
				while(b.getSig() != null) {
					a = b;
					b = b.getSig();
				}
				a.setSig(null);
			}
		}else{
			System.out.println("Lista vacia");
                }
		return b;
	}
        
        //fin metodos basicos listas
        
        //metodos varios
        
        public Factura Buscar(int i){
            NodoFactura aux = getP();
            int pos = 0;
		while(aux != null) {
                        if(pos==i){
                            return aux.getFactura();
                        }
                        else{
                            aux = aux.getSig();
                            i++;
                        }
		}
            return null;    
        }
        
}
