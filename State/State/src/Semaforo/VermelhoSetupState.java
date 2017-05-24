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
public class VermelhoSetupState implements SemaforoSetupState {
    SemaforoSetup sinal;
    
    public VermelhoSetupState(SemaforoSetup semaforo){
        this.sinal = semaforo;
    }
    
    @Override
    public void proximo() {
        try {
            Thread.sleep(30000);
            sinal.setState(sinal.getVerde());
        } catch (InterruptedException ex) {
            Logger.getLogger(VermelhoSetupState.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void estadoAtual() {
        System.out.println("Vermelho");
    }
    
    
}
