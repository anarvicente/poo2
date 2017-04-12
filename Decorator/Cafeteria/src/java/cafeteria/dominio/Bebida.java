/*

 */
package cafeteria.dominio;

/**
 *
 
 */
public abstract class Bebida {
   
    
    String descricao = "Bebida desconhecida";
          
    
    public String getDescricao() {
        return descricao;
    }

    public abstract double valor();
}
