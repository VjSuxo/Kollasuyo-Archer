/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraDatos;

import java.io.Serializable;
import java.util.Scanner;
import kollasuyo.archer.Inventario.dispositivo;

/**
 *
 * @author victo
 */
public class ListaDispositivos implements Serializable{
    private NodoDispositivo p;
	public ListaDispositivos() {
		p = null;
	}
	public NodoDispositivo getP() {
		return p;
	}
	public void setP(NodoDispositivo p) {
		this.p = p;
	}
	public int nroNodos() {
		int c = 0;
		NodoDispositivo aux = getP();
		while(aux != null) {
			c++;
			aux = aux.getSig();
		}
		return c;
	}
	public void mostrar() {
		NodoDispositivo aux = getP();
		while(aux != null) {
			aux.getDispo().mostrar();
			aux = aux.getSig();
		}
	}
	public void adiprincipio(dispositivo elem) {
		NodoDispositivo nuevo = new NodoDispositivo();
		nuevo.setDispo(elem);
		nuevo.setSig(getP());
		setP(nuevo);
	}
	public void adifinal(dispositivo elem) {
		NodoDispositivo nuevo = new NodoDispositivo();
		nuevo.setDispo(elem);
		if(getP() == null) {
			setP(nuevo);
		}else {
			NodoDispositivo aux = getP();
			while(aux.getSig() != null)
				aux = aux.getSig();
			aux.setSig(nuevo);
		}
	}
	public NodoDispositivo eliprincipio() {
		NodoDispositivo aux = getP();
		if(getP() != null) {
			setP(aux.getSig());
			aux.setSig(null);
		}else
			System.out.println("Lista vacia");
		return aux;
	}
	public NodoDispositivo elifinal() {
		NodoDispositivo a = getP();
		NodoDispositivo b = getP();
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
		}else
			System.out.println("Lista vacia");
		return b;
	}
	
        public dispositivo Buscar(int i){
            NodoDispositivo aux = getP();
            int pos = 0;
		while(aux != null) {
                        if(pos==i){
                            return aux.getDispo();
                        }
                        else{
                            aux = aux.getSig();
                            i++;
                        }
		}
            return null;    
        }
		
	
}
