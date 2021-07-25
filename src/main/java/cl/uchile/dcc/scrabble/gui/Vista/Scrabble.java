package cl.uchile.dcc.scrabble.gui.Vista;

import cl.uchile.dcc.scrabble.gui.Controlador.AST;
import cl.uchile.dcc.scrabble.gui.Controlador.Constante;
import cl.uchile.dcc.scrabble.gui.Controlador.ConstanteFactory;
import cl.uchile.dcc.scrabble.gui.Controlador.Operaciones.Binarias.*;
import cl.uchile.dcc.scrabble.gui.Modelo.Bool;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Binary;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Float;
import cl.uchile.dcc.scrabble.gui.Modelo.Numbers.Int;
import cl.uchile.dcc.scrabble.gui.Modelo.string;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/** Aplicación en base a java FX: Calculadora Scrabble  */

public class Scrabble extends Application {

    AST t = new AST(null); // arbol vacio inicial

    boolean firstExpresion = true;
    boolean ready = false;
    StringBuilder lab = new StringBuilder();
    Label label1 = new Label();
    private static final String RESOURCE_PATH = "src/main/resources/";


    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        var image = new Image("file:"+RESOURCE_PATH + "Calculatorbackground1.png",1300,150*3,false,false);
        BackgroundImage myBI= new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        int h = 800;
        int w = 150;
        int hb = h/4;
        int wb = w/4;

        primaryStage.getIcons().add(new Image("file:"+RESOURCE_PATH+"icon.png"));

        GridPane pane1 = new GridPane();
        pane1.setAlignment(Pos.CENTER);


        Button button0 = new Button("∨");
        button0.setPrefSize(hb, wb);button0.setFont(Font.font(15));
        Button button2 = new Button("true");
        button2.setPrefSize(hb, wb);button2.setFont(Font.font(15));
        Button button3 = new Button("false");
        button3.setPrefSize(hb, wb);button3.setFont(Font.font(15));
        Button button1 = new Button("∧");
        button1.setPrefSize(hb, wb);button1.setFont(Font.font(15));

        Button button4 = new Button("BORRAR");
        button4.setPrefSize(hb, wb);button4.setFont(Font.font(15));
        Button button5 = new Button("/");
        button5.setPrefSize(hb, wb);button5.setFont(Font.font(15));
        Button button6 = new Button("*");
        button6.setPrefSize(hb, wb);button6.setFont(Font.font(15));
        //Button button7 = new Button("←");
        //button7.setPrefSize(hb, wb);button7.setFont(Font.font(15));

        Button button8 = new Button("7");
        button8.setPrefSize(hb, wb);button8.setFont(Font.font(15));
        Button button9 = new Button("8");
        button9.setPrefSize(hb, wb);button9.setFont(Font.font(15));
        Button button11 = new Button("9");
        button11.setPrefSize(hb, wb);button11.setFont(Font.font(15));
        Button button12 = new Button("-");
        button12.setPrefSize(hb, wb);button12.setFont(Font.font(15));

        Button button13 = new Button("4");
        button13.setPrefSize(hb, wb);button13.setFont(Font.font(15));
        Button button14 = new Button("5");
        button14.setPrefSize(hb, wb);button14.setFont(Font.font(15));
        Button button15 = new Button("6");
        button15.setPrefSize(hb, wb);button15.setFont(Font.font(15));
        Button button16 = new Button("+");
        button16.setPrefSize(hb, wb);button16.setFont(Font.font(15));

        Button button17 = new Button("1");
        button17.setPrefSize(hb, wb);button17.setFont(Font.font(15));
        Button button18 = new Button("2");
        button18.setPrefSize(hb, wb);button18.setFont(Font.font(15));
        Button button19 = new Button("3");
        button19.setPrefSize(hb, wb);button19.setFont(Font.font(15));
        Button button21 = new Button("VIEW");
        button21.setPrefSize(hb, wb);button21.setFont(Font.font(15));

        Button button22 = new Button("¬");
        button22.setPrefSize(hb, wb);button22.setFont(Font.font(15));
        Button button23 = new Button("0");
        button23.setPrefSize(hb, wb);button23.setFont(Font.font(15));
        Button button24 = new Button(".");
        button24.setPrefSize(hb, wb);button24.setFont(Font.font(15));
        Button button25 = new Button("=");
        button25.setPrefSize(hb+1, wb);button25.setFont(Font.font(15));

