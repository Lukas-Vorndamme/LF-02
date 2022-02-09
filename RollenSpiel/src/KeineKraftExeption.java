public class KeineKraftExeption extends Exception{

    private String aktion;
    private String name;


    public KeineKraftExeption(String aktion, String name){
this.aktion = aktion;
this.name = name;
    }
    @Override
    public String getMessage(){
return name + " ist zu schwach um zu " + aktion;
    }


}
