public class Adresse {


    private String starsse;
    private String hausNr;
    private String plz;
    private String ort;

    public Adresse(String starsse,String hausNr, String plz, String ort){
        this.starsse = starsse;
        this.hausNr =hausNr;
        this.plz = plz;
        this.ort = ort;
    }

    public String getStrasse() {
        return starsse;
    }

    public void setStasse(String starsse) {
        this.starsse = starsse;
    }

    public String getHausNr() {
        return hausNr;
    }

    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "starsse = " + starsse +
                "hausNr='" + hausNr +
                "plz='" + plz +
                "ort='" + ort ;
    }
}
