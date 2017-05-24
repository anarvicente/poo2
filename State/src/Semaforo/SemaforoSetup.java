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
public class SemaforoSetup {
    SemaforoSetupState currentState;
    
    VerdeSetupState verde;
    AmareloSetupState amarelo;
    VermelhoSetupState vermelho;
    
    public SemaforoSetup(TelaSemaforo tela){
        verde = new VerdeSetupState(this, tela);
        vermelho = new VermelhoSetupState(this, tela);
        amarelo = new AmareloSetupState(this, tela);
        
        setState(verde);
    }
    
    public void setState(SemaforoSetupState state){
        currentState = state;
        
    }
    
    public void proximo(){
        currentState.proximo();
    }
   
    
    public void estadoAtual() {
        currentState.estadoAtual();
    }
    
    
    public VerdeSetupState getVerde() {
        return verde;
    }

    public AmareloSetupState getAmarelo() {
        return amarelo;
    }

    public VermelhoSetupState getVermelho() {
        return vermelho;
    }
}
