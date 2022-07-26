/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Personal;

import java.io.Serializable;

/**
 *
 * 
 */
public class Persona implements Serializable{
    
    private String Nombre;
    private String Ci;
    private String numero;
    public Persona(String Nombre, String Ci) {
        this.Nombre = Nombre;
        this.Ci = Ci;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }
    
    
}
