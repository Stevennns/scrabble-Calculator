package cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Controlador.Expresion;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;


public class ASTtostring extends UnaryOp{

    /**Constructor de Nodo que trasforma a String de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    public ASTtostring(Expresion op) {
        super(op);
    }

    /**Transforma el resultado de la expresion a Binario*/
    @Override
    public ITipos calculate() {
        return this.getRight().calculate().tostring();
    }

    /**
     * Entrega la representacion en string de java del arbol
     */
    @Override
    public String print() {
        return "toString( "+this.getRight().print()+") ";
    }


}
