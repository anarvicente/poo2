package game.observer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class FabricaDeNotificacoes {
    String filePath;
    
    FabricaDeNotificacoes() {
        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image criarImagensNotificacao(String tipo) throws SlickException{
        Image statusJogo = null;
        if(tipo.equalsIgnoreCase("gameover")){    
            statusJogo = new Image(filePath + "\\src\\main\\java\\gameover.png");
        }else{
            statusJogo = new Image(filePath + "\\src\\main\\java\\ganhou.png");
        }
        return statusJogo;
    }

   

}
