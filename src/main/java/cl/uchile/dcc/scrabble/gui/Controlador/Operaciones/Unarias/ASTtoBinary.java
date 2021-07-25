package cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Unarias;

import cl.uchile.dcc.scrabble.gui.Controlador.Expresion;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;

public class ASTtoBinary extends UnaryOp{
/**Constructor de Nodo que trasforma a Binario*/
    public ASTtoBinary(Expresion op) {
        super(op);
    }

    /** Calcula las operaciones de una expresion del AST*/
    @Override
    public ITipos calculate() {
        return this.getRight().calculate().toBinary();
    }

    /**
     * Entrega la representacion en string de java del arbol
     */
    @Override
    public String print() {
        return "toBinary( "+this.getRight().print()+") ";
    }


}
