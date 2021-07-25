package cl.uchile.dcc.scrabble.gui.Controlador.Memoria;

import cl.uchile.dcc.scrabble.gui.Controlador.*;
import cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Binarias.*;
import cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Unarias.*;
import cl.uchile.dcc.scrabble.gui.Modelo.Bool;
import cl.uchile.dcc.scrabble.gui.Modelo.ITipos;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Int;
import cl.uchile.dcc.scrabble.gui.Modelo.string;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ASTTest {
    private string str;
    private Float f;
    private Binary bi;
    private Bool bool1;
    private Bool bool2;
    private Int i;
    Constante c1;
    Constante c2;
    Constante c3;
    Constante c4;
    Constante c5;
    Constante c6;

    @BeforeEach
    void setUp() {
        c1= ConstanteFactory.CreateInt(new Int(6));
        c2= ConstanteFactory.CreateFloat(new Float(3.14));
        c3= ConstanteFactory.CreateString(new string("hola"));
        c4= ConstanteFactory.CreateBool(new Bool(true));
        c5= ConstanteFactory.CreateBool(new Bool(false));
        c6= ConstanteFactory.CreateBinary(new Binary("0101")); // 5
        str = new string("randomString");
        f = new Float(3.14);
        bi = new Binary("0011");
        bool1 = new Bool(true);
        bool2 = new Bool(false);
        i = new Int(6);


    }
    @Test
    void SimpleTransform(){
        ITipos a = new ASTtostring(c2).calculate();
        ITipos b = new ASTtoBinary(c1).calculate();
        ITipos c = new ASTtoFloat(c1).calculate();
        ITipos d = new ASTNot(c4).calculate();
        ITipos e = new ASTtoInt(c6).calculate();

        assertEquals(a,new string("3.14"));
        assertEquals(b,new Binary("0110"));
        assertEquals(c,new Float(6.0));
        assertEquals(d,new Bool(false));
        assertEquals(e,new Int(5));


    }
    @Test
    void OperationsTree() {
        // operaciones mas complejas
        Constante bin8 = ConstanteFactory.CreateBinary(new Binary("1000"));
        Constante entero25 = ConstanteFactory.CreateInt(new Int(25));
        Constante bin5 = ConstanteFactory.CreateBinary(new Binary("0101"));
        Constante floatb = ConstanteFactory.CreateFloat(new Float(6.9));

        ITipos ejemplo = new Suma(
                new OR(bin8,
                        new ASTtoBinary(new Resta(entero25, bin5)))
                , floatb).calculate();
        /*
                +
               / \
              OR  6.9
             /  \
          1000 toBinary
                  |
                  -
                 / \
               25  0101

        */
        ITipos calculo = floatb.getNumber().Add(bin8.getNumber().Or((entero25.getNumber().Dif(bin5.getNumber())).toBinary()));

        assertEquals(ejemplo, calculo);

        Constante diez = ConstanteFactory.CreateInt(new Int(10));
        Constante seis = ConstanteFactory.CreateInt(i);
        Constante funciona = ConstanteFactory.CreateString(new string(" funciona!"));

        ITipos a = new Suma(
                new ASTtostring(
                        new Mult(
                                new Suma(seis,seis),new Division(diez,new ASTtoInt(c6)))
                )
                ,funciona).calculate();
        /*
                  +
                 /  \
           toString  " funciona!"
               /
              *
            /  \
           +    %
          / \   / \
         6  6  10  toInt
                    |
                   0101

        */
        ITipos calculo2 = (i.Add(i).Mult(diez.getNumber().Div(c6.getNumber().toInt()))).tostring().Add(funciona.getNumber());
        assertEquals(a,calculo2);

        Constante bin3 = ConstanteFactory.CreateBinary(new Binary("11111"));
        Constante bin4 = ConstanteFactory.CreateBinary(new Binary("01101"));//c4 c5
        ITipos b = new ASTtoInt(new OR(
                                new OR
                                        (c4,new AND(bin3,bin4))
                                ,c5)).calculate();
        /*
                    toInt
                      |
                     OR
                     / \
                  false OR
                        / \
                     true  AND
                           / \
                       11111 01101


        */
        ITipos calculo3 = (c5.getNumber().Or(c4.getNumber().Or(bin3.getNumber().And(bin4.getNumber())))).toInt();
        assertEquals(b,calculo3);
    }

    @Test
    void AddExpresionsTests() {

        Constante op1 = new Constante(new Int(6));
        Constante op2 = new Constante(new Float(3.15));
        ITipos calculo1 = op1.getNumber().Add(op2.getNumber()); // 6+3.14

        AST t = new AST(new Suma(op1, op2));
       //var l=new Suma(op1,op2);
        //t.addSuma(l);

        assertEquals(t.calculate(), calculo1);
        Constante con1 = ConstanteFactory.CreateInt(new Int(6));

        t.addSuma(con1);
        t.toFloat();
        ITipos res2=t.calculate();
        ITipos calculo2 = calculo1.Add(con1.getNumber()).toFloat();

        assertEquals(res2, calculo2);

        Constante con2 = ConstanteFactory.CreateInt(new Int(6));
        Constante con3 = ConstanteFactory.CreateFloat(new Float(3.14));
        t.addResta(con2);
        t.addMult(con3);
        Constante con4 = ConstanteFactory.CreateFloat(new Float(8.42));
        t.addDivision(con4);

        ITipos res3=t.calculate();
        ITipos calculo3 = calculo2.Dif(con2.getNumber()).Mult(con3.getNumber()).Div(con4.getNumber());

        assertEquals(calculo3, res3);

        Constante con5 = ConstanteFactory.CreateBool(new Bool(false));
        Constante con6 = ConstanteFactory.CreateBinary(new Binary("000011"));
        t.toBinary();
        t.addOR(con5);
        t.addAND(con6);

        ITipos calculo4 = calculo3.toBinary().Or(con5.getNumber()).And(con6.getNumber());
        ITipos res4 = t.calculate();

        assertEquals(calculo4,res4);

        t.Not();
        t.toInt();
        t.tostring();
        Constante con7 = ConstanteFactory.CreateString(new string(" si lees esto funciona"));
        t.addSuma(con7);
        t.print();
        System.out.println(t.print());
        ITipos res5 = t.calculate();
        ITipos calculo5 = calculo4.Not().toInt().tostring().Add(con7.getNumber());
        assertEquals(res5,calculo5);

    }
    @Test
    void MemoryTest(){

        Constante v1 = new Constante(i);
        Constante v2 = new Constante(f);
        Constante v3 = new Constante(str);
        Constante v4 = ConstanteFactory.CreateInt(i);
        Constante v5 = ConstanteFactory.CreateInt(new Int(7));
        ITipos j = v2.getNumber();

        Constante v6 = ConstanteFactory.CreateBinary(new Binary("0011"));
        Constante v7 = ConstanteFactory.CreateBinary(new Binary("0011"));
        Constante v8 = ConstanteFactory.CreateBinary(new Binary("0111"));

        Constante v9 = ConstanteFactory.CreateBool(bool1);
        Constante v10 = ConstanteFactory.CreateBool(bool1);
        Constante v11 = ConstanteFactory.CreateBool(bool2);
        Constante v12 = ConstanteFactory.CreateBool(bool2);

        assertEquals(v9,v10);
        assertEquals(v11,v12);
        assertNotEquals(v9,v11);
        assertNotEquals(v10,v12);

        assertEquals(v6,v7);
        assertNotEquals(v7,v8);
        assertNotEquals(v4,v5);
        assertNotEquals(v1,v4);

        Constante v13 = ConstanteFactory.CreateString(str);
        Constante v14 = ConstanteFactory.CreateString(str);
        Constante v15 = ConstanteFactory.CreateString(new string("hola"));
        Constante v16 = ConstanteFactory.CreateString(new string("hola"));

        assertEquals(v13,v14);
        assertEquals(v15,v16);
        assertNotEquals(v13,v15);
        assertNotEquals(v14,v16);

        Constante v17 = ConstanteFactory.CreateFloat(f);
        Constante v18 = ConstanteFactory.CreateFloat(f);
        Constante v19 = ConstanteFactory.CreateFloat(new Float(2.7));
        Constante v20 = ConstanteFactory.CreateFloat(new Float(2.7));

        assertEquals(v17,v18);
        assertEquals(v19,v20);
        assertNotEquals(v17,v19);
        assertNotEquals(v18,v20);

    }


}