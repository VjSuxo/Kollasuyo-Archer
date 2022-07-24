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
public class NodoEmpleado implements Serializable{
    private Empleado empleado;
    private NodoEmpleado sig;
    
    NodoEmpleado() {
    	sig = null;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public NodoEmpleado getSig() {
        return sig;
    }

    public void setSig(NodoEmpleado sig) {
        this.sig = sig;
    }

 
}
