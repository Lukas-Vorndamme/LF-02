public abstract class Person {

    private String vorname;
    private String nachnamename;
    private String adresse;

    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachnamename = nachname;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVorname() {
        return vorname;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachnamename() {
        return nachnamename;
    }

    public void setNachnamename(String nachnamename) {
        this.nachnamename = nachnamename;
    }
}
