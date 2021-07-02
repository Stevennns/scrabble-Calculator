package cl.uchile.dcc.scrabble.gui.Operations;

import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;

public interface BinaryOperatios {

    Binary AddBin(Binary addend);

    Binary DifBin(Binary subtractor);

    Binary MultBin(Binary product);

    Binary DivBin(Binary dividend);

    Int toInt();

    Binary toBinary();
}
