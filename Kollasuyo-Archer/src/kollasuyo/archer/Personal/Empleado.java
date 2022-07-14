/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Personal;

import kollasuyo.archer.Inventario.dispositivo;

/**
 *
 * @author 
 */
public class Empleado extends Persona{
    
    private String diaDescanso;
    private int contDispVendidos;
    private double Pago;
    private Bonos bonos;

    public Empleado(String diaDescanso, int contDispVendidos, double Pago, Bonos bonos, String Nombre, int Ci) {
        super(Nombre, Ci);
        this.diaDescanso = diaDescanso;
        this.contDispVendidos = contDispVendidos;
        this.Pago = Pago;
        this.bonos = bonos;
    }

    public String getDiaDescanso() {
        return diaDescanso;
    }

    public void setDiaDescanso(String diaDescanso) {
        this.diaDescanso = diaDescanso;
    }

    public int getContDispVendidos() {
        return contDispVendidos;
    }

    public void setContDispVendidos(int contDispVendidos) {
        this.contDispVendidos = contDispVendidos;
    }

    public double getPago() {
        return Pago;
    }

    public void setPago(double Pago) {
        this.Pago = Pago;
    }

    public Bonos getBonos() {
        return bonos;
    }

    public void setBonos(Bonos bonos) {
        this.bonos = bonos;
    }
    
    public double calcularPago(){
        return Pago+ bonos.Calcular();
    }
    
    
    
}
