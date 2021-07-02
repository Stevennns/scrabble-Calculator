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


        assertEquals(b2,new Float(randomDouble+10));
        assertEquals(b3,new Float(randomDouble+randomDouble));
        assertEquals(b4,new Float(randomDouble+3));

    }
    @RepeatedTest(5)
    void DifTest(){
        Float b2 =(Float) f.Dif(i);
        Float b3 =(Float) f.Dif(f);
        Float b4 =(Float) f.Dif(bi);


        assertEquals(b2,new Float(randomDouble-10),"d"+f.getNumber());
        assertEquals(b3,new Float(0.0));
        assertEquals(b4,new Float(randomDouble-3));
    }
    @RepeatedTest(5)
    void MulTest(){
        Float b2 =(Float) f.Mult(i);
        Float b3 =(Float) f.Mult(f);
        Float b4 =(Float) f.Mult(bi);


        assertEquals(b2,new Float(randomDouble*10));
        assertEquals(b3,new Float(randomDouble*randomDouble));
        assertEquals(b4,new Float(randomDouble * 3));

    }
    @RepeatedTest(5)
    void DivTest(){

        Float b2 =(Float) f.Div(i);
        Float b3 =(Float) f.Div(f);
        Float b4 =(Float) f.Div(bi);


        assertEquals(b2,new Float(randomDouble/10));
        assertEquals(b3,new Float(1.0));
        assertEquals(b4,new Float(randomDouble/3));

    }
    @RepeatedTest(5)
    void LogicalTest(){


    }

}