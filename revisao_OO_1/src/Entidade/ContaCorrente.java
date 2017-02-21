/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author ana
 */
public class ContaCorrente extends Conta implements Tributavel {
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        
    }
    
    public double calculaTributos(){
       return (saldo*0.1) + saldo;
    }
}
