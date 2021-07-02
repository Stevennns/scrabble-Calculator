package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.string;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class IntTest {

    private int randomInt;
    private int seed;
    private Random rng;
    private string str;
    private Int i;
    private Float f;
    private Binary bi;
    private Bool bool;
    private Int i2;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        randomInt = rng.nextInt(100);
        str = new string("randomString");
        f = new Float(3.14);
        bi = new Binary("0011");
        bool = new Bool(true);
        i = new Int(randomInt);
        i2 = new Int(6);


    }
    @RepeatedTest(20)
    void constructorTest(){
        int Numbercopy = i.getNumber();
        Int newInt = new Int(1000000);
        assertNotEquals(i,newInt,"Same Number");
        assertNotEquals(i.hashCode(),newInt.hashCode(),"Same hash code");
        newInt.setNumber(Numbercopy);
        assertEquals(newInt,i,"Different Integer");
        assertEquals(newInt.hashCode(),i.hashCode(),"Different hash code");
    }
    @Test
     void operationTest() {
        int i = 0;


        Object types[] = {new string(Integer.toString(randomInt))
                , new Binary(Integer.toBinaryString(randomInt))
                , new Float(Double.valueOf(randomInt))};


        while (i < 3) {

            Int anInt = new Int(randomInt);
            Object toMetode[] = {anInt.tostring(), anInt.toBinary(), anInt.toFloat()};
            var atype = types[i];
            assertEquals(atype, toMetode[i]);
            i++;
        }
    }
        @RepeatedTest(5)
        void AddTest() {
            Int b2 = (Int) i.Add(i2);
            Float b3 = (Float) i.Add(f);
            Binary b4 =(Binary) i.Add(bi);

            assertEquals(b2,new Int(randomInt+i2.getNumber()));
            assertEquals(b3,new Float(randomInt+3.14));
            assertEquals(b4,new Int(randomInt+3).toBinary());

        }
        @RepeatedTest(5)
        void DifTest(){

            Int b2 =(Int) i.Dif(i2);
            Float b3 =(Float) i.Dif(f);
            Binary b4 =(Binary) i.Dif(bi);


            assertEquals(b2,new Int(randomInt-i2.getNumber()));
            assertEquals(b3,new Float(randomInt-3.14));
            assertEquals(b4,new Int(randomInt-3).toBinary(),""+randomInt+"b4 es "+b4.getNumber());

        }
        @RepeatedTest(5)
        void MulTest(){
            Int b2 =(Int) i.Mult(i2);
            Float b3 =(Float) i.Mult(f);
            Binary b4 =(Binary) i2.Mult(bi);

            assertEquals(b2,new Int(randomInt*6));
            assertEquals(b3,new Float(randomInt*f.getNumber()));
            assertEquals(b4,new Int(18).toBinary());

        }
        @RepeatedTest(5)
        void DivTest(){
            Int b2 =(Int) i.Div(i2);
            Float b3 =(Float) i.Div(f);
            Binary b4 =(Binary) i.Div(bi);


            assertEquals(b2,new Int(randomInt/6));
            assertEquals(b3,new Float(randomInt/3.14));
            assertEquals(b4,new Int(randomInt/3).toBinary());

        }



    }
