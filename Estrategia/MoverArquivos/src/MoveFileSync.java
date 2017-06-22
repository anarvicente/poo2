
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20142BSI0038
 */
public class MoveFileSync implements Runnable {
    
    private static File listaFiles[] = null;
    private String name;
    
    public static int counter = -1;
    
    public MoveFileSync(String name){
        this.name = name;
    }
    
    public synchronized int nextArquivo(){
        counter++;
        return counter;
    }
    
    @Override
    public void run() {
        
        final long startTime = System.currentTimeMillis();// tempo incial
        try {
            listaFiles = MoveFile2.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles                
        } catch (IOException ex) {
            Logger.getLogger(MoveFileSync.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Iniciando copiar de arquivos");
        
        int counter = nextArquivo();
        for( ; counter < listaFiles.length; counter = nextArquivo()) {
            File origem = new File(listaFiles[counter].getAbsolutePath());
            String destinationFile = listaFiles[counter].getAbsolutePath();
            destinationFile = destinationFile.replace("origem", "destino") + name;
            try {
                MoveFile2.copyFile(origem, new File(destinationFile));
            } catch (IOException ex) {
                Logger.getLogger(MoveFileSync.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }      
        
        final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
        System.out.println("Time:" + elapsedTimeMillis);

    }
    
}
