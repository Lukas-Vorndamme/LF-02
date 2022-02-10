public class Adresse {

    private String straße;
    private String ort;
    private int hausnummer;
    private int posteizahl;

    @Override
    public String toString() {
        return "Adresse" +
                " \nstraße = " + straße +
                " \nort = " + ort +
                " \nhausnummer = " + hausnummer +
                " \nposteizahl = " + posteizahl;
    }
public Adresse(String straße, String ort, int hausnummer, int posteizahl){
        this.straße = straße;
        this.ort = ort;
        this.hausnummer = hausnummer;
        this.posteizahl = posteizahl;

}
    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public int getPosteizahl() {
        return posteizahl;
    }

    public void setPosteizahl(int posteizahl) {
        this.posteizahl = posteizahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }
}
