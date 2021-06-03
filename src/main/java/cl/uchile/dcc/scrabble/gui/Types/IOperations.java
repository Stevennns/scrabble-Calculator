package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;

public interface IOperations {


    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    IOperations Add(IOperations typo);
    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    IOperations AddInt(Int typo);
    IOperations AddFloat(Float typo);
    IOperations AddString(string typo);
    IOperations AddBool(Bool typo);
    IOperations AddBin(Binary typo);

    IOperations Dif(IOperations typo);
    IOperations DifInt(Int typo);
    IOperations DifFloat(Float typo);
    IOperations DifBin(Binary typo);

    IOperations Mult(IOperations typo);
    IOperations MultInt(Int typo);
    IOperations MultFloat(Float typo);
    IOperations MultBin(Binary typo);

    /** Calcula la division entre tipo de la clase y un Float de Scrabble */
    IOperations Div(IOperations typo);
    IOperations DivInt(Int typo);
    IOperations DivFloat(Float typo);
    IOperations DivBin(Binary typo);

    IOperations Or(IOperations typo);
    IOperations OrBool(Bool typo);
    IOperations OrBin(Binary typo);

    IOperations And(IOperations typo);
    IOperations AndBool(Bool typo);
    IOperations AndBin(Binary typo);










}





