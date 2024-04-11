package Level_05.Lektion_05.Aufgabe_08;

/* 
Abfrage- und Änderungsmethoden für die Person-Klasse
*/

public class Person {
    //schreib hier deinen Code
    private String name;
    private int alter;
    private char geschlecht;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public static void main(String[] args) {

    }
}
