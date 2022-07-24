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
public class Logueo implements Serializable{
    private String usuario;
    private String contraseña;

    public Logueo(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public boolean Validar(String usr, String pas){
        System.out.println(usr+pas);
        return this.usuario.equals(usr) && this.contraseña.equals(pas);
    }
    
}
