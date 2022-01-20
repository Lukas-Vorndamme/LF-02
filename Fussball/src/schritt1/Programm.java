package schritt1;


import schritt2.Torwart;


public class Programm {
    public static void main(String[] args) {

        Trainer trainer = new Trainer("Hansie", 35, 4);
        Spieler1 spieler1 = new Spieler1("Lukas", 21, 10, 120, 10, 100);
        Spieler1 spieler2 = new Spieler1("Lukas", 21, 10, 120, 10, 100);
        Spieler1 spieler3 = new Spieler1("Lukas", 21, 10, 120, 10, 100);
        Spieler1 spieler4 = new Spieler1("Lukas", 21, 10, 120, 10, 100);
        Spieler1 spieler6 = new Spieler1("Lukas", 21, 10, 120, 10, 100);
        Spieler1 spieler7 = new Spieler1("Lukas", 21, 10, 120, 10, 100);
        Spieler1 spieler8 = new Spieler1("Lukas", 21, 10, 120, 10, 100);
        Spieler1 spieler9 = new Spieler1("Lukas", 21, 10, 120, 10, 100);
        Spieler1 spieler10 = new Spieler1("Lukas", 21, 10, 120, 10, 100);

        Torwart torwart = new Torwart("Neuer", 25, 8, 8, 9);
        System.out.println("\nTrainer" + "\n"+"  Name = \t\t" + trainer.getName() +"\n" +"  Alter = \t\t" + trainer.getAlter() + trainer);
        System.out.println("\nSpieler" + "\n"+"  Name = \t\t" +spieler1.getName() +"\n" +"  Alter = \t\t" +  spieler1.getAlter() + spieler1);
        System.out.println("\nTorwart" +"\n"+"  Name = \t\t" +  torwart.getName() +"\n" +"  Alter = \t\t" +  torwart.getAlter() +  torwart);


    }
}
