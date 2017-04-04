/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightitenspedido;

import java.util.ArrayList;

/**
 *
 * @author 20142BSI0038
 */
public class Pedido {
    private ArrayList<Item> itens;
    
    public Pedido(){
        itens = new ArrayList<>();
    }
    
    public void addItemPedido(Item item){
        itens.add(item);
    }
    
}
