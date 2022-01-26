package schritt1;


import schritt2.Torwart;
import schritt4.Ergebnis;
import schritt4.Mannschaft;
import schritt4.Spiel;

import java.util.ArrayList;


public class Programm {
    public static void main(String[] args) {

        Trainer trainer = new Trainer("Hansie", 35, 4);
        Trainer trainer1 = new Trainer("Hansie", 35, 4);
        Spieler1 spieler1  = new Spieler1("Lukas", 21, 9, 53, 10, 86);
        Spieler1 spieler2  = new Spieler1("Lukas", 21, 8, 55, 9, 82);
        Spieler1 spieler3  = new Spieler1("Lukas", 21, 5, 62, 6, 77);
        Spieler1 spieler4  = new Spieler1("Lukas", 21, 4, 48, 9, 24);
        Spieler1 spieler5  = new Spieler1("Lukas", 21, 6, 58, 9, 45);
        Spieler1 spieler6  = new Spieler1("Lukas", 21, 7, 59, 5, 65);
        Spieler1 spieler7  = new Spieler1("Lukas", 21, 5, 60, 4, 95);
        Spieler1 spieler8  = new Spieler1("Lukas", 21, 2, 78, 6, 74);
        Spieler1 spieler9  = new Spieler1("Lukas", 21, 8, 65, 8, 58);
        Spieler1 spieler10 = new Spieler1("Lukas", 21, 6, 49, 9, 49);
        Spieler1 spieler11 = new Spieler1("Lukas", 21, 3, 67, 5, 65);
        Spieler1 spieler12 = new Spieler1("Lukas", 21, 7, 24, 8, 35);
        Spieler1 spieler13 = new Spieler1("Lukas", 21, 8, 67, 9, 75);
        Spieler1 spieler14 = new Spieler1("Lukas", 21, 5, 68, 5, 48);
        Spieler1 spieler15 = new Spieler1("Lukas", 21, 7, 94, 10, 45);
        Spieler1 spieler16 = new Spieler1("Lukas", 21, 9, 84, 7, 86);
        Spieler1 spieler17 = new Spieler1("Lukas", 21, 5, 61, 8, 46);
        Spieler1 spieler18 = new Spieler1("Lukas", 21, 4, 75, 9, 48);
        Spieler1 spieler19 = new Spieler1("Lukas", 21, 8, 69, 6, 51);
        Spieler1 spieler20 = new Spieler1("Lukas", 21, 7, 88, 7, 68);



        Torwart torwart = new Torwart("Neuer", 25, 8, 8, 9);
        Torwart torwart1 = new Torwart("Neuer", 25, 9, 7, 10);

        ArrayList<Spieler1> spielerHeim = new ArrayList<>();
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


        ArrayList<Spieler1> spielerGast = new ArrayList<>();
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
        System.out.println(spiel);


    }
}