        Button button26 = new Button("toInt");
        button26.setPrefSize(hb, wb);button26.setFont(Font.font(15));
        Button button27 = new Button("toFloat");
        button27.setPrefSize(hb, wb);button27.setFont(Font.font(15));
        Button button28 = new Button("toString");
        button28.setPrefSize(hb, wb);button28.setFont(Font.font(15));
        Button button29 = new Button("toBinary");
        button29.setPrefSize(hb, wb);button29.setFont(Font.font(15));

        Button button30 = new Button("INT");
        button30.setPrefSize(hb, wb);button30.setFont(Font.font(15));
        // button30.setStyle("-fx-text-fill: #ffffff");button30.setStyle("-fx-background-color: #121212");
        Button button31 = new Button("FLOAT");
        button31.setPrefSize(hb, wb);button31.setFont(Font.font(15));
        Button button32 = new Button("BOOL");
        button32.setPrefSize(hb, wb);button32.setFont(Font.font(15));
        Button button33 = new Button("STRING");
        button33.setPrefSize(hb, wb);button33.setFont(Font.font(15));
        Button button34 = new Button("BINARY");
        button34.setPrefSize(hb, wb);button34.setFont(Font.font(15));
        Button button35 = new Button("END");
        button35.setPrefSize(hb, wb);button35.setFont(Font.font(15));
        Button button36 = new Button("—");
        button36.setPrefSize(hb, wb);button36.setFont(Font.font(15));




        pane1.add(button0, 0, 0);
        pane1.add(button1, 1, 0);
        pane1.add(button2, 2, 0);
        pane1.add(button3, 3, 0);

        pane1.add(button4, 0, 1);
        pane1.add(button5, 1, 1);
        pane1.add(button6, 2, 1);
        pane1.add(button36, 0, 5);
        //pane1.add(button7, 3, 1);

        pane1.add(button8, 0, 2);
        pane1.add(button9, 1, 2);
        pane1.add(button11, 2, 2);
        pane1.add(button12, 3, 2);

        pane1.add(button13, 0, 3);
        pane1.add(button14, 1, 3);
        pane1.add(button15, 2, 3);
        pane1.add(button16, 3, 3);

        pane1.add(button17, 0, 4);
        pane1.add(button18, 1, 4);
        pane1.add(button19, 2, 4);
        pane1.add(button21, 3, 4);

        pane1.add(button22, 3, 1);
        pane1.add(button23, 1, 5);
        pane1.add(button24, 2, 5);
        pane1.add(button25, 3, 5);

        pane1.add(button26, 5, 0);
        pane1.add(button27, 5, 1);
        pane1.add(button28, 5, 2);
        pane1.add(button29, 5, 3);
        pane1.add(button35, 5, 4);


        pane1.add(button30, 4, 0);
        pane1.add(button31, 4, 1);
        pane1.add(button32, 4, 2);
        pane1.add(button33, 4, 3);
        pane1.add(button34, 4, 4);




        button0.setOnAction(new action());
        button1.setOnAction(new action());
        button2.setOnAction(new action());
        button3.setOnAction(new action());

        button4.setOnAction(new action());//borratodo
        button5.setOnAction(new action());
        button6.setOnAction(new action());
        // button7.setOnAction(new action());//delete operation

        button8.setOnAction(new action());
        button9.setOnAction(new action());
        button11.setOnAction(new action());
        button12.setOnAction(new action());

        button13.setOnAction(new action());
        button14.setOnAction(new action());
        button15.setOnAction(new action());
        button16.setOnAction(new action());

        button17.setOnAction(new action());
        button18.setOnAction(new action());
        button19.setOnAction(new action());
        button21.setOnAction(new action());

        button22.setOnAction(new action());
        button23.setOnAction(new action());
        button24.setOnAction(new action());
        button25.setOnAction(new action());

        button26.setOnAction(new action()); // transformaciones y nuevos numeros
        button27.setOnAction(new action());
        button28.setOnAction(new action());
        button29.setOnAction(new action());
        button30.setOnAction(new action());
        button31.setOnAction(new action());
        button32.setOnAction(new action());
        button33.setOnAction(new action());
        button34.setOnAction(new action());
        button35.setOnAction(new action());
        button36.setOnAction(new action());


