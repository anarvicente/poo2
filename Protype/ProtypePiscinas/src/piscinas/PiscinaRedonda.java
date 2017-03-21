/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piscinas;

/**
 *
 * @author ana
 */
public class PiscinaRedonda implements Piscina, Cloneable {
    
    public PiscinaRedonda(){
        System.out.println("Criando piscina redonda");
    }
    
    public Object clone(){
       Object obj = null;
       try{
           obj = super.clone();
       }catch(CloneNotSupportedException e){
           e.printStackTrace();
       }
       
       return obj;
   }
}
