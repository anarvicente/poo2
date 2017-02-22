/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;
import java.util.Date;


/**
 *
 * @author ana
 */

public class ContaBancaria {
    private int numero;
    private  Date dataAbertura; 
    private double saldo;
    
    public void debitar(double valor){
        saldo = saldo - valor;
    }
    
    public void creditar(double valor){
        saldo = saldo + valor;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
