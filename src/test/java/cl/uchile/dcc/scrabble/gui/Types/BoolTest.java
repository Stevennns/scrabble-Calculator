package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Types.string;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import cl.uchile.dcc.scrabble.gui.Types.Bool;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BoolTest {
    private Bool bool;

    @BeforeEach
    void setUp() {
        bool = new Bool(true);
    }
    @Test
    void testConstructor(){
        var expectedBool = new Bool(true);

        assertEquals(expectedBool,bool);
        assertEquals(expectedBool.hashCode(),bool.hashCode());

        var otherBool = new Bool(false);

        assertNotEquals(otherBool,bool);
        boolean b = expectedBool.getBool();
        otherBool.setBool(b);
        assertEquals(otherBool,expectedBool);



    }
    @Test
    void operationTest(){
    string strBool = bool.tostring();
    string expectedstr = new string("true");
    assertEquals(expectedstr,strBool,"Different strings");
    }
}