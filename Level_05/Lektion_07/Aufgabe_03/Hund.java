package Level_05.Lektion_07.Aufgabe_03;

/* 
Eine Hund-Klasse erstellen
*/

public class Hund {
    //schreib hier deinen Code
    private String name;
    private int groesse;
    private String farbe;

    public void initialisieren(String name){
        this.name = name;
    }
    public void initialisieren(String name, int groesse){
        this.name = name;
        this.groesse = groesse;
    }
    public void initialisieren(String name, int groesse, String farbe){
        this.name = name;
        this.groesse = groesse;
        this.farbe = farbe;
    }


    public static void main(String[] args) {

    }
}
