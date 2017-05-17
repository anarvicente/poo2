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
public class CincoHandle extends AbstractSaqueHandle{
    
    
    private String num;
    
    public CincoHandle() {
        
    }
    
    public void setNum(String num){
        this.num = num;
    }
    
    @Override
    public String saque(String valor) {
        
        if ((Integer.parseInt(valor)-5) >= 0){
            String v[] = valor.split("");
            int n = Integer.parseInt(v[0]);
            System.out.println("1 nota de 5");
            int s = Integer.parseInt(valor);
            s = s-5;
            valor = Integer.toString(s);
        }
        
        return valor;
    }
}
