/*
 Adicional de Flores
 */
package cafeteria.dominio.adicionais;

import cafeteria.dominio.Adicionais;
import cafeteria.dominio.Bebida;

/**
 *
 */
public class Creme extends Adicionais {

    public Creme(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Creme";
}
    public double valor() {
        return 1 + bebida.valor();
    }
}
