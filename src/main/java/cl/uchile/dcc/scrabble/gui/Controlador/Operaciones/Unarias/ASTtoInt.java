package cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Controlador.Expresion;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;

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

    /**
     * Entrega la representacion en string de java del arbol
     */
    @Override
    public String print() {
        return " toInt( "+this.getRight().print()+") ";
    }
}
