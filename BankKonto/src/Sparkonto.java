public class Sparkonto extends Konto{



    public Sparkonto(Kunde kunde,double kontostand, double zinsGuthaben){
       super(kunde , kontostand, 0, zinsGuthaben);
   }

    @Override
    public String toString() {
        return super.toString();
    }
}
