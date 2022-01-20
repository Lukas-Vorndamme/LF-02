package schritt1;

public class Spieler1 {


    private String name;
    private int alter;
    private int staerker;
    private int torschuss;
    private int motivation;
    private int tore;

    public Spieler1(String name, int alter, int staerker, int torschuss, int motivation, int tore) {
        this.name = name;
        this.alter = alter;
        this.staerker = staerker;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.tore = tore;
    }

    @Override
    public String toString() {
        return
                "\n  Name = \t\t" + name  +
                "\n  Alter = \t\t" + alter +
                "\n  Stärker = \t" + staerker +
                "\n  Torschuss = \t" + torschuss +
                "\n  Motivation = \t" + motivation +
                "\n  Tore = \t\t" + tore ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public int getStärker() {
        return staerker;
    }

    public void setStärker(int stärker) {
        this.staerker = stärker;
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




