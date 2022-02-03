package schritt1;


import schritt2.Torwart;
import schritt4.Ergebnis;
import schritt4.Mannschaft;
import schritt4.Spiel;
import schritt5.Gameplay;

import java.util.ArrayList;


public class Programm {
    public static void main(String[] args) {
        Gameplay gameplay = new Gameplay();
        Trainer trainer = new Trainer("Hansie", 35, 4);
        Trainer trainer1 = new Trainer("Hansie", 35, 4);
        Spieler spieler1  = new Spieler("Lukas", 21, 9, 53, 10, 86);
        Spieler spieler2  = new Spieler("Lukas", 21, 8, 55, 9, 82);
        Spieler spieler3  = new Spieler("Lukas", 21, 5, 62, 6, 77);
        Spieler spieler4  = new Spieler("Lukas", 21, 4, 48, 9, 24);
        Spieler spieler5  = new Spieler("Lukas", 21, 6, 58, 9, 45);
        Spieler spieler6  = new Spieler("Lukas", 21, 7, 59, 5, 65);
        Spieler spieler7  = new Spieler("Lukas", 21, 5, 60, 4, 95);
        Spieler spieler8  = new Spieler("Lukas", 21, 2, 78, 6, 74);
        Spieler spieler9  = new Spieler("Lukas", 21, 8, 65, 8, 58);
        Spieler spieler10 = new Spieler("Lukas", 21, 6, 49, 9, 49);
        Spieler spieler11 = new Spieler("Lukas", 21, 3, 67, 5, 65);
        Spieler spieler12 = new Spieler("Lukas", 21, 7, 24, 8, 35);
        Spieler spieler13 = new Spieler("Lukas", 21, 8, 67, 9, 75);
        Spieler spieler14 = new Spieler("Lukas", 21, 5, 68, 5, 48);
        Spieler spieler15 = new Spieler("Lukas", 21, 7, 94, 10, 45);
        Spieler spieler16 = new Spieler("Lukas", 21, 9, 84, 7, 86);
        Spieler spieler17 = new Spieler("Lukas", 21, 5, 61, 8, 46);
        Spieler spieler18 = new Spieler("Lukas", 21, 4, 75, 9, 48);
        Spieler spieler19 = new Spieler("Lukas", 21, 8, 69, 6, 51);
        Spieler spieler20 = new Spieler("Lukas", 21, 7, 88, 7, 68);



        Torwart torwart = new Torwart("Neuer", 25, 8, 8, 9);
        Torwart torwart1 = new Torwart("Neuer", 25, 9, 7, 10);

        ArrayList<Spieler> spielerHeim = new ArrayList<>();
        spielerHeim.add(spieler1);
        spielerHeim.add(spieler2);
        spielerHeim.add(spieler3);
        spielerHeim.add(spieler4);
        spielerHeim.add(spieler5);
        spielerHeim.add(spieler6);
        spielerHeim.add(spieler7);
        spielerHeim.add(spieler8);
        spielerHeim.add(spieler9);
        spielerHeim.add(spieler10);
        spielerHeim.add(torwart1);

        Mannschaft heim = new Mannschaft("Heim", trainer, torwart, spielerHeim);


        ArrayList<Spieler> spielerGast = new ArrayList<>();
        spielerGast.add(spieler11);
        spielerGast.add(spieler12);
        spielerGast.add(spieler13);
        spielerGast.add(spieler14);
        spielerGast.add(spieler15);
        spielerGast.add(spieler16);
        spielerGast.add(spieler17);
        spielerGast.add(spieler18);
        spielerGast.add(spieler19);
        spielerGast.add(spieler20);
        spielerGast.add(torwart);
        Mannschaft gast = new Mannschaft("Gast", trainer1, torwart1, spielerGast);

        System.out.println("\nTrainer" + "\n"+"  Name = \t\t" + trainer.getName() +"\n" +"  Alter = \t\t" + trainer.getAlter() + trainer);
        System.out.println("\nSpieler" + "\n"+"  Name = \t\t" +spieler1.getName() +"\n" +"  Alter = \t\t" +  spieler1.getAlter() + spieler1);
        System.out.println("\nTorwart" +"\n"+"  Name = \t\t" +  torwart.getName() +"\n" +"  Alter = \t\t" +  torwart.getAlter() +  torwart);

        Ergebnis ergebnis = new Ergebnis();
        ergebnis.TrefferGast();
        Spiel spiel = new Spiel(heim,gast,ergebnis);
        gameplay.spielen(spiel);
        System.out.println(spiel);




    }
}
