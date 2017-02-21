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
public class Main {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();
        
        cc.setSaldo(40.50);
        
        System.out.println(cc.calculaTributos());
            
    }
}
