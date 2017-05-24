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
public class AmareloSetupState implements SemaforoSetupState{

    SemaforoSetup sinal;
    TelaSemaforo amarelo;
    
    public AmareloSetupState(SemaforoSetup semaforo, TelaSemaforo tela){
        this.sinal = semaforo;
        this.amarelo = tela;
        
    }
    
    @Override
    public void proximo() {
        try {
            amarelo.exibeAmarelo();
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
