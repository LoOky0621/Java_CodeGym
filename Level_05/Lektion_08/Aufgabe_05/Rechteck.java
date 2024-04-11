package Level_05.Lektion_08.Aufgabe_05;

/* 
Rechteck-Klasse erstellen
*/


public class Rechteck {
    //schreib hier deinen Code
    private int oben;
    private int links;
    private int breite;
    private int hoehe;

    public Rechteck(int oben) {
        this.oben = oben;
    }

    public Rechteck(int oben, int links) {
        this.oben = oben;
        this.links = links;
    }

    public Rechteck(int oben, int links, int breite) {
        this.oben = oben;
        this.links = links;
        this.breite = breite;
    }

    public Rechteck(int oben, int links, int breite, int hoehe) {
        this.oben = oben;
        this.links = links;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public static void main(String[] args) {

    }
}
