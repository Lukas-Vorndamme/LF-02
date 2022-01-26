package schritt4;

public class Spiel {

    public Mannschaft heim;
    public Mannschaft gast;
    public Ergebnis ergebnis;
    public StringBuilder spielverlauf;

    public Spiel (Mannschaft heim, Mannschaft gast, Ergebnis ergebnis){
        this.heim = heim;
        this.gast = gast;
        this.ergebnis = ergebnis;
        this.spielverlauf = spielverlauf;
    }

    @Override
    public String toString() {
        return "Spiel" +
                "\nHeim = \t\t\t" + heim +
                "\nGast = \t\t\t" + gast +
                "\nErgebnis \t\t" + ergebnis +
                "\nSpielverlauf = \t" + spielverlauf;
    }

    public Mannschaft getHeim() {
        return heim;
    }

    public Mannschaft getGast() {
        return gast;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielverlauf() {
        return spielverlauf;
    }
}