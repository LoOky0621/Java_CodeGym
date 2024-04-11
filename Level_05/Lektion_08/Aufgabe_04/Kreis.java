package Level_05.Lektion_08.Aufgabe_04;

/* 
Im Kreis laufen
*/


public class Kreis {
    //schreib hier deinen Code
    private int mittelpunktX;
    private int mittelpunktY;
    private int radius;
    private int breite;
    private int farbe;

    public Kreis(int mittelpunktX, int mittelpunktY, int radius) {
        this.mittelpunktX = mittelpunktX;
        this.mittelpunktY = mittelpunktY;
        this.radius = radius;
    }

    public Kreis(int mittelpunktX, int mittelpunktY, int radius, int breite) {
        this.mittelpunktX = mittelpunktX;
        this.mittelpunktY = mittelpunktY;
        this.radius = radius;
        this.breite = breite;
    }

    public Kreis(int mittelpunktX, int mittelpunktY, int radius, int breite, int farbe) {
        this.mittelpunktX = mittelpunktX;
        this.mittelpunktY = mittelpunktY;
        this.radius = radius;
        this.breite = breite;
        this.farbe = farbe;
    }

    public static void main(String[] args) {

    }
}