package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.IOperations;
import cl.uchile.dcc.scrabble.gui.Types.string;

import java.util.Objects;

public class Binary implements IOperations{
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

    /** Transforma el objeto Binary a uno Int */
    public Int toInt(){
        int i =Integer.parseInt(this.number, 2);
        return new Int(i);
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


    /** Transforma el Binary a un string */
    public string tostring(){
        return new string(getNumber().toString());
    }

    /** Calcula la suma entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Add(IOperations typo) {
        return typo.AddBin(this);
    }

    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations AddInt(Int typo) {
        int a = this.toInt().getNumber();
        int b = typo.getNumber();
        return new Int(a+b);

    }

    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations AddFloat(Float typo) {
        double a = typo.getNumber();
        int b = this.toInt().getNumber();
        return new Float(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un string de Scrabble */
    @Override
    public IOperations AddString(string typo) {
        String a = typo.getString();
        String b = this.getNumber();
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
        int a = typo.toInt().getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int(a+b);
        return c.toBinary();
    }

    /** Calcula la resta entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Dif(IOperations typo) {
        return typo.DifBin(this);
    }

    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations DifInt(Int typo) {
        int a = this.toInt().getNumber();
        int b = typo.getNumber();
        return new Int(a-b);
    }

    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations DifFloat(Float typo) {
        double a = typo.getNumber();
        int b = this.toInt().getNumber();
        return new Float(a-b);
    }

    /** Calcula la resta entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations DifBin(Binary typo) {
        int a = typo.toInt().getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int(a-b);

        return c.toBinary();
    }

    /** Calcula la multiplicación entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Mult(IOperations typo) {
        return typo.MultBin(this);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations MultInt(Int typo) {
        int a=  typo.getNumber();
        int b = this.toInt().getNumber();
        return new Int(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations MultFloat(Float typo) {
        double a=  typo.getNumber();
        int b = this.toInt().getNumber();
        return new Float(a*b);
    }

    /** Calcula la multiplicación entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations MultBin(Binary typo) {
        int a=  typo.toInt().getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int(a*b);
        return c.toBinary();
    }

    /** Calcula la division entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Div(IOperations typo) {
        return typo.DivBin(this);
    }

    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    @Override
    public IOperations DivInt(Int typo) {
        int a=  typo.getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int((int)(a/b));
        return c.toBinary();
    }

    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations DivFloat(Float typo) {
        double a=  typo.getNumber();
        int b = this.toInt().getNumber();
        return new Float(a/b);
    }

    /** Calcula la division entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations DivBin(Binary typo) {
        int a = typo.toInt().getNumber();
        int b = this.toInt().getNumber();
        Int c = new Int((a/b));
        return c.toBinary();
    }

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Or(IOperations typo) {
        return typo.OrBin(this);
    }

    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override
    public IOperations OrBool(Bool typo) {
        String a = this.getNumber();
        boolean b = typo.getBool();
        //int len = a.length();
        String c = a;
        if(b) {
            c = a.replaceAll("0", "1");
        }
        return new Binary(c);
    }

    /** Opera el conector lógico "o" entre un Binary y un Bool */
    @Override
    public IOperations OrBin(Binary typo) {
        String a = typo.getNumber();
        String b = this.getNumber();
        StringBuilder as = new StringBuilder(a);
        StringBuilder bs = new StringBuilder(b);
        StringBuilder cero;
        int diferencia =Math.abs(b.length() - a.length());

        if(a.length() < b.length()){
            for(int i = 0;i<diferencia;i++){
                cero  = new StringBuilder("0");
                as=(cero.append(as));
            }
        }
        if(a.length() > b.length()){
            for(int i = 0;i<diferencia;i++){
                cero  = new StringBuilder("0");
                bs=(cero.append(bs));
            }


        }

        String b1 =as.toString();
        String b2 = bs.toString();
        StringBuilder c = new StringBuilder(as.length());
        for(int i =0;i<as.length();i++){
            if(as.charAt(i)=='1' || bs.charAt(i)=='1'){
                c.append("1");

            }
            else{
                c.append("0");
            }
        }
        return new Binary(c.toString());
    }

    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations And(IOperations typo) {
        return typo.AndBin(this);
    }

    /** Opera el conector lógico "y" entre un Bool y otro Bool */
    @Override
    public IOperations AndBool(Bool typo) {
        String a = this.getNumber();
        boolean b = typo.getBool();//arreglar
        //int len = a.length();
        String c = a;
        if(!b) {
            c = a.replaceAll("1", "0");
        }
        return new Binary(c);
    }

    /** Opera el conector lógico "y" entre un Bool y un Binary */
    @Override
    public IOperations AndBin(Binary typo) {
        String a = typo.getNumber();
        String b = this.getNumber();
        StringBuilder as = new StringBuilder(a);
        StringBuilder bs = new StringBuilder(b);
        StringBuilder cero;
        int diferencia =Math.abs(b.length() - a.length());

        if(a.length() < b.length()){
            for(int i = 0;i<diferencia;i++){
                cero  = new StringBuilder("0");
                as=(cero.append(as));
            }
        }
        if(a.length() > b.length()){
            for(int i = 0;i<diferencia;i++){
                cero  = new StringBuilder("0");
                bs=(cero.append(bs));
            }


        }

        String b1 =as.toString();
        String b2 = bs.toString();
        StringBuilder c = new StringBuilder(as.length());

        for(int i =0;i<as.length();i++){
            if(as.charAt(i)==bs.charAt(i)){
                c.append(as.charAt(i));

            }
            else{
                c.append("0");
            }
        }
        return new Binary(c.toString());
    }





}
