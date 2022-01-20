package schritt2;

import schritt1.Spieler1;

public class Torwart extends Spieler1 {


    public Torwart(String name, int alter, int staerke, int motivation, int reaktion){
        super(name,alter,staerke,0,motivation,0);
        this.reaktion = reaktion;
    }


    public String oString() {
        return "Torwart" +
                "reaktion = " + reaktion ;
    }

    private int reaktion;


    public int getReaktion() {
        return reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }
}
