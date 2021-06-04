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

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        randomInt = rng.nextInt(1000000);
        str = new string("randomString");
        f = new Float(3.14);
        bi = new Binary("001");
        bool = new Bool(true);
        i = new Int(randomInt);

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
        @Test
        void AddTest(){}
        @Test
        void DifTest(){

            assertNull(str.Dif(i));
            assertNull(str.Dif(f));
            assertNull(str.Dif(bi));
            assertNull(str.Dif(bool));
            assertNull(str.Dif(str));
        }
        @Test
        void MulTest(){}
        @Test
        void DivTest(){}
        @Test
        void LogicalTest(){}


    }
