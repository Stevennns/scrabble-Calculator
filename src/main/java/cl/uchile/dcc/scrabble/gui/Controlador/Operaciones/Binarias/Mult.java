package cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Binarias;

import cl.uchile.dcc.scrabble.gui.Controlador.Expresion;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;

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

    /**
     * Entrega la representacion en string de java del arbol
     */
    @Override
    public String print() {
        return " ("+this.getLeft().print()+" * "+this.getRight().print()+") ";
    }
}
