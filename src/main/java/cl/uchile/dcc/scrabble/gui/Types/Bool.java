package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Operations.Logical;
import cl.uchile.dcc.scrabble.gui.Operations.AST.Nodo;
import cl.uchile.dcc.scrabble.gui.Operations.AST.Resultado;
import cl.uchile.dcc.scrabble.gui.Operations.Logical;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;

import java.util.Objects;

public class Bool implements Type, Logical {
    private boolean bool;

    /** Constructor de la clase Booleano  */
    public Bool(boolean bool) {
        this.bool = bool;
    }
    /** Entrega el valor boolean de un objeto Bool */
    public boolean getBool() {
        return bool;
    }

    /** Cambia el valor boolean de un objeto Bool */
    public void setBool(boolean bool) {
        this.bool = bool;
    }
    public Bool toBool(){return new Bool(this.bool);}

    @Override
    /** Trasforma un objeto Bool a un objeto string */

    public string tostring() {

        return new string(Boolean.toString(this.bool));
    }


    /** Entrega el opuesto de un objeto Bool */
    public Bool Not(){
        return new Bool(!(this.getBool()));
    }

    /** Determina si un objeto es igual a otro en cuanto a su contenido y clase */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Bool) {
            Bool ob = (Bool) o;
            return ob.bool == this.bool;
        }
        return false;
    }
    /** Indica si 2 objetos tienen el mismo hashcode */
    @Override
    public int hashCode() {
        return Objects.hash(Bool.class);
    }



    /** Calcula la suma entre tipo de la clase y un string de Scrabble */

    public string AddString(string typo) {
        String a = typo.getString();
        String b = this.tostring().getString();
        return new string(a+b);
    }

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de Scrabble*/
    @Override
    public Logical Or(Logical typo) {
        return typo.OrBool(this);
    }


    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override
    public Logical OrBool(Bool typo) {
        boolean a = this.getBool();
        boolean b = (typo).bool;
        return new Bool(a || b);
    }

    /*Opera el conector lógico "o" entre un Binary y un Bool
    @Override
    public Logical OrBin(Binary typo) {
        String a = typo.getNumber();
        boolean b = this.getBool();
        //int len = a.length();
        String c = a;
        if(b) {
            c = a.replaceAll("0", "1");
        }
        return new Binary(c);
    }
*/
    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de Scrabble*/
    @Override
    public Logical And(Logical typo) {
        return typo.AndBool(this);
    }

    /** Opera el conector lógico "y" entre un Bool y otro Bool */
    @Override
    public Logical AndBool(Bool typo) {
        boolean b = this.getBool();
        boolean a = (typo).bool;
        return new Bool(a && b);
    }


    @Override
    public Logical OrBin(Binary typo) {
        String a = typo.getNumber();
        boolean b = this.getBool();
        String c = a;
        if(b) {c = a.replaceAll("0", "1");}
        return new Binary(c);
    }

    /** Opera el conector lógico "y" entre un Bool y un Binary*/
    @Override
    public Logical AndBin(Binary typo) {
        String a = typo.getNumber();
        boolean b = this.getBool();
        String c = a;
        if(!b) {c = a.replaceAll("1", "0");}
        return new Binary(c);

    }

}
