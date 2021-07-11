package cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Types.AST.Expresion;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;

public class ASTtoFloat extends UnaryOp {
    /**Constructor de Nodo que trasforma a Float*/
    public ASTtoFloat(Expresion op) {
        super(op);
    }

    /** Transforma el resultado de la expresion a Binario*/
    @Override
    public ITipos calculate() {
        return this.getRight().calculate().toFloat();
    }
}
