public abstract class Obst {

   private String name;
    private double gewicht;
    private String farbe;
    private boolean reif;

    public Obst (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public String getFarbe() {
        return farbe;
    }


    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }


    public boolean isReif() {
        return reif;
    }
    public void setReif(boolean reif) {
        this.reif = reif;
    }

    @Override
    public String toString(){
        String text = "Name = " + name;
        text+= "\n Gewicht =  " + gewicht;
        text+= "\n Farbe = " + farbe;
        text+= "\n Reif = " + reif;
        return text;
    }
}

