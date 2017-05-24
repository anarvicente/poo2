/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforo;

import visao.TelaSemaforo;

/**
 *
 * @author ana
 */
public class Main {
 
    
    public static void main(String[] args){
        TelaSemaforo telaSemaforo = new TelaSemaforo();
        telaSemaforo.setVisible(true);
        SemaforoSetup semaforo = new SemaforoSetup(telaSemaforo);
        
        
        while(true){
            semaforo.estadoAtual();
            semaforo.proximo();
        }
        
       
        
        
    }
}
