import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class KaufvertragTXT {




    public static void main(String[] args) throws FileNotFoundException {

        Kaufvertrag kaufvertrag = erstellenKaufvertrag();
        Schreibentxt(kaufvertrag);

    }
    public static void Schreibentxt(Kaufvertrag vertrag) throws FileNotFoundException {
        String datei = "H:/Dokumente/Programmieren/PrintWriter/Kaufvertrag.txt";
        PrintWriter writer = new PrintWriter(datei);
        writer.println(vertrag);
        writer.close();

    }
    public static Kaufvertrag erstellenKaufvertrag(){
        ArrayList<String> Besonderheiten = new ArrayList<>();
        ArrayList<String> Maengel = new ArrayList<>();
            Ware ware = new Ware("Laptop", "Laptop", 250.0);
            ware.setBeschreibung("Super krasses Gaming-Laptop");
            ware.getBesonderheiten().add("Tasche");
            ware.getBesonderheiten().add("Gaming-Maus");
            ware.getMaengel().add("Ladekabel fehlt");
            ware.getMaengel().add("Touchpad defekt");
            Adresse adresse = new Adresse("n", "25", "24154", "bremen");
            Adresse adresse1 = new Adresse("j", "25", "24154", "bremen");
            Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt");

            kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

            Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");

            verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

            Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
            vertrag.setZahlungsModalitaeten("Privater Barverkauf");

            System.out.println(vertrag);

            return vertrag;
        }
    }

