/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author 20142BSI0038
 */
public class FabricaPadrao extends FabricaAbstrataBotoes{

    private JButton cancel;
    private JButton ok;
    @Override
    public JButton criaBotaoOK() {
        ok = new JButton();
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        cancel = new JButton();
        return cancel;
    }
    
}
