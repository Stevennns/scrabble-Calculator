package cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.Binarias;

import cl.uchile.dcc.scrabble.gui.Types.AST.Expresion;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;

public class Resta extends BinaryOp{
    /** Constructor de la operacion Binaria Restar */
    public Resta(Expresion left, Expresion right) {
        super(left, right);
    }

    /** Calcula las operaciones de una expresion del AST*/
    @Override
    public ITipos calculate() {
        return this.getLeft().calculate().Dif(this.getRight().calculate());
    }



}
