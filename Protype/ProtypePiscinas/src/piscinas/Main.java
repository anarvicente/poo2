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
        Piscina piscina;
        PiscinaDiretor diretor = new PiscinaDiretor();
        piscina = diretor.buildPiscina("retangular");
    }
}
