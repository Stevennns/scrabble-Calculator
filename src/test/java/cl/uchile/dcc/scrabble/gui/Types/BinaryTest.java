package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Types.Bool;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;
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
    private string str;
    private Int i;
    private Float f;
    private Binary bi;
    private Bool bool1;
    private Bool bool2;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
        randomBinary = Integer.toBinaryString((rng.nextInt(256)));
        str = new string("randomString");
        i = new Int(10);
        f = new Float(3.14);
        bool1 = new Bool(true);
        bool2 = new Bool(false);
        bi = new Binary("010101");
    }

    @RepeatedTest(20)
    void constructorTest() {

        Binary binary = new Binary(randomBinary);
        Binary anotherbinary = new Binary(randomBinary);

        assertEquals(anotherbinary, binary,"1");
        assertEquals(anotherbinary.hashCode(), binary.hashCode(),"2");
        String binaryString = anotherbinary.getNumber();
        Binary newBinary = new Binary(binaryString);
        anotherbinary.setNumber("000001");
        assertNotEquals(newBinary, anotherbinary);
        string stringBinary = binary.tostring();
        string anotherstring = new string(binary.getNumber());
        assertEquals(anotherstring,stringBinary);
    }

    @Test
    void operationTest(){
        Binary binary = new Binary(randomBinary);
        int anint = Integer.parseInt(binary.getNumber(), 2);
        Int binaryTrasform = binary.toInt();
        Int anInt = new Int(anint);
        assertEquals(anInt,binaryTrasform);



    }
    @Test
    void addTest(){

        Binary b2 =(Binary) bi.Add(i);
        Float b3 =(Float) bi.Add(f);
        Binary b4 =(Binary) bi.Add(bi);
        Binary b5 =(Binary) bi.Add(bool1);
        Binary b6 =(Binary) bi.Add(str);

        assertEquals(b2,new Binary("11111"));
        assertEquals(b3,new Float(24.14));
        assertEquals(b4,new Binary("101010"));
        assertNull(b5);
        assertNull(b6);

    }
    @Test
    void DifTest(){

        Binary b2 =(Binary) bi.Dif(i);
        Float b3 =(Float) bi.Dif(new Float(3.0)); //21
        Binary b4 =(Binary) bi.Dif(bi);
        Binary b5 =(Binary) bi.Dif(bool1);
        Binary b6 =(Binary) bi.Dif(str);

        assertEquals(b2,new Binary("1011"));
        assertEquals(b3,new Float(18.0));
        assertEquals(b4,new Binary("0"));
        assertNull(b5);
        assertNull(b6);
    }
    @Test
    void MulTest(){
        Binary b1 =(Binary) bi.Mult(i);
        Binary b2 =(Binary) bi.Mult(i);
        Float b3 =(Float) bi.Mult(f);
        Binary b4 =(Binary) bi.Mult(bi);
        Binary b5 =(Binary) bi.Mult(bool1);
        Binary b6 =(Binary) bi.Mult(str);

        assertEquals(b2,new Binary("11010010"),b2.getNumber()+""+b1.getNumber());
        assertEquals(b3,new Float(65.94));
        assertEquals(b4,new Binary("110111001"), b4.getNumber());
        assertNull(b5);
        assertNull(b6);
    }
    @Test
    void DivTest(){
        Binary b1 =(Binary) bi.Div(i);
        Binary b2 =(Binary) bi.Div(i);
        Float b3 =(Float) bi.Div(f);
        Binary b4 =(Binary) bi.Div(bi);
        Binary b5 =(Binary) bi.Div(bool1);
        Binary b6 =(Binary) bi.Div(str);

        assertEquals(b2,new Binary("10"));
       // assertNull(b3);
        assertEquals(b4,new Binary("1"));
        assertNull(b5);
        assertNull(b6);
    }
    @Test
    void LogicalTest(){
        Binary bi2 = new Binary("00011");
        Binary a =(Binary)bi.Or(bool1);
        Binary b =(Binary)bi.Or(bool2);
        Binary c= (Binary)b.Or(bool1);
        Binary d =(Binary)bi.OrBin(bi2);




        Binary g=(Binary)bi.And(bool1); // T^bin
        Binary h=(Binary)bi.And(bool2);
        Binary i=(Binary)h.And(bool1);
        Binary j = bi.Not();
        Binary k = (Binary)bi.And(bi2);

        assertEquals(a,new Binary("111111"),a.getNumber());
        assertNotEquals(bi,a);
        assertEquals(b,bi);
        assertEquals(j,new Binary("101010"),j.getNumber());
        assertEquals(c,a);
        assertEquals(new Binary("00000"),h);
        assertEquals(bi,g);
        assertEquals(i,new Binary("00000"));
        assertEquals(d,new Binary("10111"));
        assertEquals(k,new Binary("0000000001"));
    }
}