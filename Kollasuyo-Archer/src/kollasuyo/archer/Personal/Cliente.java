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
public class Cliente extends Persona{
    
    private String Nacionalidad;

    public Cliente(String nacionalidad, String Nombre, int Ci) {
        super(Nombre, Ci);
        this.Nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
    
}
