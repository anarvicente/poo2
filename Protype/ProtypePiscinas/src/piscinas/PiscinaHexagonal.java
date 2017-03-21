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
public class PiscinaHexagonal implements Piscina,Cloneable{
    
    public PiscinaHexagonal(){
       System.out.println("Cria piscina hexagonal");
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
