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
public class SerializaMensagem {
       public static void Serializa(Mensagem msg) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();  
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "\\src\\mensagem_serializada.ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(msg);
        outputSerializado.close();
        
        System.out.println("Mensagem Salva");        
        System.out.println("Arquivo gerado em: " + current + 
                "\\src\\mensagem_serializada.ser");
        
        
    }
   
   public static void Deserializa() throws IOException, ClassNotFoundException{
       Mensagem msg = null;
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + 
                    "\\src\\mensagem_serializada.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            msg = (Mensagem) in.readObject();
            in.close();

            System.out.println("Deserializando Mensagem...");
            System.out.println("Mensagem: " + msg.getTexto());

   }
}
