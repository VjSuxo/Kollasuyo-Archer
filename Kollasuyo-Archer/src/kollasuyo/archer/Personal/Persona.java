/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Personal;

/**
 *
 * 
 */
public class Persona {
    
    private String Nombre;
    private int Ci;

    public Persona(String Nombre, int Ci) {
        this.Nombre = Nombre;
        this.Ci = Ci;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCi() {
        return Ci;
    }

    public void setCi(int Ci) {
        this.Ci = Ci;
    }
    
    
}
