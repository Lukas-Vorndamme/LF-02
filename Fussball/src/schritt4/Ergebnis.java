package schritt4;

public class Ergebnis {

    private int addToreHeim;
    private int addToreGast;

    @Override
    public String toString() {
        return
                "\nTrefferHeim = " + addToreHeim +
                "\nTrefferGast = " + addToreGast;
    }

    public int addToregast() {
        return addToreGast;
    }
    public void TrefferGast(){
        addToreGast++;
    }

    public int AddToreHeim() {
        return addToreHeim;
    }
    public void TrefferHeim(){
        addToreHeim++;
    }
}
