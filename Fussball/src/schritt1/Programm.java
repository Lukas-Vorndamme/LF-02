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
        Spieler1 spieler1  = new Spieler1("Lukas", 21, 10, 120, 10, 100);
        Spieler1 spieler2  = new Spieler1("Lukas", 21, 10, 120, 10, 100);

        Torwart torwart = new Torwart("Neuer", 25, 8, 8, 9);
        Torwart torwart1 = new Torwart("Neuer", 25, 8, 8, 9);

        ArrayList<Spieler1> spielerHeim = new ArrayList<>();
        spielerHeim.add(spieler1);
        Mannschaft heim = new Mannschaft("Heim", trainer, torwart, spielerHeim);


        ArrayList<Spieler1> spielerGast = new ArrayList<>();
        spielerHeim.add(spieler2);
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
