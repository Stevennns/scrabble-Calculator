package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.string;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    private String randomBinary;
    private int seed;
    private Random rng;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        randomBinary = Integer.toBinaryString((rng.nextInt(256)));
    }

    @RepeatedTest(20)
    void constructorTest() {

        Binary binary = new Binary(randomBinary);
        Binary anotherbinary = new Binary(randomBinary);

        assertEquals(anotherbinary, binary);
        assertEquals(anotherbinary.hashCode(), binary.hashCode());
        String binaryString = anotherbinary.getNumber();
        Binary newBinary = new Binary(binaryString);
        anotherbinary.setNumber("000001");
        assertNotEquals(newBinary, anotherbinary);
        string stringBinary = binary.tostring();
        string anotherstring = new string(binary.getNumber());
        assertEquals(anotherstring,stringBinary);
    }
    void operationTest(){
        Binary binary = new Binary(randomBinary);
        int anint = Integer.parseInt(binary.getNumber(), 2);
        Int binaryTrasform = binary.toInt();
        Int anInt = new Int(anint);
        assertEquals(anInt,binaryTrasform);
        assertNotEquals(binary,anInt);






    }
    @Test
    void addTest(){
        Binary b1 = new Binary("101");
        Binary b2 = new Binary("001");
        Binary r1 = (Binary) b1.Dif(b2);
        assertNotEquals(r1,b1);

    }
}