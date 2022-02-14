public class Adresse {

    private String straße;
    private String ort;
    private String hausnummer;
    private String posteizahl;

    @Override
    public String toString() {
        return "Adresse" +
                " \nstraße = " + straße +
                " \nort = " + ort +
                " \nhausnummer = " + hausnummer +
                " \nposteizahl = " + posteizahl;
    }
public Adresse(String straße, String ort, String hausnummer, String posteizahl){
        this.straße = straße;
        this.ort = ort;
        this.hausnummer = hausnummer;
        this.posteizahl = posteizahl;

}
    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPosteizahl() {
        return posteizahl;
    }

    public void setPosteizahl(String posteizahl) {
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
