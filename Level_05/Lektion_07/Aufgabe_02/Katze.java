package Level_05.Lektion_07.Aufgabe_02;
/* 
Katzen initialisieren
*/

public class Katze {
    //schreib hier deinen Code
    private String name;
    private int alter;
    private int gewicht;
    private String adresse;
    private String farbe;

    public void initialisieren(String name) {
        this.name = name;
        this.alter = 1;  // Standardalter
        this.gewicht = 5;  // Standardgewicht
        this.farbe = "Unbekannt";
    }

    // Initialisator 2
    public void initialisieren(String name, int gewicht, int alter) {
        this.name = name;
        this.alter = (alter > 0) ? alter : 0;  // Überprüfen, dass das Alter gültig ist
        this.gewicht = (gewicht > 0) ? gewicht : 5;  // Überprüfen, dass das Gewicht gültig ist
        this.farbe = "Unbekannt";
    }

    // Initialisator 3
    public void initialisieren(String name, int alter) {
        this.name = name;
        this.alter = (alter > 0) ? alter : 0;  // Überprüfen, dass das Alter gültig ist
        this.gewicht = 5;  // Standardgewicht
        this.farbe = "Unbekannt";
    }

    // Initialisator 4
    public void initialisieren(int gewicht, String farbe) {
        this.alter = 1;  // Standardalter
        this.gewicht = (gewicht > 0) ? gewicht : 5;  // Überprüfen, dass das Gewicht gültig ist
        this.farbe = farbe;
    }

    // Initialisator 5
    public void initialisieren(int gewicht, String farbe, String adresse) {
        this.alter = 1;  // Standardalter
        this.gewicht = (gewicht > 0) ? gewicht : 5;  // Überprüfen, dass das Gewicht gültig ist
        this.adresse = adresse;
        this.farbe = farbe;
    }
    public static void main(String[] args) {

    }
}