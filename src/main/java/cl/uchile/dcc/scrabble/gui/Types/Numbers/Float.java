package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.IOperations;
import cl.uchile.dcc.scrabble.gui.Types.string;

import java.util.Objects;

public class Float implements IOperations {
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
    public IOperations Add(IOperations typo) {
        return typo.AddFloat(this);
    }

    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations AddInt(Int typo) {
        int a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations AddFloat(Float typo) {
        double a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a+b);
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

    /** Calcula la resta entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Dif(IOperations typo) {
        return typo.DifFloat(this);
    }

    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations DifInt(Int typo) {
        int a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a-b);
    }

    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations DifFloat(Float typo) {
        double a = typo.getNumber();
        double b = this.getNumber();
        return new Float(a-b);

    }

    /** Calcula la resta entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations DifBin(Binary typo) {
        return null;
    }

    /** Calcula la multiplicación entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Mult(IOperations typo) {
        return typo.MultFloat(this);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations MultInt(Int typo) {
        int a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations MultFloat(Float typo) {
        double a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations MultBin(Binary typo) {
        return null;
    }

    /** Calcula la division entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Div(IOperations typo) {
        return typo.DivFloat(this);
    }

    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations DivInt(Int typo) {
        int a = typo.getNumber();
        double b =this.getNumber();
        return new Float(a/b);
    }

    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations DivFloat(Float typo) {
        double a = typo.getNumber();
        double b =this.getNumber();
        return new Float((double)a/b);
    }

    /** Calcula la division entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations DivBin(Binary typo) {
        return null;
    }

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Or(IOperations typo) {
        return null;
    }

    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override
    public IOperations OrBool(Bool typo) {
        return null;
    }

    /** Opera el conector lógico "o" entre un Binary y un Bool */
    @Override
    public IOperations OrBin(Binary typo) {
        return null;
    }

    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations And(IOperations typo) {
        return null;
    }

    /** Opera el conector lógico "y" entre un Bool y otro Bool */
    @Override
    public IOperations AndBool(Bool typo) {
        return null;
    }

    /** Opera el conector lógico "y" entre un Bool y un Binary */
    @Override
    public IOperations AndBin(Binary typo) {
        return null;
    }

}