package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Operations.IOperations;
import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.Type;
import cl.uchile.dcc.scrabble.gui.Types.string;

public interface Number extends Type {

    Float toFloat();

    Float AddFloat(Float addend);

    Float DifFloat(Float subtrahend);

    Number DifInt(Int subtrahend);

    Float MultFloat(Float product);

    Float DivFloat(Float divisor);

    Number AddInt(Int addend);

    Number MultInt(Int product);

    Number DivInt(Int dividend);
}


