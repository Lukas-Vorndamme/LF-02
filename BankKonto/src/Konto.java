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
    public void einzahlen(double betrag){
        kontoStand += betrag;
    }
    public void auszahlen(double betrag) throws KeineGeldExeption {
        boolean k;
        if (betrag < kontoStand){
            k =  true;
        }else k =  false;

        if (k){
            kontoStand -= betrag;
        }else {
            throw new KeineGeldExeption();
        }

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
