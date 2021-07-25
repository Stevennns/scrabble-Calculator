package cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Binarias;

import cl.uchile.dcc.scrabble.gui.Controlador.Expresion;
import cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.AbstractOp;

public abstract class BinaryOp /*implements Expresion*/ extends AbstractOp {

    /** Constructor de un operador Binario */
    public BinaryOp(Expresion left, Expresion right){

        this.setLeft(left);
        this.setRight(right);
    }



}
