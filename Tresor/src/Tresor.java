import java.util.ArrayList;

public class Tresor {

    double summe = 0;
    private ArrayList<Gegenstand> gegenstaende = new ArrayList<>();

    public Tresor tresor = new Tresor();


    public void addGegenstand(Gegenstand gegenstand) {
        gegenstaende.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand) {
        gegenstaende.remove(gegenstand);
    }

    public double berechnenGesamtwert() {
        for (int i = 0; i < gegenstaende.size(); i++)
            // for (Gegenstand g : gegenstaende) {
            //      g.getWert();
            summe += gegenstaende.get(i).getWert();
        return summe;
    }

    @Override
    public String toString() {
        return "Tresor" +
                "summe = " + summe +
                "gegenstaende = " + gegenstaende +
                "tresor = " + tresor +
                "gegenstand = " + gegenstaende;

    }
}
