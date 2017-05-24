/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posterous;

/**
 *
 * @author ana
 */
public class Twitter implements Observer{
    
    
    
    @Override
    public void update(Observable obs) {
       System.out.println("Notificando Twitter");
       System.out.println("Mensagem: "+((CaixaPublicacao) obs).getMensagem());
    }
    
    
}
