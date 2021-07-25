package cl.uchile.dcc.scrabble.gui.Modelo.Numbers;


import cl.uchile.dcc.scrabble.gui.Modelo.Bool;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;
import cl.uchile.dcc.scrabble.gui.Modelo.string;

import java.util.Objects;

public class Int implements ITipos {
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

    /** Transforma el objeto Int a uno Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    public Float toFloat() {
        //String stringNum =this.number.toString();
        Double F = Double.valueOf(this.number);
        return new Float(F);
    }

    /** Transforma el objeto Int a uno Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    public Binary toBinary() {
        String i = Integer.toBinaryString(this.number);
        return new Binary(i);

    }
    /** Transforma el tipo a uno Int */
    @Override
    public Int toInt() {
        return this;
    }

    /** Transforma el objeto Int a uno string de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    public string tostring() {
        String s = Integer.toString(this.number);
        return new string(s);
    }
    /** Niega la expresion */
    @Override
    public ITipos Not() {
        return null;
    }


    /** Calcula la suma entre tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public ITipos Add(ITipos typo) {
         return typo.AddInt(this);
    }

    /** Calcula la suma entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public Int AddInt(Int typo){
        int a = this.getNumber();
        int b = typo.getNumber();
        return new Int(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public ITipos AddFloat(Float typo){
        double a = typo.getNumber();
        int b = this.getNumber();
        return new Float(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un string de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public string AddString(string typo){
        String a = typo.getString();
        String b = this.tostring().getString();
        return new string(a+b);
    }



    /** Calcula la suma entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public ITipos AddBin(Binary typo){
        int a = typo.toInt().getNumber();
        int b = this.getNumber();
        Int c = new Int(a+b);
        return c.toBinary();
    }

    /** Calcula la resta entre tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos Dif(ITipos typo){
        return typo.DifInt(this);
    }

    /** Calcula la resta entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DifInt(Int typo){
        int a = typo.getNumber();
        int b = this.getNumber();
        return new Int(a-b);
    }

    /** Calcula la resta entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DifFloat(Float typo){
        double a = typo.getNumber();
        int b = this.getNumber();
        return new Float(a-b);
    }

    /** Calcula la resta entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DifBin(Binary typo){
        int a = typo.toInt().getNumber();
        int b = this.getNumber();
        Int c = new Int(a-b);
        return c.toBinary();
    }

    /** Calcula la multiplicación entre tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos Mult(ITipos typo){
        return typo.MultInt(this);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos MultInt(Int typo){
        int a = typo.getNumber();
        int b = this.getNumber();
        return new Int(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos MultFloat(Float typo){
        double a = typo.getNumber();
        int b = this.getNumber();
        return new Float(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos MultBin(Binary typo){
        int a = typo.toInt().getNumber();
        int b = this.getNumber();
        Int c = new Int(a*b);
        return c.toBinary();
    }

    /** Calcula la division entre tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos Div(ITipos typo){
        return typo.DivInt(this);
    }

    /** Calcula la division entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DivInt(Int typo){
        int a = typo.getNumber();
        int b = this.getNumber();
        double c = (a/b);
        return new Int((int)c);
    }

    /** Calcula la division entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DivFloat(Float typo){
        double a = typo.getNumber();
        int b = this.getNumber();
        double c = (a/b);
        return new Float(c);
    }

    /** Calcula la division entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DivBin(Binary typo){
        int a = typo.toInt().getNumber();
        int b = this.getNumber();
        Int c = new Int((int)(a/b));
        return c.toBinary();
    }

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos Or(ITipos typo){return null;}

    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override public ITipos OrBool(Bool typo){return null;}

    /** Opera el conector lógico "o" entre un Binary y un Bool */
    @Override public ITipos OrBin(Binary typo){return null;}

    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos And(ITipos typo){return null;}

    /** Opera el conector lógico "y" entre un Bool y otro Bool */
    @Override public ITipos AndBool(Bool typo){return null;}

    /** Opera el conector lógico "y" entre un Bool y un Binary */
    @Override public ITipos AndBin(Binary typo){return null;}


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

