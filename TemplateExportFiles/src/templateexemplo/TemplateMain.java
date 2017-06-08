
package templateexemplo;


public class TemplateMain {

   
    public static void main(String[] args) {
      String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";               
        
      Export exportHTML = new ExportHTML();
      Export exportWORD = new ExportWORD();
      exportHTML.export(texto);
      exportWORD.export(texto);
      
    }
    
}
