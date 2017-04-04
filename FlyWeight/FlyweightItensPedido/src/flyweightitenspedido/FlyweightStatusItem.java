/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightitenspedido;

import java.util.ArrayList;

/**
 *
 * @author Psicologia Judo
 */
public class FlyweightStatusItem {
    protected static ArrayList<StatusItem> flyweightsItens;
    
    public FlyweightStatusItem(){
        flyweightsItens = new ArrayList();
        flyweightsItens.add(new StatusItem(StatusItem.Estado.CARRINHO, true, false));
        flyweightsItens.add(new StatusItem(StatusItem.Estado.FECHADO, true, false));
        flyweightsItens.add(new StatusItem(StatusItem.Estado.PAGO, true, true));
        flyweightsItens.add(new StatusItem(StatusItem.Estado.ENVIADO, false, true));
        flyweightsItens.add(new StatusItem(StatusItem.Estado.ENTREGUE, false, true));
    }
    
    public  StatusItem get(StatusItem.Estado estado){
        switch(estado){
            case CARRINHO:
                return flyweightsItens.get(0);
            case FECHADO:
                return flyweightsItens.get(1);
            case PAGO:
                return flyweightsItens.get(2);
            case ENVIADO:
                return flyweightsItens.get(3);
            default:
                return flyweightsItens.get(4);
        }
    }
}
