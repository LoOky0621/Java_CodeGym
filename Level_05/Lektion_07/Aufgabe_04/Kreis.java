package Level_05.Lektion_07.Aufgabe_04;

/* 
Eine Kreis-Klasse erstellen
*/

public class Kreis {
    //schreib hier deinen Code
    private int mittelpunktY;
    private int mittelpunktX;
    private int radius;
    private int breite;
    private int farbe;
    public void initialisieren(int mittelpunktX, int mittelpunktY, int radius){
        this.mittelpunktX = mittelpunktX;
        this.mittelpunktY = mittelpunktY;
        this.radius = radius;
    }

    public void initialisieren(int mittelpunktX, int mittelpunktY, int radius, int breite){
        this.mittelpunktX = mittelpunktX;
        this.mittelpunktY = mittelpunktY;
        this.radius = radius;
        this.breite = breite;
    }
    public void initialisieren(int mittelpunktX, int mittelpunktY, int radius, int breite, int farbe){
        this.mittelpunktX = mittelpunktX;
        this.mittelpunktY = mittelpunktY;
        this.radius = radius;
        this.breite = breite;
        this.farbe = farbe;
    }
    public static void main(String[] args) {

    }
}