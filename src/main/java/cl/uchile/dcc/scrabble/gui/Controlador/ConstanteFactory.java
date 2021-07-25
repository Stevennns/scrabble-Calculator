package cl.uchile.dcc.scrabble.gui.Controlador;

import cl.uchile.dcc.scrabble.gui.Modelo.Bool;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Int;
import cl.uchile.dcc.scrabble.gui.Modelo.string;

import java.util.HashMap;
import java.util.Map;

public class ConstanteFactory {
    // Usando Flyweight ahorramos memoria del programa guardando una sola vez una variable

    static Map<ITipos, Constante> Memory = new HashMap<>();

    /** Crea una Variable Int */
    public static Constante CreateInt(Int i) {

        Constante v = Memory.get(i);
        if (v != null) {
            return v;
        } else {
            v = new Constante(i);
            Memory.put(i, v);
        }
        return v;


    }
    /** Crea una Variable Float */
    public static Constante CreateFloat(Float f) {

        Constante v = Memory.get(f);
        if (v != null) {
            return v;
        } else {
            v = new Constante(f);
            Memory.put(f, v);


        }
        return v;
    }
    /** Crea una Variable Binary */
    public static Constante CreateBinary(Binary b) {

        Constante v = Memory.get(b);
        if (v != null) {
            return v;
        } else {
            v = new Constante(b);
            Memory.put(b, v);


        }
        return v;
    }
    /** Crea una Variable string */
    public static Constante CreateString(string s) {

        Constante v = Memory.get(s);
        if (v != null) {
            return v;
        } else {
            v = new Constante(s);
            Memory.put(s, v);


        }
        return v;
    }
    /** Crea una Variable Bool */
    public static Constante CreateBool(Bool bool) {

        Constante v = Memory.get(bool);
        if (v != null) {
            return v;
        } else {
            v = new Constante(bool);
            Memory.put(bool, v);

        }
        return v;
    }

}



