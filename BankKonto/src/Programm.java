public class Programm {
    public static void main(String[] args) {

        Mitarbeiter mitarbeiter = new Mitarbeiter("Hans", "Werner");
        Kunde kunde = new Kunde("ja", "nein", mitarbeiter);
        GiroKonto giroKonto = new GiroKonto(kunde, 2000, 1500, 0.2);
        System.out.println(giroKonto.getKontoStand()+"€");
        giroKonto.einzahlen(100);
        System.out.println(giroKonto.getKontoStand()+"€");
        giroKonto.auszahlen(10000);


    }





}




