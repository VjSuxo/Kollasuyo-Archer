/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraDatos;

import java.io.Serializable;

/**
 *
 * @author victo
 */
public class ListaMarcas implements Serializable {
     private NodoMarca p;
	   public ListaMarcas() {
		p = null;
	}
	public NodoMarca getP() {
		return p;
	}
	public void setP(NodoMarca p) {
		this.p = p;
	}
	public int nroNodos() {
		int c = 0;
		NodoMarca aux = getP();
		while(aux != null) {
			c++;
			aux = aux.getSig();
		}
		return c;
	}
	public void mostrar() {
		NodoMarca aux = getP();
		while(aux != null) {
			aux.Mostrar();
			aux = aux.getSig();
		}
	}
	public void adiprincipio(String marca) {
		NodoMarca nuevo = new NodoMarca();
		nuevo.setMarca(marca);
		nuevo.setSig(getP());
		setP(nuevo);
	}
	public void adifinal(String marca) {
		NodoMarca nuevo = new NodoMarca();
		nuevo.setMarca(marca);
		if(getP() == null) {
			setP(nuevo);
		}else {
			NodoMarca aux = getP();
			while(aux.getSig() != null)
				aux = aux.getSig();
			aux.setSig(nuevo);
		}
	}
	public NodoMarca eliprincipio() {
		NodoMarca aux = getP();
		if(getP() != null) {
			setP(aux.getSig());
			aux.setSig(null);
		}else{
			System.out.println("Lista vacia");
                }
		return aux;
	}
	public NodoMarca elifinal() {
		NodoMarca a = getP();
		NodoMarca b = getP();
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
	
        
        public String Buscar(int i){
            NodoMarca aux = getP();
            int pos = 0;
		while(aux != null) {
                        if(pos==i){
                            return aux.getMarca()+"+"+aux.getCantidadVentas();
                        }
                        else{
                            aux = aux.getSig();
                            i++;
                        }
		}
            return null;    
        }
        
}
