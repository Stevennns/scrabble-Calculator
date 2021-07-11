package cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Types.AST.Expresion;
import cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.AbstractOp;

public abstract class UnaryOp extends AbstractOp {

    /** Constructor de un operador unario */
    public UnaryOp(Expresion op){
        this.setRight(op);
    }

}
