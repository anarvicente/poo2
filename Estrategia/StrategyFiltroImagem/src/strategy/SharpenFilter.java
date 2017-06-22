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
public class SharpenFilter extends StrategyFilter {

    public static final float[] SHARPEN3x3 = { // sharpening filter kernel
    0.f, -1.f,  0.f,
   -1.f,  5.f, -1.f,
    0.f, -1.f,  0.f
    };
 
    
    
    @Override
    public BufferedImageOp applyFilter(){
        return new ConvolveOp(new Kernel(3, 3, SHARPEN3x3),
                                ConvolveOp.EDGE_NO_OP,
                                null);
        
    }
    
}
