/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforo;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ana
 */
public class AmareloSetupState implements SemaforoSetupState{

    SemaforoSetup sinal;
    
    
    public AmareloSetupState(SemaforoSetup semaforo){
        this.sinal = semaforo;
        
    }
    
    @Override
    public void proximo() {
        try {
            Thread.sleep(3000);
            sinal.setState(sinal.getVermelho());
        } catch (InterruptedException ex) {
            Logger.getLogger(AmareloSetupState.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void estadoAtual() {
        System.out.println("Amarelo");
    }

    
}
