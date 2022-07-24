/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Personal;

import java.io.Serializable;
import kollasuyo.archer.Inventario.dispositivo;

/**
 *
 * @author 
 */
public class Empleado extends Persona implements Serializable{
    
    private String diaDescanso;
    private int contDispVendidos;
    private double Pago;
    private Bonos bonos = new Bonos();

    private Logueo log;

    public Empleado(Logueo log, String Nombre, String Ci,Bonos bonos) {
        super(Nombre, Ci);
        this.log = log;
        this.bonos = bonos;
    }
    
    
    
    
    public Empleado(String diaDescanso, int contDispVendidos, double Pago, Bonos bonos, String Nombre, String Ci) {
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
            System.out.println("0");
        return bonos;
    }

    public void setBonos(Bonos bonos) {
        this.bonos = bonos;
    }
    
    public double calcularPago(){
        return Pago+ bonos.ObtenerBonos();
    }

    public Logueo getLog() {
        return log;
    }

    public void setLog(Logueo log) {
        this.log = log;
    }
    
    
    
    public void mostrar(){}
    
}
