package Level_05.Lektion_08.Aufgabe_03;

/* 
Hundeanmeldung
*/


public class Hund {
    //schreib hier deinen Code
    private String name;
    private int groesse;
    private String farbe;

    public Hund(String name) {
        this.name = name;
    }

    public Hund(String name, int groesse) {
        this.name = name;
        this.groesse = groesse;
    }

    public Hund(String name, int groesse, String farbe) {
        this.name = name;
        this.groesse = groesse;
        this.farbe = farbe;
    }

    public static void main(String[] args) {

    }
}