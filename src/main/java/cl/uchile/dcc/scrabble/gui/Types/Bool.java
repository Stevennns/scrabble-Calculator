package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;

import java.util.Objects;

public class Bool implements IOperations {
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


    /** Calcula la suma entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Add(IOperations typo) {
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations AddInt(Int typo) {
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations AddFloat(Float typo) {
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un string de Scrabble */
    @Override
    public IOperations AddString(string typo) {
        String a = typo.getString();
        String b = this.tostring().getString();
        return new string(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un Bool de Scrabble */
    @Override
    public IOperations AddBool(Bool typo) {
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations AddBin(Binary typo) {
        return null;
    }

    /** Calcula la resta entre tipo de la clase y un tipo de Scrabble */
    @Override
    public IOperations Dif(IOperations typo) {
        return null;
    }

    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations DifInt(Int typo) {
        return null;
    }

    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations DifFloat(Float typo) {
        return null;
    }

    /** Calcula la resta entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations DifBin(Binary typo) {
        return null;
    }

    /** Calcula la multiplicación entre tipo de la clase y un tipo de Scrabble */
    @Override
    public IOperations Mult(IOperations typo) {
        return null;
    }

    /** Calcula la multiplicación entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations MultInt(Int typo) {
        return null;
    }

    /** Calcula la multiplicación entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations MultFloat(Float typo) {
        return null;
    }

    /** Calcula la multiplicación entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations MultBin(Binary typo) {
        return null;
    }

    /** Calcula la division entre tipo de la clase y un tipo de Scrabble */
    @Override
    public IOperations Div(IOperations typo) {
        return null;
    }

    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations DivInt(Int typo) {
        return null;
    }

    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations DivFloat(Float typo) {
        return null;
    }

    /** Calcula la division entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations DivBin(Binary typo) {
        return null;
    }

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de Scrabble*/
    @Override
    public IOperations Or(IOperations typo) {
        return typo.OrBool(this);
    }

    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override
    public IOperations OrBool(Bool typo) {
        boolean a = this.getBool();
        boolean b = typo.getBool();
        return new Bool(a || b);
    }

    /** Opera el conector lógico "o" entre un Binary y un Bool */
    @Override
    public IOperations OrBin(Binary typo) {
        String a = typo.getNumber();
        boolean b = this.getBool();
        //int len = a.length();
        String c = a;
        if(b) {
            c = a.replaceAll("0", "1");
        }
        return new Binary(c);
    }

    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de Scrabble*/
    @Override
    public IOperations And(IOperations typo) {
        return typo.AndBool(this);
    }

    /** Opera el conector lógico "y" entre un Bool y otro Bool */
    @Override
    public IOperations AndBool(Bool typo) {
        boolean b = this.getBool();
        boolean a = typo.getBool();
        return new Bool(a && b);
    }

    /** Opera el conector lógico "y" entre un Bool y un Binary */
    @Override
    public IOperations AndBin(Binary typo) {
        String a = typo.getNumber();
        boolean b = this.getBool();
        //int len = a.length();
        String c = a;
        if(!b) {
            c = a.replaceAll("1", "0");
        }
        return new Binary(c);


    }

}
