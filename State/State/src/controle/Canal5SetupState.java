/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author 20142BSI0038
 */
public class Canal5SetupState implements ControleSetupState{
    
    
    
    private ControleSetup canalSetup;
    
    public Canal5SetupState(ControleSetup canal){
        canalSetup = canal;
        
    }
            
            
    @Override
    public void proximo() {
       canalSetup.setState(canalSetup.getCanal6());
    }

    @Override
    public void anterior() {
        canalSetup.setState(canalSetup.getCanal4());
    }
    
    public void currentCanal(){
        System.out.println("Canal 5");
    }
    
}
