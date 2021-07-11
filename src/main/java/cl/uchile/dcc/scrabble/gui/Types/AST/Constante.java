package cl.uchile.dcc.scrabble.gui.Types.AST;
import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;
import cl.uchile.dcc.scrabble.gui.Types.string;

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






}
