/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Personal;

import kollasuyo.archer.Inventario.dispositivo;

/**
 *
 * @author victo
 */
class Bonos {
    private dispositivo[] dispo;
    private double Precio;

    public Bonos(dispositivo[] dispo, int Precio) {
        this.dispo = dispo;
        this.Precio = Precio;
    }
    
    public void AgregarBono(dispositivo[] dispo,int cant){
        double bono = 0;
        for (int i = 0; i < cant; i++) {
            bono += dispo[i].getPrecio()*0.5;
        }
        
        Precio = bono;
    }
    
    public double Calcular(){
        return Precio;
    }
    
}
