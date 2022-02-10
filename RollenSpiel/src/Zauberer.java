public class Zauberer extends Spielfigur{

    private static int zauberpunkte;

    public Zauberer(String name, int staerkepunkte, int zauberpunkte) {
        super(name, staerkepunkte);
    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }
    public void trinkenZaubertrank(){
      zauberpunkte = zauberpunkte +3;
    }

    public void zaubern(String name)throws KeineKraftExeption{
        zauberpunkte = zauberpunkte -1;
        if (zauberpunkte > 1) {
            System.out.println("zaubert");
        }else {
            throw new KeineKraftExeption("Zaubern",name);
        }
    }
    public boolean fehler(){
        boolean fehler = false;
        if (zauberpunkte < 1){
            fehler = true;
        }else fehler =false;
        return fehler;
    }



    @Override
    public String toString() {
        return "Zauberer\n" +
                "zauberpunkte = " + zauberpunkte;
    }
}
