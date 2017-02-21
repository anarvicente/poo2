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
public class Edificio {
    
    static final int QTD_ANDARES = 10;
    private int pos = 0;
    private String nome;
    
    private Andar[] andares = new Andar[QTD_ANDARES];

    public Edificio(String nome) {
        this.nome = nome;
    }
   
    public void setAndar(Andar andar){
        andares[pos] = andar;
        pos++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
