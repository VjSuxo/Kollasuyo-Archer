/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer.Personal;

import java.io.Serializable;

/**
 *
 * @author victo
 */
public class Jefe extends Persona implements Serializable{
    
    private Logueo log;

    public Jefe(Logueo log, String Nombre, String Ci) {
        super(Nombre, Ci);
        this.log = log;
    }
    
    public Logueo getLog() {
        return log;
    }

    public void setLog(Logueo log) {
        this.log = log;
    }
    
    
}
