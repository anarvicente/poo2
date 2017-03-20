/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ana
 */
public class SerializaUsuario {
   public static void Serializa(Usuario user) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();  
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "\\src\\usuario_serializado.ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(user);
        outputSerializado.close();
        
        System.out.println("Usuario Salvo");        
        System.out.println("Arquivo gerado em: " + current + 
                "\\src\\usuario_serializado.ser");
        
        
    }
   
   public static void Deserializa() throws IOException, ClassNotFoundException{
       Usuario user = null;
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + 
                    "\\src\\usuario_serializado.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (Usuario) in.readObject();
            in.close();

            System.out.println("Deserializando Usuario...");
            System.out.println("Nome: " + user.getNome());

   }
}
