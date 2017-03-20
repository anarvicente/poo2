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
    PiscinaBuilder builder;
    public PiscinaBuilder buildPiscina(String tipoPiscina){
        if(tipoPiscina.equalsIgnoreCase("retangular")){
            builder = new PiscinaRetangularBuilder();
            builder.buildCorpo();
            builder.buildTinta();
            builder.buildAntiVazamento();
            builder.buildEscada(); /* Pq não funciona ? */
        }else if (tipoPiscina.equalsIgnoreCase("rendonda")){
            builder = new PiscinaRedondaBuilder();
            builder.buildCorpo();
            builder.buildTinta();
            builder.buildAntiVazamento();
            
        }else if(tipoPiscina.equalsIgnoreCase("hexagonal")){
            builder = new PiscinaHexagonalBuilder();
            builder.buildCorpo();
            builder.buildTinta();
            builder.buildAntiVazamento();
        }
        return builder;
    } 
}
