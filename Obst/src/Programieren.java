import java.io.IOException;

public class Programieren {
    public static void main(String[] args) throws IOException {


    Obst apfel = new Apfel();

    apfel.getName();
    apfel.setGewicht(200);
    apfel.setFarbe("Rot");
    apfel.setReif(true);


        System.out.println(apfel.getFarbe());
        System.out.println(apfel.getGewicht());
        System.out.println(apfel.isReif());

        Banane banane = new Banane();

        banane.setKruemmung(25);

        System.out.println(banane.getName());





}  }
