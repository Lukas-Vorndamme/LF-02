public abstract class Spielfigur {


    private String name;
    private int staerkepunkte;

    @Override
    public String toString() {
        return "Spielfigur\n" +
                "name = " + name +
                "\nstearke = " + staerkepunkte;
    }

    public Spielfigur(String name, int staerkepunkte) {
        this.name = name;
        this.staerkepunkte = staerkepunkte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }

    protected void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = this.staerkepunkte;
    }

    public void essen() {
        staerkepunkte = staerkepunkte + 10;
    }

    public void kaempfen() throws KeineKraftExeption {
        staerkepunkte = staerkepunkte - 3;
        if (fehler(staerkepunkte)) {
            throw new KeineKraftExeption("Kämpfen", name);
        }
    }

    public void klettern() throws KeineKraftExeption {
        staerkepunkte = staerkepunkte - 2;
        if (fehler(staerkepunkte)) {
            throw new KeineKraftExeption("Klettern", name);
        }
    }

    public void laufen() throws KeineKraftExeption {
        staerkepunkte = staerkepunkte - 1;
        if (fehler(staerkepunkte)) {
            throw new KeineKraftExeption("Laufen", name);
        }
    }

    public boolean fehler(int staerkepunkte) {
        boolean fehler = false;
        if (staerkepunkte < 1) {
            fehler = true;
        } else fehler = false;
        return fehler;
    }
}



