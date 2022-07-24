/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer;

import java.io.Serializable;
import static java.lang.Double.max;

/**
 *
 * @author victo
 */
public class GenradorCodigoRegistro implements Serializable{
    
    private String codigo;
    private String tipo;
    

    public GenradorCodigoRegistro(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String generarCodigo(){
        String c="";
        for (int i = 0; i < 10; i++) {
            int n = (int)(Math.random()*((9-1)+1))+1;             
            c+=n;
        }
        codigo = c;        
        return c;
    }
    
    
}
