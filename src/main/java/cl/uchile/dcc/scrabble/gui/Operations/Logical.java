package cl.uchile.dcc.scrabble.gui.Operations;

import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;

public interface Logical{

    Logical And(Logical conjunct);
    Logical Or(Logical operand);

    Logical OrBool(Bool operand);
    Logical AndBool(Bool bool);

    Logical AndBin(Binary typo);
    Logical OrBin(Binary typo);


}
