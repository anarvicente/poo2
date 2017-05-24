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
public class SemaforoSetup {
    SemaforoSetupState currentState;
    
    VerdeSetupState verde;
    AmareloSetupState amarelo;
    VermelhoSetupState vermelho;
    
    public SemaforoSetup(){
        verde = new VerdeSetupState(this);
        vermelho = new VermelhoSetupState(this);
        amarelo = new AmareloSetupState(this);
        
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
