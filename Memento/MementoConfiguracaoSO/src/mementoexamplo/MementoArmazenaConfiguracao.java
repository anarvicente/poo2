
package mementoexamplo;

public class MementoArmazenaConfiguracao {
    
    private ConfiguracaoSO config;
    private ConfiguracaoSO state; //nao entendi isso .. 
    
    private boolean copyUSB;
    private boolean copyWifi;    
    private double copyVersaoSO;
    
    
    public MementoArmazenaConfiguracao(ConfiguracaoSO config){
        this.config = config;
        copyUSB = config.isUsb();
        copyWifi = config.isWifi();
        copyVersaoSO = config.getVersaoSO();
    }
    
    public void restoreState(){
        config.setUsb(copyUSB);
        config.setVersaoSO(copyVersaoSO);
        config.setWifi(copyWifi);
    }
    
}
