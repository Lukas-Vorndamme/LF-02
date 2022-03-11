public class Verkaufspartner {
    private String vorname;
    private String nachname;
    private String ausweisNr;
    private Adresse adresse;
    public Verkaufspartner(String vorname, String nachname, String ausweisNr, Adresse adresse){
        this.vorname = vorname;
        this.nachname = nachname;
        this.ausweisNr = ausweisNr;
        this.adresse = adresse;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Verkaufspartner{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", ausweisNr='" + ausweisNr + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
