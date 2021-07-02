package cl.uchile.dcc.scrabble.gui.Operations.AST;


import cl.uchile.dcc.scrabble.gui.Types.Type;

public interface Operation  {

    Nodo eval();

    Nodo add(Nodo eval);

    public Nodo Add(Type typo);

    public Nodo Dif(Type typo);

    public Nodo Mult(Type typo);

    public Nodo Div(Type typo);

    public Nodo Or(Type typo);

    public Nodo And(Type typo);
}
