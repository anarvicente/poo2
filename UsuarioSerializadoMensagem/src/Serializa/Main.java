/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializa;

import java.io.IOException;

/**
 *
 * @author Ana
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Usuario user = new Usuario("Fulano");
        Mensagem msg = new Mensagem("O que é um leilao ? Eh uma mulher chamada Leia com 1.80 de altura");
        
        SerializaUsuario.Serializa(user);
        SerializaMensagem.Serializa(msg);
        
        SerializaUsuario.Deserializa();
        SerializaMensagem.Deserializa();
        
    }
}
