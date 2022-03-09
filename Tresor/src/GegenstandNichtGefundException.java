public class GegenstandNichtGefundException extends Exception {

    private int id;

    public GegenstandNichtGefundException(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return "Im Tresor ist kein gegenstand mit der id zu finden";
    }
}
