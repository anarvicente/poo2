/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraobridge;

/**
 *
 * @author ana
 */
public abstract class Persistencia {
 
    PersistenciaDeDados objetopd;

    public PersistenciaDeDados getObjetoPd() {
        return objetopd;
    }

    public void setObjetoPd(PersistenciaDeDados persistir) {
        this.objetopd = persistir;
    }

    void salvar(Object o) {
        objetopd.salvar(o);
    }
}
