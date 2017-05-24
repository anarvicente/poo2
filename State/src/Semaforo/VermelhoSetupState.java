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
public class VermelhoSetupState implements SemaforoSetupState {
    SemaforoSetup sinal;
    TelaSemaforo vermelho;
            
            
    public VermelhoSetupState(SemaforoSetup semaforo, TelaSemaforo tela){
        this.sinal = semaforo;
        this.vermelho = tela;
    }
    
    @Override
    public void proximo() {
        try {
            vermelho.exibeVermelho();
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
