public class Sparkonto extends Konto{


    public Sparkonto(Kunde kunde,double kontostand, double zinsGuthaben){
       super(kunde , kontostand, 0, zinsGuthaben);
   }
   public double zinsen(double KontoStand, double zinsGuthaben){
       double kontoStand = getKontoStand();
         kontoStand = kontoStand + kontoStand * (zinsGuthaben/100);
       return kontoStand;
   }

    @Override
    public String toString() {
        return super.toString();
    }
}
