package cl.uchile.dcc.scrabble.gui.Operations.AST;


import cl.uchile.dcc.scrabble.gui.Types.Type;

public class Nodo implements Operation{

    /** Entregas el valor del nodo
    public Operation getValue(){

    }*/
    /** Evalua la operacion del nodo
    //public Resultado evaluar();

    //Resultado add(Resultado evaluar);*/
    public Nodo(Type hoja){

    }

    @Override
    public Nodo eval() {
        return this;
    }

    @Override
    public Nodo add(Nodo eval) {
        return null;
    }

}
