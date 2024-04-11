package Level_05.Lektion_07.Aufgabe_01;

/* 
Eine Freund-Klasse erstellen
*/

public class Freund {
    //schreib hier deinen Code
    private String name;
    private int alter;
    private char geschlecht;

    public void initialisieren(String name){
        this.name =name;
    }
    public void initialisieren(String name, int alter){
        this.name =name;
        this.alter = alter;
    }
    public void initialisieren(String name, int alter, char geschlecht){
        this.name =name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public static void main(String[] args) {

    }
}
