package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;

import java.util.Objects;

public class string implements IOperations{
    private String s = "";


    /** Constructor de la clase string  */
    public string(String s){
        this.s = s;
    }

    /** Entrega el valor del string como String de java */
    public String getString() {
        return s;
    }

    /** Cambia el String de string a otro */
    public void setString(String s) {
        this.s = s;
    }

    /** Calcula la suma entre tipo de la clase y otro tipo de Scrabble */
    @Override
    public IOperations Add(IOperations typo) {

        return typo.AddString(this);
    }

    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    @Override
    public string AddInt(Int typo){
       return null;
    }

    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    @Override
    public IOperations AddFloat(Float typo){
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un string de Scrabble */
    @Override
    public IOperations AddString(string typo){
        String b = this.getString();
        String a = typo.getString();
       return new string(a+b);
    }

    /** Calcula la suma entre tipo de la clase y un Bool de Scrabble */
    @Override
    public IOperations AddBool(Bool typo){
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un Binary de Scrabble */
    @Override
    public IOperations AddBin(Binary typo){
        return null;
    }

    /** Calcula la resta entre tipo de la clase y otro tipo de Scrabble*/
    @Override public IOperations Dif(IOperations typo){return null;}

    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    @Override public IOperations DifInt(Int typo){return null;}

    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    @Override public IOperations DifFloat(Float typo){return null;}

    /** Calcula la resta entre tipo de la clase y un Binary de Scrabble */
    @Override public IOperations DifBin(Binary typo){return null;}

    /** Calcula la multiplicación entre tipo de la clase y otro tipo de Scrabble*/
    @Override public IOperations Mult(IOperations typo){return null;}

    /** Calcula la multiplicación entre tipo de la clase y un Int de Scrabble */
    @Override public IOperations MultInt(Int typo){return null;}

    /** Calcula la multiplicación entre tipo de la clase y un Float de Scrabble */
    @Override public IOperations MultFloat(Float typo){return null;}

    /** Calcula la multiplicación entre tipo de la clase y un Binary de Scrabble */
    @Override public IOperations MultBin(Binary typo){return null;}

    /** Calcula la division entre tipo de la clase y otro tipo de Scrabble*/
    @Override public IOperations Div(IOperations typo){return null;}

    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    @Override public IOperations DivInt(Int typo){return null;}

    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    @Override public IOperations DivFloat(Float typo){return null;}

    /** Calcula la division entre tipo de la clase y un Binary de Scrabble */
    @Override public IOperations DivBin(Binary typo){return null;}

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de Scrabble*/
    @Override public IOperations Or(IOperations typo){return null;}

    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override public IOperations OrBool(Bool typo){return null;}

    /** Opera el conector lógico "o" entre un Binary y un Bool */
    @Override public IOperations OrBin(Binary typo){return null;}

    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de Scrabble*/
    @Override public IOperations And(IOperations typo){return null;}

    /** Opera el conector lógico "y" entre el tipo de la clase y un Bool*/
    @Override public IOperations AndBool(Bool typo){return null;}

    /** Opera el conector lógico "y" entre el tipo de la clase un Binary*/
    @Override public IOperations AndBin(Binary typo){return null;}


    /** Determina si un objeto es igual a otro en cuanto a su contenido y clase */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof string) {
            var o = (string) obj;
            return o.s.equals(this.s);
        }
        return false;
    }

    /** Indica si 2 objetos tienen el mismo hashcode */
    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}
