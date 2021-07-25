package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Modelo.Bool;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Int;
import cl.uchile.dcc.scrabble.gui.Modelo.string;
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
        bi = new Binary("011");
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



    @RepeatedTest(5)
    void AddTest(){

        Float b2 =(Float) f.Add(i);
        Float b3 =(Float) f.Add(f);
        Float b4 =(Float) f.Add(bi);
        Float b5 =(Float) f.Add(bool);
        Float b6 =(Float) f.Add(str);

        assertEquals(b2,new Float(randomDouble+10));
        assertEquals(b3,new Float(randomDouble+randomDouble));
        assertEquals(b4,new Float(randomDouble+3));
        assertNull(b5);
        assertNull(b6);
    }
    @RepeatedTest(5)
    void DifTest(){
        Float b2 =(Float) f.Dif(i);
        Float b3 =(Float) f.Dif(f);
        Float b4 =(Float) f.Dif(bi);
        Float b5 =(Float) f.Dif(bool);
        Float b6 =(Float) f.Dif(str);

        assertEquals(b2,new Float(randomDouble-10),"d"+f.getNumber());
        assertEquals(b3,new Float(0.0));
        assertEquals(b4,new Float(randomDouble-3));
        assertNull(b5);
        assertNull(b6);
    }
    @RepeatedTest(5)
    void MulTest(){
        Float b2 =(Float) f.Mult(i);
        Float b3 =(Float) f.Mult(f);
        Float b4 =(Float) f.Mult(bi);
        Float b5 =(Float) f.Mult(bool);
        Float b6 =(Float) f.Mult(str);

        assertEquals(b2,new Float(randomDouble*10));
        assertEquals(b3,new Float(randomDouble*randomDouble));
        assertEquals(b4,new Float(randomDouble * 3));
        assertNull(b5);
        assertNull(b6);
    }
    @RepeatedTest(5)
    void DivTest(){

        Float b2 =(Float) f.Div(i);
        Float b3 =(Float) f.Div(f);
        Float b4 =(Float) f.Div(bi);
        Float b5 =(Float) f.Div(bool);
        Float b6 =(Float) f.Div(str);

        assertEquals(b2,new Float(randomDouble/10));
        assertEquals(b3,new Float(1.0));
        assertEquals(b4,new Float(randomDouble/3));
        assertNull(b5);
        assertNull(b6);
    }
    @RepeatedTest(5)
    void LogicalTest(){

        assertNull( f.And(i));
        assertNull(f.And(f));
        assertNull(f.And(bi));
        assertNull(f.And(bool));
        assertNull(f.And(str));

        assertNull(f.Or(i));
        assertNull(f.Or(f));
        assertNull(f.Or(bi));
        assertNull(f.Or(bool));
        assertNull(f.Or(str));

    }

}