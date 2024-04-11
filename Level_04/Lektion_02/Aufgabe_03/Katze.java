package Level_04.Lektion_02.Aufgabe_03;
/* 
Anzahl der Katzen festlegen
*/

public class Katze {
    private static int katzenAnzahl = 0;

    public static void katzenAnzahlFestlegen(int katzenAnzahl) {
        //schreib hier deinen Code
        Katze.katzenAnzahl = katzenAnzahl;
    }

    public static void main(String[] args) {
        katzenAnzahlFestlegen(5);
        System.out.println(katzenAnzahl);
    }
}
