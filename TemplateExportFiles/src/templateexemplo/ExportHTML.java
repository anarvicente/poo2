/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 *
 * @author 20142BSI0038
 */
public class ExportHTML extends Export{
    
    BufferedWriter out = null;
    XWPFDocument document;
    FileOutputStream out1 = null;

    public ExportHTML() {
        String current = null;
        try {
            current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\" + "index.html");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            out = new BufferedWriter(fw);
            out.write("<HTML><BODY>");
        } catch (IOException ex) {
            Logger.getLogger(ExportHTML.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public void printLine(String linha) throws IOException {
        out.write("<BR>" + linha);
    }

    
    @Override
    public void save() throws IOException {
        out.write("</BODY>");
        out.write("</HTML>");
        out.close();
    }
    
    
}
