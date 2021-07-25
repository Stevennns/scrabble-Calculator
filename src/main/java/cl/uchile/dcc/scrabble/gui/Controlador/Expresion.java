package cl.uchile.dcc.scrabble.gui.Controlador;

import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;



public interface Expresion {
     Expresion left=null;
     Expresion right=null;
     Expresion root=null;
    /** Calcula las operaciones de una expresion del AST*/
    public ITipos calculate();

    /** Entrega la representacion en string de java del arbol*/
    String print();

// Suma(7,Resta(3,5))


}
