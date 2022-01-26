package schritt4;

import schritt1.Spieler1;
import schritt1.Trainer;
import schritt2.Torwart;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler1> spieler1List;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler1> spielerList) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
    }

    @Override
    public String toString() {
        return "Mannschaft" +
                "\nName = \t\t  " + name +
                "\nTrainer  \t\t" + trainer +
                "\nTorwart = \t\t" + torwart;

    }

    public int getMotivation() {
        int gesamtMotivation = 0;
        for (Spieler1 s : spieler1List) {
            gesamtMotivation = gesamtMotivation + s.getMotivation();
        }

        gesamtMotivation = gesamtMotivation + torwart.getMotivation();

        gesamtMotivation = gesamtMotivation / spieler1List.size();

        return gesamtMotivation;
    }

    public int getStaerke() {
        int gesamtStaerke = 0;
        for (Spieler1 s : spieler1List) {
            gesamtStaerke = gesamtStaerke + s.getStaerke();
        }
        gesamtStaerke = gesamtStaerke + torwart.getStaerke();

        gesamtStaerke = gesamtStaerke / spieler1List.size();

        return gesamtStaerke;
    }

    public String getName() {
        return name;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public ArrayList<Spieler1> getSpieler1List() {
        return spieler1List;
    }
}
