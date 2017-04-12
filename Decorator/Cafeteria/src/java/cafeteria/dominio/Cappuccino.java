/*
 
FestaCrianca

 */
package cafeteria.dominio;

/**
 *
 */
public class Cappuccino extends Bebida {

    
    public Cappuccino() {
        descricao = "Cappuccino";
    }

    @Override
    public double valor() {
        return 6;
    }
}
