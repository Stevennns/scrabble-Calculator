package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Operations.BinaryOperatios;
import cl.uchile.dcc.scrabble.gui.Operations.Logical;
import cl.uchile.dcc.scrabble.gui.Types.AbstractType;
import cl.uchile.dcc.scrabble.gui.Types.Bool;

import cl.uchile.dcc.scrabble.gui.Types.string;

import java.util.Objects;

public class Binary extends AbstractType implements Number, BinaryOperatios, Logical {
        private String number;

    /** Constructor de la clase Binary  */
    public Binary(String number){
        this.number = number;
    }

    /** Entrega el valor del String de un objeto Binary */
    public String getNumber() {
        return number;
    }

    /** Cambia el valor del String de un objeto Binary */
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    /** Transforma el objeto Binary a uno Int */
    public Int toInt(){
        int i =Integer.parseInt(this.number, 2);
        return new Int(i);
    }
    @Override
    /** Transforma el objeto Binary a uno Float */
    public Float toFloat(){
        double i =(double)Integer.parseInt(this.number, 2);
        return new Float(i);
    }
    @Override
    public Binary toBinary() {
        return new Binary(number);
    }
    /** Determina si un objeto es igual a otro en cuanto a su contenido y clase */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Binary) {
            var o = (Binary) obj;
            StringBuilder tb = new StringBuilder(o.getNumber());
            StringBuilder ob = new StringBuilder(this.getNumber());
            StringBuilder cero;
            int diferencia =Math.abs(tb.length() - ob.length());

            if(tb.length() < ob.length()){
                for(int i = 0;i<diferencia;i++){
                    cero = new StringBuilder("0");
                    tb=(cero.append(tb));
                }
            }
            if(tb.length() > ob.length()){
                for(int i = 0;i<diferencia;i++){
                    cero = new StringBuilder("0");
                    ob=(cero.append(ob));
                }


            }
            String a = tb.toString();
            String b = ob.toString();
            return a.equals(b);
        }
        return false;
    }

    /** Cambia los valores 0 a 1 y los de 1 a 0 del String del Binary*/
    public Binary Not() {
        Int num = new Int(~(this.toInt().getNumber()));
        return num.toBinary();
    }

    /** Indica si 2 objetos tienen el mismo hashcode */
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    /** Transforma el Binary a un string */
    public string tostring(){
        return new string(getNumber().toString());
    }



    /** Calcula la suma entre tipo de la clase y otro tipo de Scrabble */

    public BinaryOperatios Add(BinaryOperatios typo) {
        return typo.AddBin(this);
    }
    /** Calcula la resta entre tipo de la clase y otro tipo de Scrabble */

    public BinaryOperatios Dif(BinaryOperatios typo) {
        return typo.DifBin(this);
    }
    /** Calcula la division entre tipo de la clase y otro tipo de Scrabble */

    public BinaryOperatios Div(BinaryOperatios typo) {
        return typo.DivBin(this);
    }

    /** Calcula la multiplicación entre tipo de la clase y otro tipo de Scrabble */

    public BinaryOperatios Mult(BinaryOperatios typo) {
        return typo.MultBin(this);
    }

    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de Scrabble */
    @Override
    public Logical And(Logical typo) { return typo.AndBin(this); }

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de Scrabble */
    @Override
    public Logical Or(Logical typo) { return typo.OrBin(this);}


    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    @Override
    public Binary AddInt(Int typo) {
        int a = this.toInt().getNumber();
        int b = typo.getNumber();
        Int c = new Int(a+b);
        return c.toBinary();

    }

    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    @Override
    public Float AddFloat(Float typo) {
        double a = typo.getNumber();
        int b = this.toInt().getNumber();
        return new Float(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un string de Scrabble */
    @Override
    public string AddString(string typo) {
        String a = typo.getString();
        String b = this.getNumber();
        return new string(a+b);

    }



    /** Calcula la suma entre tipo de la clase y un Binary de Scrabble */
    @Override
    public Binary AddBin(Binary typo) {
        int a = typo.toInt().getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int(a+b);
        return c.toBinary();
    }


    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    @Override
    public Binary DifInt(Int typo) {
        int a = this.toInt().getNumber();
        int b = typo.getNumber();
        Int c = new Int(b-a);
        return c.toBinary();
    }



    @Override
    public Float DivFloat(Float divisor) {
        Float f = (Float) divisor;
        double a = f.getNumber();
        int b = this.toInt().getNumber();
        return new Float(a/b);
    }

    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    @Override
    public Float DifFloat(Float typo) {
        double a = typo.getNumber();
        int b = this.toInt().getNumber();
        return new Float(a-b);
    }

    /** Calcula la resta entre tipo de la clase y un Binary de Scrabble */
    @Override
    public Binary DifBin(Binary typo) {
        int a = typo.toInt().getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int(a-b);

        return c.toBinary();
    }


    /** Calcula la multiplicación entre tipo de la clase y un Int de Scrabble */
    @Override
    public Binary MultInt(Int typo) {
        int a=  typo.getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int(a*b);
        return c.toBinary();
    }

    /** Calcula la multiplicación entre tipo de la clase y un Float de Scrabble */
    @Override
    public Float MultFloat(Float typo) {
        double a=  typo.getNumber();
        int b = this.toInt().getNumber();
        return new Float(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Binary de Scrabble */
    @Override
    public Binary MultBin(Binary typo) {
        int a=  typo.toInt().getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int(a*b);
        return c.toBinary();
    }


    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    @Override
    public Binary DivInt(Int typo) {
        int a=  typo.getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int((int)(a/b));
        return c.toBinary();
    }




    /** Calcula la division entre tipo de la clase y un Binary de Scrabble */
    @Override
    public Binary DivBin(Binary typo) {
        int a = typo.toInt().getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int((a/b));
        return c.toBinary();
    }


    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override
    public Logical OrBool(Bool typo) {
        String a = this.getNumber();
        boolean b = (typo).getBool();
        //int len = a.length();
        String c = a;
        if(b) {
            c = a.replaceAll("0", "1");
        }
        return new Binary(c);
    }
    /** Opera el conector lógico "y" entre un Bool y otro Bool */
    @Override
    public Logical AndBool(Bool typo) {
        String a = this.getNumber();
        boolean b = (typo).getBool();//arreglar
        //int len = a.length();
        String c = a;
        if(!b) {
            c = a.replaceAll("1", "0");
        }
        return new Binary(c);
    }

    @Override
    public Logical AndBin(Binary typo) {
        return null;
    }

    @Override
    public Logical OrBin(Binary typo) {
        return null;
    }


}
