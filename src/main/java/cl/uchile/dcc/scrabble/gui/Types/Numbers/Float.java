package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.Bool;

import cl.uchile.dcc.scrabble.gui.Types.string;

import java.util.Objects;

public class Float implements Number {
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
    @Override
    public string tostring() {
        String s = Double.toString(this.number);
        return new string(s);
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

    public Number Add(Number typo) {
        return typo.AddFloat(this);
    }

    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    @Override
    public Float AddInt(Int typo) {
        int a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a+b);
    }

    @Override
    public Float toFloat() {
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    @Override
    public Float AddFloat(Float typo) {
        double a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un string de Scrabble */
    @Override
    public string AddString(string typo) {
        String a = typo.getString();
        String b = this.tostring().getString();
        return new string(a+b);
    }



    /** Calcula la resta entre tipo de la clase y otro tipo de Scrabble */

    public Number Dif(Number typo) {
        return typo.DifFloat(this);
    }

    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    @Override
    public Float DifInt(Int typo) {
        int a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a-b);
    }


    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    @Override
    public Float DifFloat(Float typo) {
        double a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a-b);

    }


    /** Calcula la multiplicación entre tipo de la clase y otro tipo de Scrabble */

    public Number Mult(Number typo) {
        return typo.MultFloat(this);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Int de Scrabble */
    @Override
    public Float MultInt(Int typo) {
        int a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Float de Scrabble */
    @Override
    public Float MultFloat(Float typo) {
        double a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a*b);
    }

    /** Calcula la division entre tipo de la clase y otro tipo de Scrabble */

    public Number Div(Number typo) {
        return typo.DivFloat(this);
    }

    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    @Override
    public Float DivInt(Int typo) {
        int a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a/b);
    }

    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    @Override
    public Float DivFloat(Float typo) {
        double a = typo.getNumber();
        double b =this.getNumber();
        return new Float((double)a/b);
    }



}