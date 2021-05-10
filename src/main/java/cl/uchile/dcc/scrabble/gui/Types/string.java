package cl.uchile.dcc.scrabble.gui.Types;

import java.util.Objects;

public class string {
    private String s = "";

    public string(String s){
        this.s = s;
    }

    public String getString() {
        return s;
    }

    public void setString(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof string) {
            var o = (string) obj;
            return o.s.equals(this.s);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}
