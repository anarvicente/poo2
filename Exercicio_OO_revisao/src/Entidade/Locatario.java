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
public class Locatario {
    static final int QTD_SALAS = 20;
    
    private String nome;
    private Sala[] salas = new Sala[QTD_SALAS];  // max 20 salas;
    private int pos = 1;

    public Locatario(String nome, Sala s) {
        this.nome = nome;
        salas[0] = s;
    }
    
    public Sala getSala(int pos) {
        return salas[pos];
    }

    public void setSala(Sala s) {
        if(pos < QTD_SALAS){
            salas[pos] = s;
            pos++;
        }else{
            System.out.println("Número de salas esgotada!");
        }
    }
    
    public void removerSala(int local){
       salas[local] = null;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void aluga(Sala s){
        System.out.println("A sala "+ s.getNumero() + " está alugada!");
        
    }
}
