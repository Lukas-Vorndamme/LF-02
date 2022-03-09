public class Aktie extends Gegenstand {

    private String unternehmen;
    private double nennwert;

    public Aktie(int id, double wert,String unternehmen,double nennwert){
        super(id, wert);
        this.unternehmen = unternehmen;
        this.nennwert = nennwert;
    }
    public double getNennwert() {
        return nennwert;
    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public void setNennwert(double nennwert) {
        this.nennwert = nennwert;
    }

    public void setUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
    }

    @Override
    public String toString() {
        return "Aktie" +
                "unternehmen = " + unternehmen +
                "nennwert = " + nennwert;
    }
}
