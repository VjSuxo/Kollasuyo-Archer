/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finanzas;

import java.io.Serializable;

/**
 *
 * @author victo
 */
public class Finanzas implements Serializable{
    private int cantVentas;
    private double ingreso;
    private double egreso;
    private double totalEfectivo;

    public Finanzas(int cantVentas, double ingreso, double egreso, double totalEfectivo) {
        this.cantVentas = cantVentas;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.totalEfectivo = totalEfectivo;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getEgreso() {
        return egreso;
    }

    public void setEgreso(double egreso) {
        this.egreso = egreso;
    }

    public double getTotalEfectivo() {
        return totalEfectivo;
    }

    public void setTotalEfectivo(double totalEfectivo) {
        this.totalEfectivo = totalEfectivo;
    }
    
    
    
}
