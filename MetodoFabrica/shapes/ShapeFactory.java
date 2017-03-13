/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author 20142bsi0038
 */
public class ShapeFactory {
    
    public static Shape getShape(String shape){
        Shape s = null;
        
        if(shape.equalsIgnoreCase("Circle")){
            s = new Circle();
        }
        
        if(shape.equalsIgnoreCase("Triangle")){
            s = new Triangle();
        }
        
        if(shape.equalsIgnoreCase("Square")){
           s = new Square();
        }
        
        return s;
    }
}
