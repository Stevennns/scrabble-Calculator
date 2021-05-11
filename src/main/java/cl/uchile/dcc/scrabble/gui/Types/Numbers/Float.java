package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.string;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o instanceof Float) {
            var ob = (Float) o;
            Double n = ob.getNumber();
            return n == this.number;

        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
