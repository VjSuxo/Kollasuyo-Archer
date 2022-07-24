/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finanzas;

import kollasuyo.archer.Inventario.dispositivo;
import kollasuyo.archer.Personal.*;
import EstructuraDatos.*;
import java.io.Serializable;


/**
 *
 * @author victo
 */
public class Factura implements Serializable {
    private int cantDispl;
    private ListaDispositivos lsDispositivos;
    private double precioTotal;
    private int cambio;
    private Empleado empleado;
    private Cliente cliente;
    private double pago;

    public Factura(int cantDispl, ListaDispositivos lsDispositivos, double precioTotal, int cambio, Empleado empleado, Cliente cliente, double pago) {
        this.cantDispl = cantDispl;
        this.lsDispositivos = lsDispositivos;
        this.precioTotal = precioTotal;
        this.cambio = cambio;
        this.empleado = empleado;
        this.cliente = cliente;
        this.pago = pago;
    }
    

    public Factura(int cantDispl, ListaDispositivos lsDispositivos, double precioTotal, Cliente cliente,double pago) {
        this.cantDispl = cantDispl;
        this.lsDispositivos = lsDispositivos;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
        this.pago = pago;
    }

    
    
    public int getCantDispl() {
        return cantDispl;
    }

    public void setCantDispl(int cantDispl) {
        this.cantDispl = cantDispl;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ListaDispositivos getLsDispositivos() {
        return lsDispositivos;
    }

    public void setLsDispositivos(ListaDispositivos lsDispositivos) {
        this.lsDispositivos = lsDispositivos;
    }
    
    
    public double Calcular(){
        NodoDispositivo p =  this.lsDispositivos.getP();
        dispositivo disp;
        double precio=0;
        for (int i = 0; i < cantDispl; i++) {
             disp = this.lsDispositivos.Buscar(i);
             precio+=disp.getPrecioBase();
        }
        precioTotal = precio;
        return precioTotal;
    }
    
    public double PagoCliente(){
        if(pago>precioTotal){
            return pago-precioTotal;
        }
        return 0;
    }
    
    public void Bonos(){
        Bonos bonos = empleado.getBonos();
        bonos.AgregarBono(cambio,lsDispositivos);
        empleado.setBonos(bonos);
        
    }
    
    public void Mostrar(){
        System.out.println("Empleado :");
        System.out.println("---Productos----");
        lsDispositivos.mostrar();
    }
    
}
