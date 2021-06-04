package cl.uchile.dcc.scrabble.gui.Types;
import java.util.Random;

import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class stringTest {
    private String randomString;
    private int seed;
    private Random rng;
    private string str;
    private Int i;
    private Float f;
    private Binary bi;
    private Bool bool;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
         rng = new Random(seed);
        int strSize = rng.nextInt(20);
        randomString = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, true, null, rng);
        str = new string(randomString);
        i = new Int(10);
        f = new Float(3.14);
        bi = new Binary("001");
        bool = new Bool(true);

    }
    @RepeatedTest(20)
        void constructorTest(){
        var expectedString = new string(randomString);
        assertEquals(expectedString,str);
        assertEquals(expectedString.hashCode(),str.hashCode());

        string differentstring;
        do {
             String differentstr= RandomStringUtils.random(rng.nextInt(20), 0, Character.MAX_CODE_POINT, true, true, null, rng);
             differentstring = new string(differentstr);
        } while (differentstring.equals(str));

        assertNotEquals(differentstring, str);
    }
    @Test
    void AddTest(){

        string newStr = new string("newString");
        assertNotEquals(newStr,str);
        String a_new_String = newStr.getString();
        str.setString(a_new_String);

        assertEquals(newStr,str);
        Int a = new Int(5);
        string b = new string("tacocaT");
        string c = (string)b.Add(a);
        assertNotEquals(c,str);
        assertEquals(c,new string("tacocaT5"),"Strings distintos: a = "+b.getString()+" b= "+a.getNumber()+"se entrego = "+c.getString());

        Float f = new Float(3.14);
        Binary bi = new Binary("001");
        Bool bool = new Bool(true);

        string afloat = (string)str.Add(f);
        string abin = (string)str.Add(bi);
        string bool1 = (string)str.Add(bool);
        string word = (string)str.Add(c);

        assertEquals(afloat,new string("newString3.14"));
        assertEquals(abin,new string("newString001"));
        assertEquals(bool1,new string("newStringtrue"));
        assertEquals(word,new string("newStringtacocaT5"));






    }
    @Test
    void DifTest(){


        assertNull(str.Dif(i));
        assertNull(str.Dif(f));
        assertNull(str.Dif(bi));
        assertNull(str.Dif(bool));
        assertNull(str.Dif(str));


    }
    @Test
    void MulTest(){

        assertNull(str.Mult(i));
        assertNull(str.Mult(f));
        assertNull(str.Mult(bi));
        assertNull(str.Mult(bool));
        assertNull(str.Mult(str));

    }
    @Test
    void DivTest(){


        assertNull(str.Div(i));
        assertNull(str.Div(f));
        assertNull(str.Div(bi));
        assertNull(str.Div(bool));
        assertNull(str.Div(str));
    }
    @Test
    void LogicalTest(){


        assertNull(str.And(i));
        assertNull(str.And(f));
        assertNull(str.And(bi));
        assertNull(str.And(bool));
        assertNull(str.And(str));

        assertNull(str.Or(i));
        assertNull(str.Or(f));
        assertNull(str.Or(bi));
        assertNull(str.Or(bool));
        assertNull(str.Or(str));


    }






}

