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
public class VinteHandle extends AbstractSaqueHandle{

    public VinteHandle() {
        
    }

    public AbstractSaqueHandle getProximaOpcao() {
        return proximaOpcao;
    }
    
    @Override
    public String saque(String valor) {
        
        if ((Integer.parseInt(valor)-20) > 0){
            
            String v[] = valor.split("");
            int n = Integer.parseInt(v[0]);
            System.out.println(n + " notas de 10");
            int s = Integer.parseInt(valor);
            s = s-(10*n);
            valor = Integer.toString(s);
            
        }
        proximaOpcao.saque(valor);
        return valor;
    }
}
