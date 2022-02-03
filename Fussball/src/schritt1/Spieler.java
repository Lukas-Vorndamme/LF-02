package schritt1;

import schritt3.Person;

public class Spieler extends Person {


    private int staerke;
    private int torschuss;
    private int motivation;
    private int tore;

    public Spieler(String name, int alter, int staerker, int torschuss, int motivation, int tore) {
      super(name,alter);
        this.staerke = staerker;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.tore = tore;
    }

    @Override
    public String toString() {
        return

                "\n  Staerke = \t" + staerke +
                "\n  Torschuss = \t" + torschuss +
                "\n  Motivation = \t" + motivation +
                "\n  Tore = \t\t" + tore ;
    }


    public int getStaerke() {
        return staerke;
    }

    public void setStärker(int staerke) {
        this.staerke = staerke;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getTore() {
        return tore;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }


}




