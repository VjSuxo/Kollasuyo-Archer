/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kollasuyo.archer;
import EstructuraDatos.ListaDispositivos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 *
 * @author victo
 */
public class Persistencia implements Serializable{
    public Persistencia() {
        
    }

    public void guardar(Object a1,String nombre) {
        try {
            System.out.println("emepzando a guardar ....");
            ObjectOutputStream w1 = new ObjectOutputStream(new FileOutputStream("datos\\"+nombre+".dat"));
            w1.writeObject(a1);
            w1.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public Object  recuperar(String nombre) throws IOException, ClassNotFoundException {
        System.out.println("Obteniendo datos ....");
        ObjectInputStream r1 = new ObjectInputStream(new FileInputStream("datos\\"+nombre+".dat"));
        if(r1!=null){
            Object  a1 = (Object) r1.readObject();
            r1.close();
            return (a1);
        }
        else{
            System.out.println("No se encontro nada");
            return null;
        }
        
        
    }
}
