/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandTelevisao;

/**
 *
 * @author ana
 */
public class CanalUpCommand implements Command{
    private Televisao tv;
    
    public CanalUpCommand(Televisao tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.aumentarCanal();
    }
    
    public String toString(){
        return "Aumentar";
    }
}
