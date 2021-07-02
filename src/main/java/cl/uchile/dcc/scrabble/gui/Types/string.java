package cl.uchile.dcc.scrabble.gui.Types;


import cl.uchile.dcc.scrabble.gui.Operations.AST.Nodo;
import cl.uchile.dcc.scrabble.gui.Operations.AST.Resultado;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;

import java.util.Objects;

public class string extends AbstractType implements Type {
    private String s = "";


    /** Constructor de la clase string  */
    public string(String s){
        this.s = s;
    }

    /** Entrega el valor del string como String de java */
    public String getString() {
        return s;
    }

    /** Cambia el String de string a otro */
    public void setString(String s) {
        this.s = s;
    }

    @Override
    public string tostring(){
        return new string(s);
    }

    /** Calcula la suma entre tipo de la clase y otro tipo de Scrabble */

    public Type Add(Type typo) {

        return typo.AddString(this);
    }

    /** Calcula la suma entre tipo de la clase y un string de Scrabble*/
    @Override
    public string AddString(string typo){
        String b = this.getString();
        String a = typo.getString();
       return new string(a+b);
    }


    /** Determina si un objeto es igual a otro en cuanto a su contenido y clase */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof string) {
            var o = (string) obj;
            return o.s.equals(this.s);
        }
        return false;
    }

    /** Indica si 2 objetos tienen el mismo hashcode */
    @Override
    public int hashCode() {
        return Objects.hash(s);
    }

/*
    /**
     * Entregas el valor del nodo

    @Override
    public IOperations getValue() {
        return null;
    }

    /**
     * Evalua la operacion del nodo
     * @return

    @Override
    public Resultado evaluar() {
        return null;
    }
  */
}
