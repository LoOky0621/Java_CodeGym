package Level_06.Lektion_08.Aufgabe_03;

/* 
Statische Methoden für Katzen
*/

public class Katze {
    private static int katzenAnzahl = 0;

    public Katze() {
        katzenAnzahl++;
    }

    public static int getKatzenAnzahl() {
        //schreib hier deinen Code
        return katzenAnzahl;
    }

    public static void setKatzenAnzahl(int katzenAnzahl) {
        //schreib hier deinen Code
        Katze.katzenAnzahl = katzenAnzahl;
    }

    public static void main(String[] args) {

    }
}

