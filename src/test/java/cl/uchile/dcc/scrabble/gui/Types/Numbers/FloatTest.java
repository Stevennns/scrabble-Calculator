package cl.uchile.dcc.scrabble.gui.Types.Numbers;

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

    @BeforeEach
    void setup(){
        seed = new Random().nextInt();
        rng = new Random(seed);
        randomDouble = rng.nextDouble();

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
        int i=0;
// falta implementar trasformacion de binarios

        Object types[] = {new string(Double.toString(randomDouble))
                /*,new Binary(Integer.toBinaryString(randomDouble))
                ,new Int(Integer.valueOf(randomDouble))*/};



        while(i<1) {

            Float aFloat = new Float(randomDouble);
            Object toMetode[]={aFloat.tostring()/*,aFloat.toBinary(),aFloat.toFloat()*/};
            var atype = types[i];
            assertEquals(atype, toMetode[i]);
            i++;
        }


    }

}