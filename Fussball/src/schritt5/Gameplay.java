package schritt5;
import schritt1.Spieler;
import schritt2.Torwart;
import schritt4.Ergebnis;
import schritt4.Mannschaft;
import schritt4.Spiel;
import schritt6.SpielAbbruchException;

import java.util.ArrayList;
import java.util.Random;

public class Gameplay {
    private static final int SPIELZEIT = 90;
    private static final int MAXIMALE_NACHSPIELZEIT = 5;
    private static final int MAXIMALE_DAUER_BIS_AKTION = 10;
    private static int ermittelnMannschftswert(Mannschaft mannschaft) {
        int mannschaftswert = mannschaft.getMotivation() * mannschaft.getStaerke() * mannschaft.getTrainer().getErfahrung();
        mannschaftswert = Math.max(mannschaftswert, 1);
        return mannschaftswert;
    }
    private static boolean erzielenTor(Spieler schuetze, Torwart torwart) {
        boolean tor;
        Random r = new Random();
        int torschuss = schuetze.getTorschuss() + r.nextInt(5) - 2;
        if (torschuss <= 0) {
            torschuss = 1;
        }
        int reaktion = torwart.getReaktion() + r.nextInt(5) - 2;
        if (reaktion <= 0) {
            reaktion = 1;
        }
        if (torschuss > reaktion) {
            tor = true;
        } else {
            tor = false;
        }
        return tor;
    }
    public static boolean brecheSpielAb(){
        boolean k = false;
        Random r = new Random();
        int spielabbruch;
        spielabbruch = r.nextInt(1000);

        if (spielabbruch == 0){
            k = true;
        }else{
            k = false;
        }
        return k;
    }

    public static void spielen(Spiel spiel)throws SpielAbbruchException {

        Random r = new Random();
        Mannschaft offensiv;
        Mannschaft defensiv;
        int nachspielzeit = r.nextInt(MAXIMALE_NACHSPIELZEIT+1);
        int spielZeit = SPIELZEIT + nachspielzeit;
        int naechsteaktionZufall = r.nextInt(MAXIMALE_DAUER_BIS_AKTION+1);
        int aktionminute = naechsteaktionZufall;
        Mannschaft heim = spiel.getHeim();
        int mannschaftsWertHeim = ermittelnMannschftswert(heim);
        Mannschaft gast = spiel.getGast();
        int mannschaftsWertGast = ermittelnMannschftswert(gast);
        int summe = mannschaftsWertHeim + mannschaftsWertGast;
        int zufall = r.nextInt(summe + 1);
do {
        if (brecheSpielAb()) {
            throw new SpielAbbruchException(aktionminute); }

        if (zufall <= mannschaftsWertHeim) {
            offensiv = spiel.getHeim();
            defensiv = spiel.getGast();
        }
        else {
            offensiv = spiel.getGast();
            defensiv = spiel.getHeim();
        }
        int j = 0;
        for (int i = 0; i < spielZeit; i++) {
            if (j + naechsteaktionZufall == i) {
                int summme = mannschaftsWertGast + mannschaftsWertHeim;
                int zufall1 = r.nextInt(summme+1);
                if (zufall1 > mannschaftsWertHeim) {
                    ArrayList<Spieler> gast_ = gast.getSpielerList();
                    zufall1 = r.nextInt(gast_.size());
                    Spieler schuetze = gast_.get(zufall1);
                    Torwart torwart = gast.getTorwart();
                    erzielenTor(schuetze, torwart);
                    System.out.println("Torschuss Gast Bei Minute \t " + aktionminute  + "\nSchützen Trikot Nummer \t" + zufall1);
                    boolean tor = erzielenTor(schuetze, torwart);
                    if (tor) {
                        Ergebnis ergebnis = spiel.getErgebnis();
                        ergebnis.TrefferGast();
                        schuetze.setTore(+1);
                        System.out.println("Treffer");
                    } else {
                        System.out.println("Gehalten");
                    }
                } else {
                    ArrayList<Spieler> heim_ = heim.getSpielerList();
                    zufall1 = r.nextInt(heim_.size());
                    Spieler schuetze = heim_.get(zufall1);
                    Torwart torwart = heim.getTorwart();
                    erzielenTor(schuetze, torwart);
                    System.out.println();
                    System.out.println("Torschuss Heim Bei Minute  \t" + aktionminute + "\nSchützen Trikot Nummer \t" + zufall1);
                    boolean tor = erzielenTor(schuetze, torwart);
                    if (tor) {
                        Ergebnis ergebnis = spiel.getErgebnis();
                        ergebnis.TrefferHeim();
                        schuetze.setTore(+1);
                        System.out.println("Treffer");
                    } else {
                        System.out.println("Gehalten");
                    }
                }}
                naechsteaktionZufall = r.nextInt(MAXIMALE_DAUER_BIS_AKTION + 1);
                aktionminute = aktionminute + naechsteaktionZufall;
                j = i;

            }

        }while ((SPIELZEIT+nachspielzeit) > aktionminute);
    }
}
