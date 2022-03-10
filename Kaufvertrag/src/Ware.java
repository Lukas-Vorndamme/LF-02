import java.util.ArrayList;

public class Ware {

    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private ArrayList<String> besonderheiten   = new ArrayList<>();
    private ArrayList<String> meangel = new ArrayList<>();

    Ware(String bezeichnung, String beschreibung, double preis, ArrayList<String> besonderheiten, ArrayList<String> meangel){
       this.bezeichnung = bezeichnung;
       this.beschreibung = beschreibung;
       this.preis = preis;
       this.besonderheiten = besonderheiten;
       this.meangel = meangel;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
