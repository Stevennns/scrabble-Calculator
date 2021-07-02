package cl.uchile.dcc.scrabble.gui.Operations.AST;



public class Add implements Operation {

    private final Operation op1;
    private final Operation op2;

    public Add(Operation a , Operation b){
        this.op1 = a;
        this.op2 = b;

    }

    @Override
    public Nodo eval() {
        return op1.eval().add(op2.eval());
    }

    @Override
    public Nodo add(Nodo eval) {
        return null;
    }
/*
    /**
     * Entregas el valor del nodo

    @Override
    public IOperations getValue() {
        return null;
    }


    @Override
    public Resultado evaluar() {
        return op1.evaluar().add(op2.evaluar());
    }

    @Override
    public Resultado add(Resultado evaluar) {
        return null;
    }*/
}
