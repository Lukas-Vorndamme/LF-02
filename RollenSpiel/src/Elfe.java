public class Elfe extends Spielfigur{


    public Elfe(String name, int staerkepunkte) {
        super(name, staerkepunkte);
    }
public void rennen()throws KeineKraftExeption{
       setStaerkepunkte(getStaerkepunkte()-2);
    if (fehler(getStaerkepunkte())){
        throw new KeineKraftExeption("Rennen",getName());
    }
}

    @Override
    public String toString() {
        return super.toString();
    }
}
