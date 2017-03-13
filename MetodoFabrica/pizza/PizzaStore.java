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
public class PizzaStore {
    
    public static Pizza orderPizza(String tipoPizza){
        Pizza p = PizzaFactory.createPizza(tipoPizza);
        return p;
    }
    
    public static void main(String[] args){
        Pizza p = PizzaStore.orderPizza("pizza.CheesePizza");
        p.bake();
    
    }
}
