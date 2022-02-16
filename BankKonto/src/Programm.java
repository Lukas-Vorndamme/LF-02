public class Programm {
    public static void main(String[] args) throws KeineGeldExeption {



        Mitarbeiter mitarbeiter = new Mitarbeiter("Hans", "Werner");
        Kunde kunde = new Kunde("ja", "nein", mitarbeiter);
        GiroKonto giroKonto = new GiroKonto(kunde, 2000, 1500, 0.2);
        System.out.println(giroKonto.getKontoStand()+"€");
        giroKonto.einzahlen(100);
        System.out.println(giroKonto.getKontoStand()+"€");
        giroKonto.auszahlen(10000);
        Sparkonto sparkonto = new Sparkonto(kunde,1500,1.6);
        System.out.println(sparkonto.getKontoStand());
        System.out.println(sparkonto.zinsen(1500,1.5));
        mitarbeiter.setAdresse("Haupstr 44 28023 Bremen");
        System.out.println("\n Mitarbeiter" + mitarbeiter);




    }





}




