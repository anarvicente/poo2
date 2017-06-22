/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

/**
 *
 * @author 20142BSI0038
 */
public  class LowPassFilter extends StrategyFilter {
     public static final float[] BLUR3x3 = {
        0.1f, 0.1f, 0.1f,    // low-pass filter kernel
        0.1f, 0.2f, 0.1f,
        0.1f, 0.1f, 0.1f
    };
    

    @Override
    public BufferedImageOp applyFilter(){
         return new ConvolveOp(new Kernel(3, 3, BLUR3x3),
                                ConvolveOp.EDGE_NO_OP,
                                null);
    }
    
}
