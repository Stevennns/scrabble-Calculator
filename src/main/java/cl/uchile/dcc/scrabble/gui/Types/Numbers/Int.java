package cl.uchile.dcc.scrabble.gui.Types.Numbers;


import cl.uchile.dcc.scrabble.gui.Types.string;

public class Int {
    int number;

    public Int(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Float toFloat() {
        //String stringNum =this.number.toString();
        java.lang.Float F = java.lang.Float.valueOf(this.number);
        return new Float(F);
    }

    public Binary toBinary(){
        String i =Integer.toBinaryString(this.number);
        return new Binary(i);

    }

    public string tostring(){
        String s = Integer.toString(this.number);
        return new string(s);
    }


}

