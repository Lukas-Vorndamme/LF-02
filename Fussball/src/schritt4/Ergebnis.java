package schritt4;

public class Ergebnis {

    private int trefferHeim;
    private int trefferGast;

    @Override
    public String toString() {
        return
                "\nTrefferHeim = " + trefferHeim +
                "\nTrefferGast = " + trefferGast ;
    }

    public int getTrefferGast() {
        return trefferGast;
    }
    public void TrefferGast(){
        trefferGast++;
    }

    public int getTrefferHeim() {
        return trefferHeim;
    }
    public void TrefferHeim(){
        trefferHeim++;
    }
}