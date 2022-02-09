public class Programm {
    public static void main(String[] args) {

        Elfe elfe = new Elfe("Olaf",0);
        Zauberer zauberer = new Zauberer("Potter",5,6);

        System.out.println(elfe);
        System.out.println(zauberer);

        try {
            elfe.rennen();
        }catch (KeineKraftExeption e ){
            System.out.println(e.getMessage());
        }



    }
}
