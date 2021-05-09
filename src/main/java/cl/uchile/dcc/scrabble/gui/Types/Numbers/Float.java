package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.string;

public class Float {
    double number;
    public Float(double number ){
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
    public string tostring(){
        String s = Double.toString(this.number);
        return new string(s);
    }
}
