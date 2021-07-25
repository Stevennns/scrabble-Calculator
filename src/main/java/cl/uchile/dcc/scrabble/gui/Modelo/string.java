package cl.uchile.dcc.scrabble.gui.Modelo;

import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Int;

import java.util.Objects;

public class string implements ITipos {
    private java.lang.String s = "";


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

    /** Calcula la suma entre tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public ITipos Add(ITipos typo) {

        return typo.AddString(this);
    }

    /** Calcula la suma entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public string AddInt(Int typo){
       return null;
    }

    /** Calcula la suma entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public ITipos AddFloat(Float typo){
        return null;
    }

    /** Calcula la suma entre tipo de la clase y un string de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public ITipos AddString(string typo){
        String b = this.getString();
        String a = typo.getString();
       return new string(a+b);
    }



    /** Calcula la suma entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override
    public ITipos AddBin(Binary typo){
        return null;
    }

    /** Calcula la resta entre tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    @Override public ITipos Dif(ITipos typo){return null;}

    /** Calcula la resta entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DifInt(Int typo){return null;}

    /** Calcula la resta entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DifFloat(Float typo){return null;}

    /** Calcula la resta entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DifBin(Binary typo){return null;}

    /** Calcula la multiplicación entre tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    @Override public ITipos Mult(ITipos typo){return null;}

    /** Calcula la multiplicación entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos MultInt(Int typo){return null;}

    /** Calcula la multiplicación entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos MultFloat(Float typo){return null;}

    /** Calcula la multiplicación entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos MultBin(Binary typo){return null;}

    /** Calcula la division entre tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    @Override public ITipos Div(ITipos typo){return null;}

    /** Calcula la division entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DivInt(Int typo){return null;}

    /** Calcula la division entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DivFloat(Float typo){return null;}

    /** Calcula la division entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    @Override public ITipos DivBin(Binary typo){return null;}

    /** Opera el conector lógico "o" entre el tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    @Override public ITipos Or(ITipos typo){return null;}

    /** Opera el conector lógico "o" entre un Bool otro Bool */
    @Override public ITipos OrBool(Bool typo){return null;}

    /** Opera el conector lógico "o" entre un Binary y un Bool */
    @Override public ITipos OrBin(Binary typo){return null;}

    /** Opera el conector lógico "y" entre el tipo de la clase y otro tipo de cl.uchile.dcc.scrabble.gui.Vista.Scrabble*/
    @Override public ITipos And(ITipos typo){return null;}

    /** Opera el conector lógico "y" entre el tipo de la clase y un Bool*/
    @Override public ITipos AndBool(Bool typo){return null;}

    /** Opera el conector lógico "y" entre el tipo de la clase un Binary*/
    @Override public ITipos AndBin(Binary typo){return null;}

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
    /** Transforma el tipo a uno string */
    @Override
    public string tostring() {
        return this;
    }
    /**Niega la expresion*/
    @Override
    public ITipos Not() {
        return null;
    }



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
    public String print(){
        return this.getString();
    }
}
