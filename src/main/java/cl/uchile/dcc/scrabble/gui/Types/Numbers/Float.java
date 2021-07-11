package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;
import cl.uchile.dcc.scrabble.gui.Types.string;

import java.util.Objects;

public class Float implements ITipos {
    double number;

    /** Constructor de la clase Binary  */
    public Float(double number) {
        this.number = number;
    }

    /** Entrega el valor del Float */
    public double getNumber() {
        return number;
    }

    /** Cambia el valor del numero de Float a otro */
    public void setNumber(double number) {
        this.number = number;
    }

    /** Transforma el objeto Float a uno string de Scrabble */
    public string tostring() {
        String s = Double.toString(this.number);
        return new string(s);
    }
    /** Niega la expresion */
    @Override
    public Bool Not() {
        return null;
    }


    /** Determina si un objeto es igual a otro en cuanto a su contenido y clase */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Float) {
            var ob = (Float) o;
            Double n = ob.getNumber();
            return n == this.number;

        }
        return false;
    }

    /** Indica si 2 objetos tienen el mismo hashcode */
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    /** Calcula la suma entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public ITipos Add(ITipos typo) {
        return typo.AddFloat(this);
    }

    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    @Override
    public ITipos AddInt(Int typo) {
        int a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    @Override
    public ITipos AddFloat(Float typo) {
        double a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a+b);
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
    public Float AddBin(Binary typo) {
        int a = typo.toInt().getNumber();
        double b = this.getNumber();
        return new Float(a+b);
    }

    /** Calcula la resta entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public ITipos Dif(ITipos typo) {
        return typo.DifFloat(this);
    }

    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    @Override
    public ITipos DifInt(Int typo) {
        int a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a-b);
    }

    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    @Override
    public ITipos DifFloat(Float typo) {
        double a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a-b);

    }

    /** Calcula la resta entre tipo de la clase y un Binary de Scrabble */
    @Override
    public ITipos DifBin(Binary typo) {

        int a = typo.toInt().getNumber();
        double b = this.getNumber();
        return new Float(a-b);
    }

    /** Calcula la multiplicación entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public ITipos Mult(ITipos typo) {
        return typo.MultFloat(this);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Int de Scrabble */
    @Override
    public ITipos MultInt(Int typo) {
        int a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Float de Scrabble */
    @Override
    public ITipos MultFloat(Float typo) {
        double a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Binary de Scrabble */
    @Override
    public ITipos MultBin(Binary typo) {
        int a = typo.toInt().getNumber();
        double b = this.getNumber();
        return new Float(a*b);
    }

    /** Calcula la division entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public ITipos Div(ITipos typo) {
        return typo.DivFloat(this);
    }

    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    @Override
    public ITipos DivInt(Int typo) {
        int a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a/b);
    }

    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    @Override
    public ITipos DivFloat(Float typo) {
        double a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a/b);
    }

    /** Calcula la division entre tipo de la clase y un Binary de Scrabble */
    @Override
    public ITipos DivBin(Binary typo) {
        int a = typo.toInt().getNumber();
        double b = this.getNumber();
        return new Float(a/b);
    }

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de Scrabble */
    @Override
    public ITipos Or(ITipos typo) {
        return null;
    }

    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override
    public ITipos OrBool(Bool typo) {
        return null;
    }

    /** Opera el conector lógico "o" entre un Binary y un Bool */
    @Override
    public ITipos OrBin(Binary typo) {
        return null;
    }

    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de Scrabble */
    @Override
    public ITipos And(ITipos typo) {
        return null;
    }

    /** Opera el conector lógico "y" entre un Bool y otro Bool */
    @Override
    public ITipos AndBool(Bool typo) {
        return null;
    }

    /** Opera el conector lógico "y" entre un Bool y un Binary */
    @Override
    public ITipos AndBin(Binary typo) {
        return null;
    }
    /** Transforma el tipo a uno Float */
    @Override
    public Float toFloat() {
        return this;
    }
    /** Transforma el tipo a uno Binary */
    @Override
    public Binary toBinary() {
        Int a = this.toInt();
        return a.toBinary();
    }
    /** Transforma el tipo a uno Int */
    @Override
    public Int toInt() {
        return new Int((int)this.getNumber());
    }

}