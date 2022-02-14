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
    public void ueberweisung(double betrag, GiroKonto giroKonto){
        if (betrag < (getKontoStand()+getKreditLimit())){
            double KontoStand = giroKonto.getKontoStand() - betrag;

        }else {
            System.out.println("Du hast nicht genug geld für diese überweisung");
        }
    }
}
