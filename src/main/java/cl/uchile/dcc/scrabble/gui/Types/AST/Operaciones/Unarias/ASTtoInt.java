package cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Types.AST.Expresion;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;

public class ASTtoInt extends UnaryOp{
    /**Constructor de Nodo que trasforma a Int*/
    public ASTtoInt(Expresion op) {
        super(op);
    }

    /**Transforma el resultado de la expresion a Binario*/
    @Override
    public ITipos calculate() {
        return this.getRight().calculate().toInt();
    }
}
