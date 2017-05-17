/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posterous;


import java.util.ArrayList;

/**
 *
 * @author ana
 */
public class Observable {
    
    private ArrayList<Observer> monitores = new ArrayList();
    
    public void addObserver(Observer obs){
        this.monitores.add(obs);
    }
    
    public void deleteObserver(Observer obs){
        this.monitores.remove(obs);
    }
    
    public void notifyObserver(){
        for(Observer obs: monitores){
            obs.update(this);
        }
    }
}
