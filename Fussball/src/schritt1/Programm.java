package schritt1;


import schritt2.Torwart;

public class Programm {
    public static void main(String[] args) {

        Trainer trainer = new Trainer("Hansie", 35, 4);
        Spieler1 spieler1 = new Spieler1("Thomas", 21, 5, 12, 21, 32);
        Torwart torwart = new Torwart("Neuer",25,8,8,9);
          System.out.println(trainer);
        System.out.println("Spieler\n" +spieler1);
        System.out.println("Torwart\n" +torwart);

    }
}
