package schritt6;



public class SpielAbbruchException extends Exception {

    public int aktionminute;


    public int getAktionminute() {
        return aktionminute;
    }

    public SpielAbbruchException(int aktionminute){
        this.aktionminute = aktionminute;
    }



    @Override
    public String getMessage() {
        return  "Spiel wird Abgbrochen durch unbesimmt Bedingungen\n In der " + aktionminute + ". Spiel Minute";
    }
}
