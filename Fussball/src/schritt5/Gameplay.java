package schritt5;


import schritt1.Spieler1;
import schritt1.Trainer;
import schritt2.Torwart;
import schritt4.Ergebnis;
import schritt4.Mannschaft;
import schritt4.Spiel;

import java.util.ArrayList;
import java.util.Random;


public class Gameplay {

    private static final int Spielzeit = 90;
    private static final int MaximaleNachspielzeit = 5;
    private static final int MaximaleDauerBisAktion = 10;


    public static int ermittelnMannschftswert(Mannschaft mannschaft) {
        Trainer trainer = mannschaft.getTrainer();
        int mannschaftswert = mannschaft.getMotivation() * mannschaft.getStaerke() * trainer.getErfahrung();
        if (mannschaftswert == 0) {
            mannschaftswert = 1;
        }
        return mannschaftswert;
    }

    private static boolean erzielenTor(Spieler1 schuetze, Torwart torwart) {

        boolean tor;
        Random r = new Random();
        int wert = r.nextInt(5) - 2;
        int wert1 = r.nextInt(5) - 2;


        int torschuss = schuetze.getTorschuss() + wert;
        if (torschuss <= 0) {
            torschuss = 1;
        }
        int reaktion = torwart.getReaktion() + wert;
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

    public static void spielen(Spiel spiel) {
        Random r = new Random();
        int nachspielzeit = r.nextInt(MaximaleNachspielzeit);
        int spielZeit = Spielzeit + nachspielzeit;
        int naechsteaktionZufall = r.nextInt(MaximaleDauerBisAktion);


        Mannschaft heim = spiel.getHeim();
        int mannschaftsWertHeim = ermittelnMannschftswert(heim);
        Mannschaft gast = spiel.getGast();
        int mannschaftsWertGast = ermittelnMannschftswert(gast);
int j = 0;
        for (int i = 0; i < spielZeit; i++) {
            if (j + naechsteaktionZufall == i);
            int summme = mannschaftsWertGast + mannschaftsWertHeim;


            int zufall = r.nextInt(summme);
            if (zufall > mannschaftsWertHeim) {
                ArrayList<Spieler1> gast_ = gast.getSpieler1List();
                zufall = r.nextInt(gast_.size());
                Spieler1 schuetze = gast_.get(zufall);
                Torwart torwart = gast.getTorwart();
                erzielenTor(schuetze, torwart);
                boolean tor = erzielenTor(schuetze, torwart);
                if (tor) {
                    Ergebnis ergebnis = spiel.getErgebnis();
                    ergebnis.TrefferGast();
                }


            } else {
                ArrayList<Spieler1> heim_ = heim.getSpieler1List();
                zufall = r.nextInt(heim_.size());
                Spieler1 schuetze = heim_.get(zufall);
                Torwart torwart = heim.getTorwart();
                erzielenTor(schuetze, torwart);
                boolean tor = erzielenTor(schuetze, torwart);
                if (tor) {
                    Ergebnis ergebnis = spiel.getErgebnis();
                    ergebnis.TrefferHeim();


                }
            }
            naechsteaktionZufall = r.nextInt(MaximaleDauerBisAktion);
            j = i;
        }
    }
}