/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Personal;

import java.io.Serializable;
import kollasuyo.archer.Inventario.dispositivo;
import EstructuraDatos.*;

/**
 *
 * @author victo
 */
public class Bonos implements Serializable{
    private dispositivo[] dispo;
    private double bonosAcumulados=0;
    

    public Bonos() {
        System.out.println("Bonos acumulados :"+bonosAcumulados);
    }
    
    public void AgregarBono(int cant,ListaDispositivos lsDisp){
        double precio = 0;
        for (int i = 0; i < cant; i++) {
            precio += lsDisp.Buscar(i).getPrecioBase()*0.5;
        }
        bonosAcumulados+=precio;
        
    }
    
    public void setBonos(double bon){
        this.bonosAcumulados = bon;
    }
    
    public double ObtenerBonos(){
        System.out.println("0");
        return bonosAcumulados;
    }
    
}
