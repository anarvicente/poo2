/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeMenu;

/**
 *
 * @author 20142BSI0038
 */
public class Main {
   
    public static void main(String[] args){
        
       Menu menu = new Menu();
       MenuItem item = new MenuItem();
       MenuItem item2 = new MenuItem();
       MenuItem item3 = new MenuItem();
       Menu mousse = new Menu();
       
       item2.setDescricao("Limao");
       item3.setDescricao("Maracuja");
       
       item.setDescricao("picole");
       menu.setDescricao("Sobremesa");
       mousse.setDescricao("Mousse");
       
       mousse.adicionaMenuItem(item3);
       mousse.adicionaMenuItem(item2);
       
       menu.adicionaMenuItem(item);
       menu.adicionaMenuItem(mousse);
       
       menu.mostraItens();
       
    }
}
