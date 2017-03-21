/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piscinas;

/**
 *
 * @author Ana
 */
public class PiscinaDiretor {
    private Piscina piscina;
    public Piscina buildPiscina(String tipoPiscina){
        if(tipoPiscina.equalsIgnoreCase("retangular")){
            PiscinaRetangularBuilder retangular = new PiscinaRetangularBuilder(piscina);
            retangular.buildCorpo();
            retangular.buildTinta();
            retangular.buildAntiVazamento();
            retangular.buildEscada();
            
        }else if (tipoPiscina.equalsIgnoreCase("rendonda")){
            PiscinaRedondaBuilder redonda = new PiscinaRedondaBuilder(piscina);
            redonda.buildCorpo();
            redonda.buildTinta();
            redonda.buildAntiVazamento();
            
        }else if(tipoPiscina.equalsIgnoreCase("hexagonal")){
            PiscinaHexagonalBuilder hexagonal = new PiscinaHexagonalBuilder(piscina);
            hexagonal.buildCorpo();
            hexagonal.buildTinta();
            hexagonal.buildAntiVazamento();
        }
        return piscina;
    } 
}
