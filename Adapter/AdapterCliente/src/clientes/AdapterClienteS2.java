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
public class AdapterClienteS2 {    
    public AdapterClienteS2(ClienteS2 c2){
        c2.setNomeCompleto(c2.getNome() + " " + c2.getSobreNome());
        c2.setEmail(c2.getEmail());
        c2.setTelefone(c2.getDddTelefone() + c2.getTelefone());
        c2.setCelular(c2.getDddCelular() + c2.getCelular());
    }
}
