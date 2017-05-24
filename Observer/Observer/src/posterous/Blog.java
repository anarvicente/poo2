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
public class Blog implements Observer {

   
    
    @Override
    public void update(Observable obs) {
        System.out.println("Notificando Blog");
        System.out.println("Mensagem: "+((CaixaPublicacao) obs).getMensagem());
    }
    
}
