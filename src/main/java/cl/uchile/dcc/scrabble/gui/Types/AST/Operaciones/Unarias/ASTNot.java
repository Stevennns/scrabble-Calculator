package cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Types.AST.Expresion;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;

public class ASTNot extends UnaryOp{

    /** Constructor de un operador unario de negacion */
    public ASTNot(Expresion op) {
        super(op);
    }

    /** Calcula las operaciones de una expresion del AST*/
    @Override
    public ITipos calculate() {
        return this.getRight().calculate().Not();
    }
}
