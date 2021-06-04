package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.string;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
class FloatTest {
    private Double randomDouble;
    private int seed;
    private Random rng;
    private string str;
    private Int i;
    private Float f;
    private Binary bi;
    private Bool bool;


    @BeforeEach
    void setup(){
        seed = new Random().nextInt();
        rng = new Random(seed);
        randomDouble = rng.nextDouble();
        str = new string("randomString");
        i = new Int(10);
        bi = new Binary("001");
        bool = new Bool(true);
        f = new Float(randomDouble);

    }
    @RepeatedTest(20)
    void constructorTest(){
       Float aFloat = new Float(randomDouble);
        Double Numbercopy = aFloat.getNumber();
        Float newFloat = new Float(1000000);
        assertNotEquals(aFloat,newFloat,"Same Number");
        assertNotEquals(aFloat.hashCode(),newFloat.hashCode(),"Same hash code");
        newFloat.setNumber(Numbercopy);
        assertEquals(newFloat,aFloat,"Different Integer");
        assertEquals(newFloat.hashCode(),aFloat.hashCode(),"Different hash code");
    }
    @Test
    void operationTest(){
        string floatstring = f.tostring();
        string s = new string(randomDouble.toString());
        }



    @Test
    void AddTest(){

        Float b2 =(Float) bi.Add(i);
        Float b3 =(Float) bi.Add(f);
        Float b4 =(Float) bi.Add(bi);
        Float b5 =(Float) bi.Add(bool);
        Float b6 =(Float) bi.Add(str);

        assertEquals(b2,new Float());
        assertNull(b3);
        assertEquals(b4,new Float());
        assertNull(b5);
        assertNull(b6);
    }
    @Test
    void DifTest(){
        Float b2 =(Float) bi.Add(i);
        Float b3 =(Float) bi.Add(f);
        Float b4 =(Float) bi.Add(bi);
        Float b5 =(Float) bi.Add(bool);
        Float b6 =(Float) bi.Add(str);

        assertEquals(b2,new Float());
        assertNull(b3);
        assertEquals(b4,new Float());
        assertNull(b5);
        assertNull(b6);
    }
    @Test
    void MulTest(){
        Float b2 =(Float) bi.Add(i);
        Float b3 =(Float) bi.Add(f);
        Float b4 =(Float) bi.Add(bi);
        Float b5 =(Float) bi.Add(bool);
        Float b6 =(Float) bi.Add(str);

        assertEquals(b2,new Float());
        assertNull(b3);
        assertEquals(b4,new Float());
        assertNull(b5);
        assertNull(b6);
    }
    @Test
    void DivTest(){
        Float b2 =(Float) bi.Add(i);
        Float b3 =(Float) bi.Add(f);
        Float b4 =(Float) bi.Add(bi);
        Float b5 =(Float) bi.Add(bool);
        Float b6 =(Float) bi.Add(str);

        assertEquals(b2,new Float());
        assertNull(b3);
        assertEquals(b4,new Float());
        assertNull(b5);
        assertNull(b6);
    }
    @Test
    void LogicalTest(){
        assertNull( bi.Add(i));
        assertNull(bi.Add(f));
        assertNull(bi.Add(bi));
        assertNull(bi.Add(bool));
        assertNull( bi.Add(str));

    }

}