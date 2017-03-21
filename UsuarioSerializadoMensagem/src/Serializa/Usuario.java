/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializa;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ana
 */
public class Usuario implements Serializable{
    private String nome;
    ArrayList<Mensagem> msgEnviadas = new ArrayList();
    ArrayList<Mensagem> msgRecebidas = new ArrayList();

    
    public Usuario(String nome){
        this.nome = nome;
    }
    
    public void enviarMensagem(Usuario user, Mensagem msg){
        user.msgEnviadas.add(msg);
        System.out.println("Mensagem enviada para " + user.getNome());
    }
    
    public void receberMensagem(Usuario user, Mensagem msg){
        user.msgRecebidas.add(msg);
        System.out.println("Mensagem recebida de " + user.getNome());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
       
    
}
