package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;

public interface ITipos {


    /** Calcula la suma entre tipos */
    ITipos Add(ITipos typo);
    /** Calcula la suma entre tipo de la clase y un Int de Scrabble */
    ITipos AddInt(Int typo);
    /** Calcula la suma entre tipo de la clase y un Float de Scrabble */
    ITipos AddFloat(Float typo);
    /** Calcula la suma entre tipo de la clase y un string de Scrabble */
    ITipos AddString(string typo);
    /** Calcula la suma entre tipo de la clase y un Binary de Scrabble */
    ITipos AddBin(Binary typo);

    /** Calcula la resta entre tipos */
    ITipos Dif(ITipos typo);

    /** Calcula la resta entre tipo de la clase y un Int de Scrabble */
    ITipos DifInt(Int typo);
    /** Calcula la resta entre tipo de la clase y un Float de Scrabble */
    ITipos DifFloat(Float typo);
    /** Calcula la resta entre tipo de la clase y un Binary de Scrabble */
    ITipos DifBin(Binary typo);

    /** Calcula la Multiplicaion entre tipos */
    ITipos Mult(ITipos typo);
    /** Calcula la MUltiplicaion entre tipo de la clase y un Int de Scrabble */
    ITipos MultInt(Int typo);
    /** Calcula la Multiplicaion entre tipo de la clase y un Float de Scrabble */
    ITipos MultFloat(Float typo);
    /** Calcula la Multiplicaion entre tipo de la clase y un Binary de Scrabble */
    ITipos MultBin(Binary typo);

    /** Calcula la division entre tipos */
    ITipos Div(ITipos typo);

    /** Calcula la division entre tipo de la clase y un Int de Scrabble */
    ITipos DivInt(Int typo);
    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    ITipos DivFloat(Float typo);
    /** Calcula la division entre tipo de la clase y un Binary de Scrabble */
    ITipos DivBin(Binary typo);

    /** Opera el 'o' entre tipos */
    ITipos Or(ITipos typo);

    /** Opera el 'o' entre un tipo y un Bool de Scrabble */
    ITipos OrBool(Bool typo);
    /** Opera el 'o' entre un tipo y un Binary de Scrabble */
    ITipos OrBin(Binary typo);
    /** Opera el 'y' entre tipos */
    ITipos And(ITipos typo);
    /** Opera el 'y' entre un tipo y un Bool de Scrabble */
    ITipos AndBool(Bool typo);
    /** Opera el 'o' entre un tipo y un Binary de Scrabble */
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





