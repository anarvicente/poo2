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
public class FacadeTelevisao {
    private Som som = new Som();
    private Video video = new Video();
    
    
    public void aumentarSom(){
        som.aumentar();
    }
    
    public void diminuirSom(){
        som.diminuir();
    }
    
    public void ligarTV(){
        video.ligar();
    }
    
    public void desligarTV(){
        video.desligar();
    }
    
}
