/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandTelevisao;
import java.util.ArrayList;

/**
 *
 * @author ana
 */
public class Televisao {
    ArrayList listaDeCanais = new ArrayList();
    int canalIndice = 0;
    String canalCorrente;

    public String getCanalCorrente() {
        return canalCorrente;
    }
    
    public Televisao(ArrayList listaDeCanais){
        this.listaDeCanais = listaDeCanais;
    }
    
    public void aumentarCanal(){
        canalIndice++;
        canalCorrente = (String)listaDeCanais.get(canalIndice);
    }
    
    public void diminuirCanal(){
        canalIndice--;
        canalCorrente = (String)listaDeCanais.get(canalIndice);
    }    
    
}
