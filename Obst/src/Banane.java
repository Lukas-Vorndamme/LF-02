public class Banane extends Obst{
    private double kruemmung;
    public Banane(){
        super("Banane");
    }

    public double getKruemmung() {
        return kruemmung;
    }


    public void setKruemmung(double kruemmung){
        this.kruemmung = kruemmung;
    }
public String toString() {

        String text = super.toString();
        text += "\n Krümmung = " + kruemmung;
        return text;
}


}
