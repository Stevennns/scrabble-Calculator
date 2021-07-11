package cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.Binarias;

import cl.uchile.dcc.scrabble.gui.Types.AST.Expresion;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;

public class Mult extends BinaryOp{
    /** Constructor de la operacion Binaria Multiplicar */
    public Mult(Expresion left, Expresion right) {
        super(left, right);
    }

    /** Calcula las operaciones de una expresion del AST*/
    @Override
    public ITipos calculate() {
        return this.getLeft().calculate().Mult(this.getRight().calculate());
    }
}
