package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.string;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import cl.uchile.dcc.scrabble.gui.Types.Bool;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BoolTest {
    private Bool bool;
    private Bool bool2;
    private Binary b1;
    private Binary b2;

    @BeforeEach
    void setUp() {

        bool = new Bool(true);
        bool2= new Bool(false);
        b1 = new Binary("001001");
        b2 = new Binary("100110");

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

    @Test
    void LogicalTest(){
        Bool a =(Bool)bool.Or(bool2);
        Bool b =(Bool)bool.Or(bool);
        Binary c= (Binary)bool.Or(b1);
        Bool d =(Bool)bool.And(bool2);
        Bool e =(Bool)bool.And(bool2);
        Bool f =(Bool)bool.And(bool);
        Binary g=(Binary)bool.And(b2); // T^bin
        Binary h=(Binary)bool2.And(b2);
        Binary i=(Binary)bool.And(b1);
        Bool j =bool.Not();

        assertEquals(bool,a);
        assertNotEquals(bool,bool2);
        assertEquals(b,new Bool(true));
        assertNotEquals(d,f);
        assertEquals(new Binary("111111"),c);
        assertEquals(b2,g);
        assertEquals(new Binary("000000"),h);
        assertEquals(b1,i);
        assertEquals(new Bool(false),j);
        assertEquals(e,j);




    }
}