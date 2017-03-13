/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author 20142bsi0038
 */
public class PizzaFactory {
    public static Pizza createPizza(String tipoPizza){
        Object pizza = null;
        
        try{
           pizza = Class.forName(tipoPizza).newInstance();
        }catch(InstantiationException | IllegalAccessException|ClassNotFoundException  e){
                e.printStackTrace();
        }
        return (Pizza)pizza;
        
    }
}
