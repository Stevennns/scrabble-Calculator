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
            Int b4 =(Int) i.Add(bi);
            Int b5 =(Int) i.Add(bool);
            Int b6 =(Int) i.Add(str);

            assertEquals(b2,new Int(randomInt+i2.getNumber()));
            assertEquals(b3,new Float(randomInt+3.14));
            assertEquals(b4,new Int(randomInt+3));
            assertNull(b5);
            assertNull(b6);
        }
        @RepeatedTest(5)
        void DifTest(){

            Int b2 =(Int) i.Dif(i2);
            Float b3 =(Float) i.Dif(f);
            Int b4 =(Int) i.Dif(bi);
            Int b5 =(Int) i.Dif(bool);
            Int b6 =(Int) i.Dif(str);

            assertEquals(b2,new Int(randomInt-i2.getNumber()));
            assertEquals(b3,new Float(randomInt-3.14));
            assertEquals(b4,new Int(randomInt-3),""+randomInt+"b4 es "+b4.getNumber());
            assertNull(b5);
            assertNull(b6);
        }
        @RepeatedTest(5)
        void MulTest(){
            Int b2 =(Int) i.Mult(i2);
            Float b3 =(Float) i.Mult(f);
            Int b4 =(Int) i2.Mult(bi);
            Int b5 =(Int) i.Mult(bool);
            Int b6 =(Int) i.Mult(str);

            assertEquals(b2,new Int(randomInt*6));
            assertEquals(b3,new Float(randomInt*f.getNumber()));
            assertEquals(b4,new Int(18));
            assertNull(b5);
            assertNull(b6);
        }
        @RepeatedTest(5)
        void DivTest(){
            Int b2 =(Int) i.Div(i2);
            Float b3 =(Float) i.Div(f);
            Int b4 =(Int) i.Div(bi);
            Int b5 =(Int) i.Div(bool);
            Int b6 =(Int) i.Div(str);

            assertEquals(b2,new Int(randomInt/6));
            assertEquals(b3,new Float(randomInt/3.14));
            assertEquals(b4,new Int(randomInt/3));
            assertNull(b5);
            assertNull(b6);
        }
        @RepeatedTest(5)
        void LogicalTest(){

            assertNull( i.And(i));
            assertNull(i.And(f));
            assertNull(i.And(bi));
            assertNull(i.And(bool));
            assertNull(i.And(str));

            assertNull(i.Or(i));
            assertNull(i.Or(f));
            assertNull(i.Or(bi));
            assertNull(i.Or(bool));
            assertNull(i.Or(str));

        }


    }
