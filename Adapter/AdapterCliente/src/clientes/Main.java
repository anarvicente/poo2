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
public class Main {
    public static void main(String[] args) {
// TODO code application logic here 
    ClienteS2 c2 = new ClienteS2();
    AdapterClienteS2 adapter;
    c2.setCelular("1111");
    c2.setDddCelular("027");
    c2.setTelefone("3333");
    c2.setDddTelefone("027"); 
    c2.setEmail("email"); 
    c2.setNome("jose"); 
    c2.setSobreNome("Silva"); 
    adapter = new AdapterClienteS2(c2);
    SalvaCliente.salva(c2);
}
}
