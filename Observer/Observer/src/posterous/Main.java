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
public class Main {
    
    
    public static void main(String[] args){
        
        Blog blog = new Blog();
        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();
        CaixaPublicacao cx = new CaixaPublicacao();
        
        cx.addObserver(blog);
        cx.addObserver(facebook);
        cx.addObserver(twitter);
        
        
        cx.setNovaMensagem("Oii");
        
        
    }
}
