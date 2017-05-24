/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforo;

import java.util.logging.Level;
import java.util.logging.Logger;
import visao.TelaSemaforo;

/**
 *
 * @author ana
 */
public class VerdeSetupState implements SemaforoSetupState{

    SemaforoSetup sinal;
    TelaSemaforo verde;
    
    public VerdeSetupState(SemaforoSetup semaforo, TelaSemaforo tela){
        this.sinal = semaforo;
        this.verde = tela;
        

    }
    
    @Override
    public void proximo() {
        try {
            verde.exibeVerde();
            Thread.sleep(2000);
            sinal.setState(sinal.getAmarelo());
        } catch (InterruptedException ex) {
            Logger.getLogger(VerdeSetupState.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void estadoAtual() {
        System.out.println("Verde");
    }
    
    
    
}
