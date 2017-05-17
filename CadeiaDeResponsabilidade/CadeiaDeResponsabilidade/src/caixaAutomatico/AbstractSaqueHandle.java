/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaAutomatico;

/**
 *
 * @author ana
 */
public abstract class AbstractSaqueHandle {
    
    public AbstractSaqueHandle proximaOpcao;
    
    public AbstractSaqueHandle(){
    
    }
    
    
    public void setProximaOpcao(AbstractSaqueHandle proximaOpcao) {
        this.proximaOpcao = proximaOpcao;
    }
    
    public AbstractSaqueHandle getProximaOpcao(){
        return this.proximaOpcao;
    }
    
    public void processHandle(String num){
         num = saque(num);

    }
    
    public abstract String saque(String valor);
}
