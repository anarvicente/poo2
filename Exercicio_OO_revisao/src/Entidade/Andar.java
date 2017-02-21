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
public class Andar {
    private int numero;
    private Sala[] salas = new Sala[20];
    private Edificio ed;
    private int pos = 0;

    public Andar(int numero, Edificio ed) {
        this.numero = numero;
        this.ed = ed;
    }
    
    public void setEdificio(String nome){
        ed.setNome(nome);
    }
    
    public String getEdificio(){
        return ed.getNome();
    }
    
    
    public void setSala(Sala s){
        salas[pos] = s;
    }
    
    public Sala getSala(int local){
        return salas[local]; 
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
