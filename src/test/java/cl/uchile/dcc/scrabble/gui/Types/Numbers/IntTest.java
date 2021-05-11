package cl.uchile.dcc.scrabble.gui.Types.Numbers;

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

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        randomInt = rng.nextInt(1000000);

    }
    @RepeatedTest(20)
    void constructorTest(){
        Int anInt = new Int(randomInt);
        int Numbercopy = anInt.getNumber();
        Int newInt = new Int(1000000);
        assertNotEquals(anInt,newInt,"Same Number");
        assertNotEquals(anInt.hashCode(),newInt.hashCode(),"Same hash code");
        newInt.setNumber(Numbercopy);
        assertEquals(newInt,anInt,"Different Integer");
        assertEquals(newInt.hashCode(),anInt.hashCode(),"Different hash code");
    }
    @Test
     void operationTest(){
        int i=0;


        Object types[] = {new string(Integer.toString(randomInt))
                         ,new Binary(Integer.toBinaryString(randomInt))
                         ,new Float(Double.valueOf(randomInt))};



        while(i<3) {

            Int anInt = new Int(randomInt);
            Object toMetode[]={anInt.tostring(),anInt.toBinary(),anInt.toFloat()};
            var atype = types[i];
            assertEquals(atype, toMetode[i]);
            i++;
        }


    }
}