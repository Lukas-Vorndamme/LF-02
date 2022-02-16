public abstract class Konto {
    private Kunde kunde;
    private double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde kunde,double kontostand,double kreditLimit, double zinsGuthaben) {
        this.kunde = kunde;
        this.kontoStand = kontostand;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben =zinsGuthaben;
    }


    public Kunde getKunde() {
        return kunde;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }
    public boolean einzahlen(double betrag){
        kontoStand += betrag;
        return true;
    }
    public boolean auszahlen(double betrag){
        boolean k;
        if (betrag < kontoStand){
            k =  true;
        }else k =  false;

        if (k){
            kontoStand -= betrag;
        }else {
            System.out.println("");
        }

        return k;
    }


    @Override
    public String toString() {
        return "Konto" +
                "kunde = " + kunde +
                "kontoStand = " + kontoStand +
                "kreditLimit = " + kreditLimit +
                "zinsGuthaben = " + zinsGuthaben;
    }
}
