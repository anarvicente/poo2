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
public class Sala {
    
    private int numero;
    private Locatario loc;
    private Andar andar;

    public Sala(int numero, Andar andar) {
        this.numero = numero;
        this.andar = andar;
    }
    
    public Andar getAndar(){
        return andar;
    }
    
    public void setLocatario(Locatario loc){
        this.loc = loc;
    }
    
    public String getLocatario(){
        return loc.getNome();
    }
    
    public void addSala(Locatario loc, Sala s){
        loc.setSala(s);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
