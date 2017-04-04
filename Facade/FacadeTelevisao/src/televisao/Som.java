/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisao;

/**
 *
 * @author ana
 */
public class Som {
    
    private int volume = 0;
    
    public void ligar(){
        System.out.println("som ligado");
    }
    
    public void desligar(){
        System.out.println("som desligado");
    }
    
    public void emitirSom(){
        System.out.println("Bah tum tss");
    }
    
    public void aumentar(){
        this.volume = this.volume + 1;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void diminuir(){
        this.volume = this.volume - 1;
    }

}
