/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaentrada;

/**
 *
 * @author ana
 */
public class Main {
    
    
    public static void main(String[] args){
        
        MembroEmail email = new MembroEmail();
        MembroWhatsApp whatsapp = new MembroWhatsApp();
        CaixaEntradaGrupo cx = new CaixaEntradaGrupo();
        
        cx.addObserver(email);
        cx.addObserver(whatsapp);
        
        
        cx.setNovaMensagem("Oii");
        
        
    }
}
