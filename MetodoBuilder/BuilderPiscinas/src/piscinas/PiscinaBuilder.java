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
public abstract class PiscinaBuilder {
    public void buildCorpo(){
        System.out.println("Criando corpo");
    }
    public void buildTinta(){
        System.out.println("Pintando piscina de azul");
    }
    public void buildAntiVazamento(){
        System.out.println("Aplicando tratamento anti-vazamento");
    }
}
