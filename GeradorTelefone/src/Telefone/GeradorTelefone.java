/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telefone;

/**
 *
 * @author 20142BSI0038
 */
public enum GeradorTelefone {
    INSTANCE;
    
    private long numero = 311111111;
    
    public synchronized long getNumero(){
       return numero++;
    }
}
