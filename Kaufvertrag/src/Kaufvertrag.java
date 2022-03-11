public class Kaufvertrag {
    private Verkaufspartner verkaeufer;
    private Verkaufspartner kaeufer;
    private Ware ware;
    private String zahlungsModalitaeten;


    public Kaufvertrag(Verkaufspartner verkaeufer, Verkaufspartner kaeufer, Ware ware, String zahlungsModalitaeten){
        this.verkaeufer = verkaeufer;
        this.kaeufer = kaeufer;
        this.ware = ware;
        this.zahlungsModalitaeten = zahlungsModalitaeten;

    }
}
