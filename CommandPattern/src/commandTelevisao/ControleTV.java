/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandTelevisao;

import java.util.ArrayList;

/**
 *
 * @author ana
 */
public class ControleTV {
    private ArrayList listaDeComandos = new ArrayList();
    
    private Command upCommand, downCommand;
    
    public ArrayList getListaDeComandos(){
        return this.listaDeComandos;
    }
    
    public void setComandos(Command upCommand, Command downCommand){
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }
    
    public void aumentar(){
        this.listaDeComandos.add(upCommand);
        this.upCommand.execute();
    }
    
    public void diminuir(){
        this.listaDeComandos.add(downCommand);
        this.downCommand.execute();
    }
}
