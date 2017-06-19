
/*
     Copia arquivos de uma pasta para outra pasta
 */
import java.io.*;
import java.nio.channels.FileChannel;

/**
 *
 * @author felipe
 */
public class MoveFile2 {

    private static File listaFiles[] = null;

    public static void main(String args[]) throws IOException, InterruptedException {
        Runnable runMoveFile1 = new MoveFileSync("ThreadA"); 
        Runnable runMoveFile2 = new MoveFileSync("ThreadB"); 

        Thread thread1 = new Thread(runMoveFile1);                            
        Thread thread2 = new Thread(runMoveFile2);                            
        thread1.start();
        thread2.start();
      
    }
    
    public static synchronized File[] getSingleTonListaFiles() throws IOException
    {        
        if(listaFiles == null){
            String current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\origem");
            listaFiles = file.listFiles();                      
        }
        return listaFiles;        
    }
    
   
    public static void copyFile(File sourceFile, File destFile) throws IOException {

        if (!sourceFile.exists()) {
            return;
        }
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();
        if (destination != null && source != null) {
            destination.transferFrom(source, 0, source.size());
        }
        if (source != null) {
            source.close();
        }
        if (destination != null) {
            destination.close();
        }
    }

   
}