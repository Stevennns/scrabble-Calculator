package cl.uchile.dcc.scrabble.gui.Controlador.Memoria;

import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;

public class Variable {
    ITipos a;
/** Entrega el Tipo de la variable */
    public ITipos getTipo() {
        return a;
    }

    /**Constructor de un Variable cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    public Variable(ITipos a){
        this.a = a;
    }


}
