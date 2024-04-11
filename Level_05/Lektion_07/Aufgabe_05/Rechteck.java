package Level_05.Lektion_07.Aufgabe_05;
/* 
Lass uns ein Rechteck erstellen
*/

public class Rechteck {
    //schreib hier deinen Code
    private int oben;
    private int links;
    private int breite;
    private int hoehe;

    public void initialisieren(int oben){
        this.oben = oben;
    }

    public void initialisieren(int oben, int links){
        this.oben = oben;
        this.links = links;
    }

    public void initialisieren(int oben, int links, int breite){
        this.oben = oben;
        this.links = links;
        this.breite = breite;
    }

    public void initialisieren(int oben, int links, int breite, int hoehe){
        this.oben = oben;
        this.links = links;
        this.breite = breite;
        this.hoehe = hoehe;
    }
    public static void main(String[] args) {
        Rechteck rechteck1 = new Rechteck();
        rechteck1.initialisieren(4,5,6,7);
        Rechteck rechteck = new Rechteck();
        rechteck.initialisieren(4,5);
    }
}