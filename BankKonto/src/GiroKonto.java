public class GiroKonto extends Konto{
    private double zinsKredit;


    public GiroKonto(Kunde kunde, double kontostand, double kreditLimit, double zinsGuthaben) {
        super(kunde, kontostand, kreditLimit, zinsGuthaben);
    }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }
    public boolean ueberweisung(double betrag, GiroKonto giroKonto){
        if (betrag < (getKontoStand()+getKreditLimit())){
            double KontoStand = giroKonto.getKontoStand() - betrag;
            return true;
        }else {
            System.out.println("");
            return false;
        }

    }
}
