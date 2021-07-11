package cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.Binarias;

import cl.uchile.dcc.scrabble.gui.Types.AST.Expresion;
import cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.AbstractOp;

public abstract class BinaryOp /*implements Expresion*/ extends AbstractOp {

    /** Constructor de un operador Binario */
    public BinaryOp(Expresion left, Expresion right){

        this.setLeft(left);
        this.setRight(right);
    }


}
