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
        Usuario fulano = new Usuario("Fulano");
        Usuario beltrano = new Usuario("Beltrano");
        Mensagem msg = new Mensagem("O que é um leilao ? Eh uma mulher chamada Leila com 1.80 de altura");
        
        fulano.enviarMensagem(beltrano, msg);
        beltrano.receberMensagem(fulano, msg);
        
        System.out.println(msg.getTexto());
        
        SerializaUsuario.Serializa(fulano);
        SerializaUsuario.Serializa(beltrano);
        SerializaMensagem.Serializa(msg);
        
        SerializaUsuario.Deserializa();
        SerializaMensagem.Deserializa();
        
    }
}
