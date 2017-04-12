/*
 
FestaCrianca

 */
package cafeteria.dominio;

/**
 *
 */
public class Expresso extends Bebida {

    
    public Expresso() {
        descricao = "Expresso";
    }

    @Override
    public double valor() {
        return 5;
    }
}
