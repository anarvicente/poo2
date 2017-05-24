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
public class Canal4SetupState implements ControleSetupState {
    
    private ControleSetup canalSetup;
    
    public Canal4SetupState(ControleSetup canal){
        canalSetup = canal;
        
    }
            
            
    @Override
    public void proximo() {
       canalSetup.setState(canalSetup.getCanal5());
    }

    @Override
    public void anterior() {
        canalSetup.setState(canalSetup.getCanal7());
    }
    
    public void currentCanal(){
        System.out.println("Canal 4");
    }
    
}
