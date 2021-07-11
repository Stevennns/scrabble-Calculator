package cl.uchile.dcc.scrabble.gui.Types.Memoria;

import cl.uchile.dcc.scrabble.gui.Types.ITipos;

public class Variable {
    ITipos a;
/** Entrega el Tipo de la variable */
    public ITipos getTipo() {
        return a;
    }

    /**Constructor de un Variable Scrabble */
    public Variable(ITipos a){
        this.a = a;
    }


}
