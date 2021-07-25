package cl.uchile.dcc.scrabble.gui.Controlador.Operaciones;

import cl.uchile.dcc.scrabble.gui.Controlador.Expresion;

public abstract class AbstractOp implements Expresion {

    private Expresion left=null;
    private Expresion right=null;

    /** Entrega el nodo izquierdo del AST */
    public Expresion getLeft() {
        return left;
    }
    /** Entrega el nodo derecho del AST */
    public Expresion getRight() {
        return right;
    }

    /**Cambia la exprecion de la izquierda */
    public void setLeft(Expresion left) {
        this.left = left;
    }
    /**Cambia la exprecion de la izquierda */
    public void setRight(Expresion right) {
        this.right = right;
    }
}
