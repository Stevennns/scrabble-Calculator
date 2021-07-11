package cl.uchile.dcc.scrabble.gui.Types.AST;

import cl.uchile.dcc.scrabble.gui.Types.ITipos;



public interface Expresion {
     Expresion left=null;
     Expresion right=null;
     Expresion root=null;
    /** Calcula las operaciones de una expresion del AST*/
    public ITipos calculate();



}
