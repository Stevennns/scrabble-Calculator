package cl.uchile.dcc.scrabble.gui.Types.Numbers;


import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.IOperations;
import cl.uchile.dcc.scrabble.gui.Types.string;

import java.util.Objects;

public class Int implements IOperations {
    int number;

    /** Constructor de la clase Int  */
    public Int(int number) {
        this.number = number;
    }

    /** Entrega el valor del Int */
    public int getNumber() {
        return number;
    }

    /** Cambia el valor del numero de Float a otro */
    public void setNumber(int number) {
        this.number = number;
    }

    /** Transforma el objeto Int a uno Float de Scrabble */
    public Float toFloat() {
        //String stringNum =this.number.toString();
        Double F = Double.valueOf(this.number);
        return new Float(F);
    }

    /** Transforma el objeto Int a uno Binary de Scrabble */
    public Binary toBinary() {
        String i = Integer.toBinaryString(this.number);
        return new Binary(i);

    }

    /** Transforma el objeto Int a uno string de Scrabble */
    public string tostring() {
        String s = Integer.toString(this.number);
        return new string(s);
    }

    /** Calcula la suma entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Add(IOperations typo) {
         return typo.AddInt(this);
    }

    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    @Override
    public Int AddInt(Int typo){
        int a = this.getNumber();
        int b = typo.getNumber();
        return new Int(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations AddFloat(Float typo){
        double a = typo.getNumber();
        int b = this.getNumber();
        return new Float(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un string de Scrabble */
    @Override
    public string AddString(string typo){
        String a = typo.getString();
        String b = this.tostring().getString();
        return new string(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un Bool de Scrabble */
    @Override
    public IOperations AddBool(Bool typo){return null;}

    /** Calcula la suma entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations AddBin(Binary typo){
        int a = typo.toInt().getNumber();
        int b = this.getNumber();
        Int c = new Int(a+b);
        return c.toBinary();
    }

    /** Calcula la resta entre tipo de la clase y otro tipo de Scrabble */
    @Override public IOperations Dif(IOperations typo){
        return typo.DifInt(this);
    }

    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    @Override public IOperations DifInt(Int typo){
        int a = typo.getNumber();
        int b = this.getNumber();
        return new Int(a-b);
    }

    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    @Override public IOperations DifFloat(Float typo){
        double a = typo.getNumber();
        int b = this.getNumber();
        return new Float(a-b);
    }

    /** Calcula la resta entre tipo de la clase y un Binary de Scrabble */
    @Override public IOperations DifBin(Binary typo){
        int a = typo.toInt().getNumber();
        int b = this.getNumber();
        Int c = new Int(a-b);
        return c.toBinary();
    }

    /** Calcula la multiplicación entre tipo de la clase y otro tipo de Scrabble */
    @Override public IOperations Mult(IOperations typo){
        return typo.MultInt(this);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Int de Scrabble */
    @Override public IOperations MultInt(Int typo){
        int a = typo.getNumber();
        int b = this.getNumber();
        return new Int(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Float de Scrabble */
    @Override public IOperations MultFloat(Float typo){
        double a = typo.getNumber();
        int b = this.getNumber();
        return new Float(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Binary de Scrabble */
    @Override public IOperations MultBin(Binary typo){
        int a = typo.toInt().getNumber();
        int b = this.getNumber();
        Int c = new Int(a*b);
        return c.toBinary();
    }

    /** Calcula la division entre tipo de la clase y otro tipo de Scrabble */
    @Override public IOperations Div(IOperations typo){
        return typo.DivInt(this);
    }

    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    @Override public IOperations DivInt(Int typo){
        int a = typo.getNumber();
        int b = this.getNumber();
        double c = (a/b);
        return new Int((int)c);
    }

    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    @Override public IOperations DivFloat(Float typo){
        double a = typo.getNumber();
        int b = this.getNumber();
        double c = (a/b);
        return new Float(c);
    }

    /** Calcula la division entre tipo de la clase y un Binary de Scrabble */
    @Override public IOperations DivBin(Binary typo){
        int a = typo.toInt().getNumber();
        int b = this.getNumber();
        Int c = new Int((int)(a/b));
        return c.toBinary();
    }

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de Scrabble */
    @Override public IOperations Or(IOperations typo){return null;}

    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override public IOperations OrBool(Bool typo){return null;}

    /** Opera el conector lógico "o" entre un Binary y un Bool */
    @Override public IOperations OrBin(Binary typo){return null;}

    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de Scrabble */
    @Override public IOperations And(IOperations typo){return null;}

    /** Opera el conector lógico "y" entre un Bool y otro Bool */
    @Override public IOperations AndBool(Bool typo){return null;}

    /** Opera el conector lógico "y" entre un Bool y un Binary */
    @Override public IOperations AndBin(Binary typo){return null;}


    /** Determina si un objeto es igual a otro en cuanto a su contenido y clase */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Int) {
            var ob = (Int) o;
            int n = ob.getNumber();
            return n == this.number;

        }
        return false;
    }

    /** Indica si 2 objetos tienen el mismo hashcode */
        @Override
        public int hashCode () {
            return Objects.hash(number);
        }

}

