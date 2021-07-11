package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;

import java.util.Objects;
import java.util.Objects.*;

public class Bool implements ITipos {
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
    @Override
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
    public ITipos Add(ITipos typo) {
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    @Override
    public ITipos AddInt(Int typo) {
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    @Override
    public ITipos AddFloat(Float typo) {
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un string de Scrabble */
    @Override
    public ITipos AddString(string typo) {
        String a = typo.getString();
        String b = this.tostring().getString();
        return new string(a+b);
    }



    /** Calcula la suma entre tipo de la clase y un Binary de Scrabble */
    @Override
    public ITipos AddBin(Binary typo) {
        return null;
    }

    /** Calcula la resta entre tipo de la clase y un tipo de Scrabble */
    @Override
    public ITipos Dif(ITipos typo) {
        return null;
    }

    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    @Override
    public ITipos DifInt(Int typo) {
        return null;
    }

    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    @Override
    public ITipos DifFloat(Float typo) {
        return null;
    }

    /** Calcula la resta entre tipo de la clase y un Binary de Scrabble */
    @Override
    public ITipos DifBin(Binary typo) {
        return null;
    }

    /** Calcula la multiplicación entre tipo de la clase y un tipo de Scrabble */
    @Override
    public ITipos Mult(ITipos typo) {
        return null;
    }

    /** Calcula la multiplicación entre tipo de la clase y un Int de Scrabble */
    @Override
    public ITipos MultInt(Int typo) {
        return null;
    }

    /** Calcula la multiplicación entre tipo de la clase y un Float de Scrabble */
    @Override
    public ITipos MultFloat(Float typo) {
        return null;
    }

    /** Calcula la multiplicación entre tipo de la clase y un Binary de Scrabble */
    @Override
    public ITipos MultBin(Binary typo) {
        return null;
    }

    /** Calcula la division entre tipo de la clase y un tipo de Scrabble */
    @Override
    public ITipos Div(ITipos typo) {
        return null;
    }

    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    @Override
    public ITipos DivInt(Int typo) {
        return null;
    }

    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    @Override
    public ITipos DivFloat(Float typo) {
        return null;
    }

    /** Calcula la division entre tipo de la clase y un Binary de Scrabble */
    @Override
    public ITipos DivBin(Binary typo) {
        return null;
    }

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de Scrabble*/
    @Override
    public ITipos Or(ITipos typo) {
        return typo.OrBool(this);
    }

    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override
    public ITipos OrBool(Bool typo) {
        boolean a = this.getBool();
        boolean b = typo.getBool();
        return new Bool(a || b);
    }

    /** Opera el conector lógico "o" entre un Binary y un Bool */
    @Override
    public ITipos OrBin(Binary typo) {
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
    public ITipos And(ITipos typo) {
        return typo.AndBool(this);
    }

    /** Opera el conector lógico "y" entre un Bool y otro Bool */
    @Override
    public ITipos AndBool(Bool typo) {
        boolean b = this.getBool();
        boolean a = typo.getBool();
        return new Bool(a && b);
    }

    /** Opera el conector lógico "y" entre un Bool y un Binary */
    @Override
    public ITipos AndBin(Binary typo) {
        String a = typo.getNumber();
        boolean b = this.getBool();
        //int len = a.length();
        String c = a;
        if(!b) {
            c = a.replaceAll("1", "0");
        }
        return new Binary(c);


    }
    /** Transforma el tipo a uno Float */
    @Override
    public Float toFloat() {
        return null;
    }
    /** Transforma el tipo a uno Binary */
    @Override
    public Binary toBinary() {
        return null;
    }
    /** Transforma el tipo a uno Int */
    @Override
    public Int toInt() {
        return null;
    }

}
