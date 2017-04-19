/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeMenu;

import java.util.ArrayList;

/**
 *
 * @author 20142BSI0038
 */
public class Menu extends AllMenus{
    private ArrayList<AllMenus> itemMenu;
    private int tamanho;
    
    public Menu(){
        itemMenu = new ArrayList<AllMenus>();
    }
    
    public void adicionaMenuItem(AllMenus menuItem){
        itemMenu.add(menuItem);
    }
    
     public void mostraItens(){
        tamanho = itemMenu.size();
        AllMenus itens;
        for(int item=0; item<tamanho; item++){
            itens = itemMenu.get(item);
            if( itens instanceof Menu){
                ((Menu)itens).mostraItens();
            }else{
                System.out.println(itens.getDescricao());
            }
            
        }
    }
}