        label1.setPrefSize(h+400+100, w+20);
        label1.setFont(Font.font(20));
        //label1.setTextAlignment(TextAlignment.CENTER);


        VBox pane = new VBox(10, label1, pane1);
        //    pane.setStyle("-fx-background-color: #e2e2e2");

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Scrabble Calculator");
        pane.setBackground(new Background(myBI));
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    class action implements EventHandler<ActionEvent> {

        /** Entretga la operacion encontrada  */
        public String op(StringBuilder str){

            if(str.indexOf("+")!=-1){return "+";}
            else if(str.indexOf("-")!=-1){return "-";}
            else if(str.indexOf("*")!=-1){return "*";}
            else if(str.indexOf("/")!=-1){return "/";}
            else if(str.indexOf("∨")!=-1){return "∨";}
            else if(str.indexOf("∧")!=-1){return "∧";}
            else {
                return null;
            }
        }
        /** Entrega la ultima operacion informada */
        public String ActualOp(StringBuilder str){
            for(int i = str.length()-1; i>=0 ;i--){
                StringBuilder Si = new StringBuilder(Character.toString(str.charAt(i)));
                if(op(Si) != null){
                    return op(Si);
                }
                else{
                    continue;
                }
            }
            return null;

        }
        /** Contruye las Constasntes del arbol segun su tipo*/
        public Constante Build(String str,String dato){
            if(dato.indexOf("—")!=-1){dato = dato.replace("—","-");}
            try {
                if(str.equals("INT"))
                {

                    Int i = new Int(Integer.parseInt(dato));


                    Constante value = ConstanteFactory.CreateInt(i);
                    return value;
                }
                else if(str.equals("BOOL"))
                {
                    if(dato.equals("true")){
                        Bool i = new Bool(true);
                        Constante value = ConstanteFactory.CreateBool(i);
                        return value;
                    }
                    else{
                        Bool i = new Bool(false);
                        Constante value = ConstanteFactory.CreateBool(i);
                        return value;
                    }

                }
                else if(str.equals("FLOAT"))
                {
                    Float i = new Float(Double.parseDouble(dato));
                    Constante value = ConstanteFactory.CreateFloat(i);
                    return value;
                }
                else if(str.equals("BINARY"))
                {
                    Binary i = new Binary(dato);
                    Constante value = ConstanteFactory.CreateBinary(i);
                    return value;
                }
                else if(str.equals("STRING")) {
                    string i = new string(dato);
                    Constante value = ConstanteFactory.CreateString(i);
                    return value;
                }
            }catch (NumberFormatException error){
                label1.setText("Error de formato");
            }

            return null;
        }
        /** Crea las operaciones del arbol */
        public void ensamblar(StringBuilder str){
            if( !firstExpresion && !ready){
                ready = true;
                String var1 =str.substring(str.indexOf("(")+1,str.indexOf(")"));
                String var2 =str.substring(str.indexOf("(",str.indexOf(op(str)))+1,str.length()-1);
                StringBuilder str2 =new StringBuilder(str.substring(0,str.lastIndexOf(ActualOp(str))));

                String Type1 = str2.substring(0,str2.lastIndexOf("("));
                String Type2 = str.substring(str.lastIndexOf(ActualOp(str))+1,str.lastIndexOf("("));
                Constante value1 = Build(Type1,var1);
                Constante value2 = Build(Type2,var2);

                if(ActualOp(str).equals("+")){t.setRoot(new Suma(value1,value2));}
                else if(ActualOp(str).equals("-")){t.setRoot(new Resta(value1,value2));}
                else if(ActualOp(str).equals("*")){t.setRoot(new Mult(value1,value2));}
                else if(ActualOp(str).equals("/")){t.setRoot(new Division(value1,value2));}
                else if(ActualOp(str).equals("∨")){t.setRoot( new OR(value1,value2));}
                else if(ActualOp(str).equals("∧")){t.setRoot( new AND(value1,value2));}
                else {
                    System.out.println("No hay operacion encotrada al inicio");
                }

            }else if (ready){
                System.out.println(str);
                String var2 =str.substring(str.lastIndexOf("(")+1,str.length()-1);
                StringBuilder Finalstr =new StringBuilder(str.substring(str.indexOf(ActualOp(str))+1,str.lastIndexOf("(")));
                String type;
                try {
                    type = Finalstr.substring(Finalstr.indexOf(ActualOp(Finalstr))+1);
                }
                catch(Exception e){
                    type = Finalstr.toString();
                }
                Constante value =Build(type,var2);
                if(ActualOp(str).equals("+")){t.addSuma(value);}
                else if(ActualOp(str).equals("-")){t.addResta(value);}
                else if(ActualOp(str).equals("*")){t.addMult(value);}
                else if(ActualOp(str).equals("/")){t.addDivision(value);}
                //else if(ActualOp(str)=="¬"){Expresion OP = new NOT(value1,value2);}
                else if(ActualOp(str).equals("∨")){t.addOR(value);}
                else if(ActualOp(str).equals("∧")){t.addAND(value);}
                else {
                    System.out.println("No hay operacion encotrada");
                }
            }
        }


        @Override
        public void handle(ActionEvent event) {
            String a = event.toString();
            System.out.println(a);
            int from = a.indexOf("'");
            System.out.println(a.substring(from+1, a.length()-2));
            String BOTON = a.substring(from+1, a.length()-2);

            try{
                switch (BOTON) {
                    case "STRING":
                    case "BOOL":
                    case "BINARY":
                    case "FLOAT":
                    case "INT":
                        lab.append(BOTON+"(");
                        label1.setText(lab.toString());
                        System.out.println(BOTON);
                        break;
                    case "0":
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                    case ".":
                    case "true":
                    case "false":  // agregamos los numeros/valores
                        lab.append(BOTON);
                        label1.setText(lab.toString());
                        System.out.println(BOTON);
                        break;
                    case "—":  // signo negativo
                        lab.append(BOTON);
                        label1.setText(lab.toString());
                        System.out.println(BOTON);
                        break;
                    case "∨":
                    case "∧":
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        firstExpresion = false;
                        lab.append(BOTON);//Record characters
                        label1.setText(lab.toString());
                        System.out.println(BOTON);
                        break;
              /*  case "←":
                    lab.deleteCharAt(lab.length() - 1);
                    label1.setText(lab.toString());
                    System.out.println("←");
                    break;*/
                    case "BORRAR":
                        lab = new StringBuilder();
                        label1.setText(lab.toString());
                        t.setRoot(null);
                        firstExpresion = true;
                        ready = false;
                        break;
                    case "¬":
                        t.Not();
                        lab.insert(0,BOTON+"[");
                        lab.insert(lab.length(),"]");
                        label1.setText(t.print());
                        System.out.println(BOTON);
                        break;
                    case "toString":
                        t.tostring();
                        lab.insert(0,BOTON+"[");
                        lab.insert(lab.length(),"]");
                        label1.setText(t.print());
                        System.out.println(BOTON);
                        break;
                    case "toBinary":
                        t.toBinary();
                        lab.insert(0,BOTON+"[");
                        lab.insert(lab.length(),"]");
                        label1.setText(t.print());
                        System.out.println(BOTON);
                        break;
                    case "toInt":
                        t.toInt();
                        lab.insert(0,BOTON+"[");
                        lab.insert(lab.length(),"]");
                        label1.setText(t.print());
                        System.out.println(BOTON);
                        break;
                    case "toFloat":
                        t.toFloat();
                        lab.insert(0,BOTON+"[");
                        lab.insert(lab.length(),"]");
                        label1.setText(t.print());
                        System.out.println(BOTON);
                        break;

                    case "VIEW":
                        try {
                            String res = t.calculate().tostring().print();
                            label1.setText(t.print()+" = "+res);
                        }
                        catch (Exception problem){
                            label1.setText("NO HAY REPRESENTACION");
                        }
                        break;
                    case "END":
                        lab.append(")");
                        label1.setText(lab.toString());
                        System.out.println(BOTON);
                        System.out.println(lab);
                        ensamblar(lab);
                        if (t.getRoot() != null)
                        {
                            label1.setText(t.print());
                        }
                        break;

                    case "=":
                        try{
                            String res = t.calculate().tostring().print();
                            String expression = lab.toString();
                            label1.setText(expression + " = " + res);
                            break;
                        }
                        catch (Exception error){
                            label1.setText("ERROR");
                        }
                }
            }
            catch (NullPointerException e){
                label1.setText("ERROR");
            }

        }
    }
}