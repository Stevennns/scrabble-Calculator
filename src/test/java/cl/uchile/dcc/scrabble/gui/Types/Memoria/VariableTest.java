package cl.uchile.dcc.scrabble.gui.Types.Memoria;

import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.ITipos;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;
import cl.uchile.dcc.scrabble.gui.Types.string;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableTest {
    private string str;
    private Float f;
    private Binary bi;
    private Bool bool1;
    private Bool bool2;
    private Int i;
    @BeforeEach
    void setUp() {
        str = new string("randomString");
        f = new Float(3.14);
        bi = new Binary("0011");
        bool1 = new Bool(true);
        bool2 = new Bool(false);
        i = new Int(6);
    }
    @Test
    void MemoryTest(){

        Variable v1 = new Variable(i);
        Variable v2 = new Variable(f);
        Variable v3 = new Variable(str);
        Variable v4 = VariableFactory.CreateInt(i);
        Variable v5 = VariableFactory.CreateInt(new Int(7));
        ITipos j = v2.getTipo();

        Variable v6 = VariableFactory.CreateBinary(new Binary("0011"));
        Variable v7 = VariableFactory.CreateBinary(new Binary("0011"));
        Variable v8 = VariableFactory.CreateBinary(new Binary("0111"));

        Variable v9 = VariableFactory.CreateBool(bool1);
        Variable v10 = VariableFactory.CreateBool(bool1);
        Variable v11 = VariableFactory.CreateBool(bool2);
        Variable v12 = VariableFactory.CreateBool(bool2);

        assertEquals(v9,v10);
        assertEquals(v11,v12);
        assertNotEquals(v9,v11);
        assertNotEquals(v10,v12);

        assertEquals(v6,v7);
        assertNotEquals(v7,v8);
        assertNotEquals(v4,v5);
        assertNotEquals(v1,v4);

        Variable v13 = VariableFactory.CreateString(str);
        Variable v14 = VariableFactory.CreateString(str);
        Variable v15 = VariableFactory.CreateString(new string("hola"));
        Variable v16 = VariableFactory.CreateString(new string("hola"));

        assertEquals(v13,v14);
        assertEquals(v15,v16);
        assertNotEquals(v13,v15);
        assertNotEquals(v14,v16);

        Variable v17 = VariableFactory.CreateFloat(f);
        Variable v18 = VariableFactory.CreateFloat(f);
        Variable v19 = VariableFactory.CreateFloat(new Float(2.7));
        Variable v20 = VariableFactory.CreateFloat(new Float(2.7));

        assertEquals(v17,v18);
        assertEquals(v19,v20);
        assertNotEquals(v17,v19);
        assertNotEquals(v18,v20);

    }

}