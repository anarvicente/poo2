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
public class SalvaCliente {
    
    public static void salva(ClienteS1 cliente){
        System.out.println("Salvando cliente..");
        System.out.println(cliente.getNomeCompleto());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getEmail());
        System.out.println(cliente.getCelular());
    }
}
