package Level_05.Lektion_08.Aufgabe_01;

/* 
Freunde kann man nicht kaufen
*/

public class Freund {
    //schreib hier deinen Code
    private String name;
    private int alter;
    private char geschlecht;
    public Freund(String name) {
        this.name = name;
    }
    public Freund(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }
    public Freund(String name, int alter, char geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public static void main(String[] args) {

    }
}
