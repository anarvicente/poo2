/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializa;

import java.io.Serializable;

/**
 *
 * @author Ana
 */
public class Mensagem implements Serializable {
    private String texto;
    
    public Mensagem(String texto){
        this.texto = texto;
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
