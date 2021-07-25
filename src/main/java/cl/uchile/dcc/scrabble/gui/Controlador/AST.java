package cl.uchile.dcc.scrabble.gui.Controlador;

import cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.*;
import cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Binarias.*;
import cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Unarias.*;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;


public class AST{

    private Expresion root;

    /** Entrega la raiz del arbol */
    public Expresion getRoot() {
        return root;
    }

    /** Entrega la raiz del arbol */
    public void setRoot(Expresion e) {
        this.root = e;
    }


    /** Constructor de AST */
    public AST(AbstractOp arbol) {
        this.root = arbol;
    }

    /*

    __________________________________________________________________________________________________
                                        Operaciones Binarias
    __________________________________________________________________________________________________

    */
    /** Añade una expresion al arbol */
    public void add(AbstractOp operacion){
        operacion.setLeft(this.root);
        this.root = operacion;
    }
    public void add(Constante operacion){
        //operacion.setLeft(this.root);
        this.root = operacion;
    }
    /** Añade una suma al arbol */
    public void addSuma(Constante c){
        AbstractOp a = new Suma(null,c);
        this.add(a);

    }
    /** Añade una resta al arbol */
    public void addResta(Constante c){
        AbstractOp a = new Resta(null,c);
        this.add(a);
    }
    /** Añade una division al arbol */
    public void addDivision(Constante c){
        AbstractOp a = new Division(null,c);
        this.add(a);

    }
    /** Añade una multiplicacion al arbol */
    public void addMult(Constante c){
        AbstractOp a = new Mult(null,c);
        this.add(a);

    }
    /** Añade una operacion 'y' al arbol */
    public void addAND(Constante c){
        AbstractOp a = new AND(null,c);
        this.add(a);

    }
    /** Añade una operacion 'o' al arbol */
    public void addOR(Constante c){
        AbstractOp a = new OR(null,c);
        this.add(a);
    }
    /*

    __________________________________________________________________________________________________
                                        Operaciones Unarias
    __________________________________________________________________________________________________

    */
    /**Transforma la expresion a un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    public void toInt(){
        this.root= new ASTtoInt(this.root);
    }
    /**Transforma la expresion a un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    public void toFloat(){
        this.root= new ASTtoFloat(this.root);
    }
    /**Transforma la expresion a un Binarty de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    public void toBinary(){
        this.root= new ASTtoBinary(this.root);
    }
    /**Transforma la expresion a un Binarty de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    public void tostring(){
        this.root= new ASTtostring(this.root);
    }
    /**Niega la expresion de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    public void Not(){
        this.root= new ASTNot(this.root);
    }


    /**
     * Calcula las operaciones de una expresion del AST
     */

    public ITipos calculate() {
        return this.getRoot().calculate();
    }
    public String print(){return this.getRoot().print();}
}
