package Level_05.Lektion_07.Aufgabe_07;

/* 
Objekte initialisieren
*/

public class Person {
    String name;
    char geschlecht;
    int geld;
    int gewicht;
    double groesse;

    public void initialisieren(String name, int geld, char geschlecht, int gewicht, double groesse) {
        this.name = name;
        this.geld = geld;
        this.geschlecht = geschlecht;
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    public static void main(String[] args) {

    }
}

