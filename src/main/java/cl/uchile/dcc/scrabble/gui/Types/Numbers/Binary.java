package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.string;

import java.util.Objects;

public class Binary {
    private String number;

    public Binary(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public Int toInt(){
        int i =Integer.parseInt(this.number, 2);
        return new Int(i);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Binary) {
            var o = (Binary) obj;
            return o.number.equals(this.number);
        }
        return false;
    }



    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public string tostring(){
        return new string(getNumber().toString());
    }
}
