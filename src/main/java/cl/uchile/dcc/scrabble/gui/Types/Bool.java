package cl.uchile.dcc.scrabble.gui.Types;

import java.util.Objects;

public class Bool {
    private boolean bool;
    public Bool(boolean bool){
        this.bool = bool;
    }

    public boolean getBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public string tostring(){

        return new string(Boolean.toString(this.bool));
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Bool){
            Bool ob = (Bool) o;
            return ob.bool == this.bool;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Bool.class);
    }
}
