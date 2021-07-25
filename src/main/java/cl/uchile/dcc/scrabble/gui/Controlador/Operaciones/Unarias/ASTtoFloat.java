package cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Controlador.Expresion;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;

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

    /**
     * Entrega la representacion en string de java del arbol
     */
    @Override
    public String print() {
        return "toFloat( "+this.getRight().print()+") ";
    }
}
