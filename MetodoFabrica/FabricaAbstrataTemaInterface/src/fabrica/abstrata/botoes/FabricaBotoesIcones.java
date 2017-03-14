/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author 20142BSI0038
 */
public class FabricaBotoesIcones extends FabricaAbstrataBotoes{

    @Override
    public JButton criaBotaoOK() {
        ButtonOK ok = new ButtonOK();
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        ButtonCancel cancel = new ButtonCancel();
        return cancel; 
    }
    
}
