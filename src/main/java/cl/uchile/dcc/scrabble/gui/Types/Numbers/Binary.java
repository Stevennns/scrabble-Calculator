package cl.uchile.dcc.scrabble.gui.Types.Numbers;

import cl.uchile.dcc.scrabble.gui.Types.string;

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

    public string tostring(){

        return new string(getNumber().toString());
    }
}
