/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author ana
 */
public class main {
    public static void main(String[] args){
        
        Edificio ed = new Edificio("Beija-flor");
        
        Andar andar = new Andar(1, ed);
        
        Sala sala = new Sala(1,andar);
        
        Locatario joao = new Locatario("João", sala);
        
        joao.aluga(sala);
        
        sala.setLocatario(joao); // como colocar isso no método aluga do locatário ?
        
        System.out.println(sala.getLocatario());
        
        System.out.println(sala.getAndar().getNumero());
        
        System.out.println(sala.getAndar().getEdificio());
        
    }
}
