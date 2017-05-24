/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforo;

/**
 *
 * @author ana
 */
public class Main {
 
    
    public static void main(String[] args){
        SemaforoSetup semaforo = new SemaforoSetup();
        
        while(true){
            semaforo.estadoAtual();
            semaforo.proximo();
        }
        
       
        
        
    }
}
