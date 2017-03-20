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
public class Main {
    public static void main(String[] args){
        PiscinaBuilder retangular;  /* Eh assim mesmo ? */
        PiscinaDiretor diretor = new PiscinaDiretor();
        retangular = diretor.buildPiscina("retangular");
        System.out.println(retangular);
    }
}
