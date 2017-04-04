/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightitenspedido;

/**
 *
 * @author 20142BSI0038
 */
public class StatusItem {
    public enum Estado{
    CARRINHO, FECHADO, PAGO, ENVIADO, ENTREGUE
    }
    
    Estado estado;
    private boolean podeCancelar;
    private boolean compraConcluida;
    
    public StatusItem(Estado estado, boolean cancelar, boolean concluida){
        this.estado = estado;
        this.podeCancelar = cancelar;
        this.compraConcluida = concluida;
    }
    
    public boolean isPodeCancelar() {
        return podeCancelar;
    }

    public void setPodeCancelar(boolean podeCancelar) {
        this.podeCancelar = podeCancelar;
    }

    public boolean isCompraConcluida() {
        return compraConcluida;
    }

    public void setCompraConcluida(boolean compraConcluida) {
        this.compraConcluida = compraConcluida;
    }
    
}
