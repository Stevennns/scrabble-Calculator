package cl.uchile.dcc.scrabble.gui.Controlador;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;

public class Constante implements Expresion {
    ITipos tipo;
    /** Constructor de un nodo Hoja del arbol */
    public Constante(ITipos i){this.tipo = i;}
    /** Entrega el tipo del elemento Constante*/
    public ITipos getNumber() {
        return tipo;
    }

    /** Calcula las operaciones de una expresion del AST*/
    @Override
    public ITipos calculate() {
        return this.getNumber();
    }

    /**
     * Entrega la representacion en string de java del arbol
     */
    @Override
    public String print() {
        return this.getNumber().tostring().getString();
    }


}
