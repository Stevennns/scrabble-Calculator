package cl.uchile.dcc.scrabble.gui.Types;

public abstract class AbstractType implements Type{

    public string AddString(Type sumando){
        return new string(this.toString() + sumando.toString());
    }

}
