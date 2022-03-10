public class Program {
    public static void main(String[] args) throws GegenstandNichtGefundException {
        Tresor tresor = new Tresor();

        Schmuck schmuck = new Schmuck(15261, 99.99, "Halskette");
        Aktie aktie = new Aktie(18325, 10.23, "Coca Cola", 8);


        tresor.addGegenstand(schmuck);
        System.out.println(tresor);
        try {
            tresor.removeGegenstand(aktie);
        } catch (GegenstandNichtGefundException e) {
            System.out.println(e.getMessage());
        }
        tresor.getGegenstand(15261,"Halskette");
        tresor.getGegenstand(52649,"Uhr");
        tresor.getGegenstand(18325,"Aktie");


    }


}
