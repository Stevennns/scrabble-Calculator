package cl.uchile.dcc.scrabble.gui.Types.Memoria;

import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;
import cl.uchile.dcc.scrabble.gui.Types.string;

import java.util.HashMap;
import java.util.Map;

public class VariableFactory {
    // Usando Flyweight ahorramos memoria del programa guardando una sola vez una variable

    static Map<ITipos, Variable> Memory = new HashMap<>();

    /** Crea una Variable Int */
    public static Variable CreateInt(Int i) {

        Variable v = Memory.get(i);
        if (v != null) {
            return v;
        } else {
            v = new Variable(i);
            Memory.put(i, v);
        }
        return v;


    }
    /** Crea una Variable Float */
    public static Variable CreateFloat(Float f) {

        Variable v = Memory.get(f);
        if (v != null) {
            return v;
        } else {
            v = new Variable(f);
            Memory.put(f, v);


        }
        return v;
    }
    /** Crea una Variable Binary */
    public static Variable CreateBinary(Binary b) {

        Variable v = Memory.get(b);
        if (v != null) {
            return v;
        } else {
            v = new Variable(b);
            Memory.put(b, v);


        }
        return v;
    }
    /** Crea una Variable string */
    public static Variable CreateString(string s) {

        Variable v = Memory.get(s);
        if (v != null) {
            return v;
        } else {
            v = new Variable(s);
            Memory.put(s, v);


        }
        return v;
    }
    /** Crea una Variable Bool */
    public static Variable CreateBool(Bool bool) {

        Variable v = Memory.get(bool);
        if (v != null) {
            return v;
        } else {
            v = new Variable(bool);
            Memory.put(bool, v);

        }
        return v;
    }
}
