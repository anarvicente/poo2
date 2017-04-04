/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

/**
 *
 * @author 20142BSI0038
 */
public class AdapterClienteS2 extends ClienteS1 {    
    private ClienteS2 c2;
    
    public AdapterClienteS2(ClienteS2 c2){
       this.c2 = c2;
    }
    
    public String getNomeCompleto() {
        return this.c2.getNome() + " " + this.c2.getSobreNome();
    }
    
    public String getTelefone() {
        return this.c2.getDddTelefone() + this.c2.getTelefone();
    }
    
     public String getCelular() {
        return this.c2.getDddCelular() + this.c2.getCelular();
    }
    
    public String getEmail() {
        return this.c2.getEmail();
    } 
    
    
}
