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
public class FactoryPatternDemo {
    
   public static void main(String[] args){
    Shape s;
   
    s = ShapeFactory.getShape("Circle");
   
    s.draw();
   
   }
   
   
}
