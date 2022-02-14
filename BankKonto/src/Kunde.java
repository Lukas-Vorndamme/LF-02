public class Kunde extends Person {

    private Mitarbeiter mitarbeiter;

    public Kunde(String name, String nachname, Mitarbeiter mitarbeiter) {
        super(name,nachname);
        this.mitarbeiter = mitarbeiter;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    @Override
    public String toString() {
        return "Kunde" +
                "mitarbeiter = " + mitarbeiter;
    }
}
