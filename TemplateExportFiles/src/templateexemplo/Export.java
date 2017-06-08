/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20142BSI0038
 */
public abstract class Export {
    
    public void export(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            try{                            // Isso prejudica o desempenho ? o try catch dentro do loop ?
                printLine((String)linhas);
            } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        }   
        
        try{
            save();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public abstract void printLine(String linha) throws IOException;
    public abstract void save() throws IOException;
    
}
