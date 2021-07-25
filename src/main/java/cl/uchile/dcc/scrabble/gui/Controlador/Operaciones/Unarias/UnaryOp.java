package cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Controlador.Expresion;
import cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.AbstractOp;

public abstract class UnaryOp extends AbstractOp {

    /** Constructor de un operador unario */
    public UnaryOp(Expresion op){
        this.setRight(op);
    }



}
