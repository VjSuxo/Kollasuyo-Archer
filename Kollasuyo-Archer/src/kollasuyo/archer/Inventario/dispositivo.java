/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Inventario;

import java.io.Serializable;

/**
 *
 * @author victo
 */
public class dispositivo implements Serializable{
    private String marca;
    private String gama;
    private String nombre;
    private int cantidad;
    private double precioBase;

    public dispositivo(String marca, String gama, int cantidad, double precioBase,String nombre) {
        this.marca = marca;
        this.gama = gama;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    public void mostrar(){}
    
}
