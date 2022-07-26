/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraDatos;

import java.io.Serializable;
import kollasuyo.archer.Personal.Empleado;

/**
 *
 * @author victo
 */
public class ListaEmpleado implements Serializable{
    
     private NodoEmpleado p;
     public ListaEmpleado() {
		p = null;
	}
	public NodoEmpleado getP() {
		return p;
	}
	public void setP(NodoEmpleado p) {
		this.p = p;
	}
	public int nroNodos() {
		int c = 0;
		NodoEmpleado aux = getP();
		while(aux != null) {
			c++;
			aux = aux.getSig();
		}
		return c;
	}
	public void mostrar() {
		NodoEmpleado aux = getP();
		while(aux != null) {
			aux.getEmpleado().mostrar();
			aux = aux.getSig();
		}
	}
	public void adiprincipio(Empleado elem) {
		NodoEmpleado nuevo = new NodoEmpleado();
		nuevo.setEmpleado(elem);
		nuevo.setSig(getP());
		setP(nuevo);
	}
	public void adifinal(Empleado elem) {
		NodoEmpleado nuevo = new NodoEmpleado();
		nuevo.setEmpleado(elem);
		if(getP() == null) {
			setP(nuevo);
		}else {
			NodoEmpleado aux = getP();
			while(aux.getSig() != null)
				aux = aux.getSig();
			aux.setSig(nuevo);
		}
	}
	public NodoEmpleado eliprincipio() {
		NodoEmpleado aux = getP();
		if(getP() != null) {
			setP(aux.getSig());
			aux.setSig(null);
		}else{
			System.out.println("Lista vacia");
                }
		return aux;
	}
	public NodoEmpleado elifinal() {
		NodoEmpleado a = getP();
		NodoEmpleado b = getP();
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
        public NodoEmpleado eliminar(String ci) {
		NodoEmpleado aux = getP();
                while(aux!=null){
                    if(aux.getSig()!=null){
                        Empleado dp = aux.getSig().getEmpleado();
                        if(dp.getCi().equals(ci)){
                         aux.setSig(aux.getSig().getSig());
                        
                        }
                    }
                    else{
                        aux.setSig(null);
                    }
                    
                    aux = aux.getSig();
                }
                return aux;
	}
        
        public void Modificar(String ci,Empleado empleado){
            NodoEmpleado aux = getP();
            int pos = 0;
		while(aux != null) {
                    Empleado emp = aux.getEmpleado();
                    System.out.println(emp.getCi());
                        if(emp.getCi().equals(ci)){
                            System.out.println("modificando empleado");
                            aux.setEmpleado(empleado);
                            break;
                        }
                        else{
                            System.out.println("no se encontro empleado para la modificacion");
                        }
                    aux = aux.getSig();
		}
                
        }
        
        
	
        
}
