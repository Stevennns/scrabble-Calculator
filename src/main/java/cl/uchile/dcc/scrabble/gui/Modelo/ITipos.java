package cl.uchile.dcc.scrabble.gui.Modelo;

import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Int;

public interface ITipos {


    /** Calcula la suma entre tipos */
    ITipos Add(ITipos typo);
    /** Calcula la suma entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos AddInt(Int typo);
    /** Calcula la suma entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos AddFloat(Float typo);
    /** Calcula la suma entre tipo de la clase y un string de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos AddString(string typo);
    /** Calcula la suma entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos AddBin(Binary typo);

    /** Calcula la resta entre tipos */
    ITipos Dif(ITipos typo);

    /** Calcula la resta entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos DifInt(Int typo);
    /** Calcula la resta entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos DifFloat(Float typo);
    /** Calcula la resta entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos DifBin(Binary typo);

    /** Calcula la Multiplicaion entre tipos */
    ITipos Mult(ITipos typo);
    /** Calcula la MUltiplicaion entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos MultInt(Int typo);
    /** Calcula la Multiplicaion entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos MultFloat(Float typo);
    /** Calcula la Multiplicaion entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos MultBin(Binary typo);

    /** Calcula la division entre tipos */
    ITipos Div(ITipos typo);

    /** Calcula la division entre tipo de la clase y un Int de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos DivInt(Int typo);
    /** Calcula la division entre tipo de la clase y un Float de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos DivFloat(Float typo);
    /** Calcula la division entre tipo de la clase y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos DivBin(Binary typo);

    /** Opera el 'o' entre tipos */
    ITipos Or(ITipos typo);

    /** Opera el 'o' entre un tipo y un Bool de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos OrBool(Bool typo);
    /** Opera el 'o' entre un tipo y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos OrBin(Binary typo);
    /** Opera el 'y' entre tipos */
    ITipos And(ITipos typo);
    /** Opera el 'y' entre un tipo y un Bool de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos AndBool(Bool typo);
    /** Opera el 'o' entre un tipo y un Binary de cl.uchile.dcc.scrabble.gui.Vista.Scrabble */
    ITipos AndBin(Binary typo);

    /** Transforma el tipo a uno Float */
    Float toFloat();
    /** Transforma el tipo a uno Binary */
    Binary toBinary();
    /** Transforma el tipo a uno Int */
    Int toInt();
    /** Transforma el tipo a uno string */
    string tostring();
    /** Niega la expresion */
    ITipos Not();

}





