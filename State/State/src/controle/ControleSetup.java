/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author 20142BSI0038
 */
public class ControleSetup {
    
    ControleSetupState currentState;
    
    Canal4SetupState canal4;
    Canal5SetupState canal5;
    Canal6SetupState canal6;
    Canal7SetupState canal7;
    
    
    public ControleSetup(){
        canal4 = new Canal4SetupState(this);
        canal5 = new Canal5SetupState(this);
        canal6 = new Canal6SetupState(this);
        canal7 = new Canal7SetupState(this);
        
        setState(canal4);
    }
    
    public void setState(ControleSetupState state){
        currentState = state;
        
    }
    
    public void proximo(){
        currentState.proximo();
    }
    
    public void anterior(){
        currentState.anterior();
    }
    
    public void canalAtual() {
        currentState.currentCanal();
    }
    
    public Canal4SetupState getCanal4() {
        return canal4;
    }

    public Canal5SetupState getCanal5() {
        return canal5;
    }

    public Canal6SetupState getCanal6() {
        return canal6;
    }

    public Canal7SetupState getCanal7() {
        return canal7;
    }
    
}
