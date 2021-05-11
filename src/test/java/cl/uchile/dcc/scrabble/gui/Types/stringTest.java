package cl.uchile.dcc.scrabble.gui.Types;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stringTest {
    private String randomString;
    private int seed;
    private Random rng;
    private string str;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
         rng = new Random(seed);
        int strSize = rng.nextInt(20);
        randomString = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, true, null, rng);
        str = new string(randomString);

    }
    @RepeatedTest(20)
        void constructorTest(){
        var expectedString = new string(randomString);
        assertEquals(expectedString,str);
        assertEquals(expectedString.hashCode(),str.hashCode());

        string differentstring;
        do {
             String differentstr= RandomStringUtils.random(rng.nextInt(20), 0, Character.MAX_CODE_POINT, true, true, null, rng);
             differentstring = new string(differentstr);
        } while (differentstring.equals(str));
        //var differentString = new string(differentstr);
        assertNotEquals(differentstring, str);
    }
    @Test
    void operationTest(){

        String originalStr = str.getString();
        string newStr = new string("newString");
        assertNotEquals(newStr,str);
        String a_new_String = newStr.getString();
        str.setString(a_new_String);
        assertEquals(newStr,str);

    }

}

