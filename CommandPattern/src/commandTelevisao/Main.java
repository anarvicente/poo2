/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandTelevisao;

import java.util.ArrayList;

/**
 *
 * @author ana
 */
public class Main {
    
    public static void main(String[] args){
        
        ArrayList listaDeCanais = new ArrayList();
        
        listaDeCanais.add("record");
        listaDeCanais.add("globo");
        listaDeCanais.add("tv cultura");
        listaDeCanais.add("sbt");
        listaDeCanais.add("band");
        listaDeCanais.add("mix tv");
        
        Televisao tv = new Televisao(listaDeCanais);
        
        ControleTV controle = new ControleTV();
        
        controle.setComandos(new CanalUpCommand(tv), new CanalDownCommand(tv));
        
        controle.aumentar();
        controle.aumentar();
        controle.diminuir();
        controle.aumentar();
        
        
        for(int i =0; i < controle.getListaDeComandos().size(); i++){
            System.out.println(controle.getListaDeComandos().get(i).toString()); 
        }
        
    }
    
}
