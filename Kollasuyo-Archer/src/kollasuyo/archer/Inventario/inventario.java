/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Inventario;

import EstructuraDatos.ListaDispositivos;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import kollasuyo.archer.Persistencia;

/**
 *
 * @author victo
 */
public class inventario implements Serializable{
    
    private ListaDispositivos ls ;

    public inventario() {
        
    }
    
    public inventario(ListaDispositivos ls) {
        this.ls = ls;
    }
    
    public void Guardar(){
    
        Persistencia p = new Persistencia();
        p.guardar((ListaDispositivos)ls,"inventario");
        
    }
    
    public void Recuperar(){
        Persistencia p = new Persistencia();
        try {
            ls =(ListaDispositivos) p.recuperar("inventario");
            
        } catch (IOException ex) {
            Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ListaDispositivos getLs() {
        return ls;
    }

    public void setLs(ListaDispositivos ls) {
        this.ls = ls;
    }
    
 
    
    
    
    
    
    
}
