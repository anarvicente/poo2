/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas;

/**
 *
 * @author ana
 */
public class FabricaBebida {
     public static Bebida getBebida(String tipoBebida){
        Object bebida = null;
        
        try{
           bebida = Class.forName(tipoBebida).newInstance();
        }catch(InstantiationException | IllegalAccessException|ClassNotFoundException  e){
                e.printStackTrace();
        }
        
        return (Bebida)bebida;
    }
}
