/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaAutomatico;

/**
 *
 * @author 20142BSI0038
 */
public class Handle {
    public static void main(String[] args){
        AbstractSaqueHandle cem = new CemHandle();
        AbstractSaqueHandle cinquenta = new CinquentaHandle();
        AbstractSaqueHandle vinte = new VinteHandle();
        AbstractSaqueHandle cinco = new CincoHandle();
        
        
        cem.setProximaOpcao(cinquenta);
        cinquenta.setProximaOpcao(vinte);
        vinte.setProximaOpcao(cinco);
        
        cem.processHandle("95");
    }
}
