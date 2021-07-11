package cl.uchile.dcc.scrabble.gui.Types.AST.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Types.AST.Expresion;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;


public class ASTtostring extends UnaryOp{

    /**Constructor de Nodo que trasforma a String de Scrabble*/
    public ASTtostring(Expresion op) {
        super(op);
    }

    /**Transforma el resultado de la expresion a Binario*/
    @Override
    public ITipos calculate() {
        return this.getRight().calculate().tostring();
    }


}
