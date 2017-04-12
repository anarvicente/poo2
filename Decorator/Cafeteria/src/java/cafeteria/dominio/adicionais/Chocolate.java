/*
 */
package cafeteria.dominio.adicionais;

import cafeteria.dominio.Adicionais;
import cafeteria.dominio.Bebida;

/**
 *
 */
public class Chocolate extends Adicionais {

    

    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate";
}
public double valor() {
        return 2 + bebida.valor();
    }
}
