package schritt4;

import schritt1.Spieler1;
import schritt1.Trainer;
import schritt2.Torwart;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList <Spieler1> spieler1List;
    int motivation = 0;
    int staerke = 0;
    public Mannschaft(String name, Trainer trainer, Torwart torwart){
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
    }
    public int getMotivation(){
        for (Spieler1 s: spieler1List)
        motivation += s.getMotivation();
        motivation += torwart.getMotivation();
        int motivationsschnitt = motivation/(spieler1List.size() + 1);
        return motivationsschnitt;
    }
    public int getStaerke(){
        for (Spieler1 s: spieler1List)
            staerke += s.getStärker();
        staerke += torwart.getStärker();
        int staerkendurchschnitt = staerke/(spieler1List.size() +1);
        return staerkendurchschnitt;
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
}
