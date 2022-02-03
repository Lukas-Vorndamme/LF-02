package schritt4;

import schritt1.Spieler;
import schritt1.Trainer;
import schritt2.Torwart;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spieler1List;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerList) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spieler1List = spielerList;
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

        for (Spieler s : spieler1List) {
            gesamtMotivation += s.getMotivation();
        }



        gesamtMotivation = gesamtMotivation + torwart.getMotivation();

        gesamtMotivation = gesamtMotivation / spieler1List.size()+1;
        System.out.println(gesamtMotivation);
        return gesamtMotivation;

    }

    public int getStaerke() {
        int gesamtStaerke = 0;
        for (Spieler s : spieler1List) {
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

    public ArrayList<Spieler> getSpielerList() {
        return spieler1List;
    }
}
