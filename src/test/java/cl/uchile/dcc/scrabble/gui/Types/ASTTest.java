package cl.uchile.dcc.scrabble.gui.Types;

import cl.uchile.dcc.scrabble.gui.Operations.AST.Add;
import cl.uchile.dcc.scrabble.gui.Operations.IOperations;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Types.Numbers.Int;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ASTTest {
    private string s;
    private Int i;
    private Float f;
    private Binary bi;
    private Bool bool;
    @BeforeEach
    void setUp() {
        s = new string("hola");
        i = new Int(9);
        f = new Float(3.14);
        bi = new Binary("001");
        bool = new Bool(true);
        /*
        new Add(
                new Or(
                        new Binary("1000"),
                        new Sub(
                                new Int(25),
                                new Binary("0101")
                        ).toBinary()
                ),
                new Float(6.9)
        );
*/
    }
    @Test
    void TreeTest(){
        /*
        IOperations n1 = s.Add(i);
        IOperations str = s.Add(s);
        IOperations n2 =i.Dif(f);
        assertEquals(n1,new string("hola9"));
        //Add Arbol = new Nodo();
        Add operacion = new Add(s,s);
        operacion.add(str);
        operacion.add(str);
     //   Nodo.Add(n2,n2.Add(n2));

        assertEquals(new string("hola9hola9"),n1);

*/
    }


}