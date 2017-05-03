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
public class ImplementacaoPersistencia extends Persistencia {
    
    
    ImplementacaoPersistencia(PersistenciaDeDados implementor) {
        super.setObjetoPd(implementor);
    }
    
    public void salvar(Object object) {
        super.salvar(object);
    }
}
