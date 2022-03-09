public abstract class Gegenstand {


    private int id;
    private double wert;


    public Gegenstand(int id,double wert){
        this.wert = wert;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Gegenstand " +
                "id = " +
                "wert = " + wert;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public int getId() {
        return id;
    }


}
