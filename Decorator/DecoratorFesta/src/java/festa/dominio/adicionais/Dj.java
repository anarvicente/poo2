/*
 Adicional de Flores
 */
package festa.dominio.adicionais;

import festa.dominio.DecoracoesAdicionais;
import festa.dominio.Festa;

/**
 *
 * @author felipe
 */
public class Dj extends DecoracoesAdicionais {

    //Festa festa;

    public Dj(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Dj";
}
public double cost() {
        return 1500 + festa.cost();
    }
}
