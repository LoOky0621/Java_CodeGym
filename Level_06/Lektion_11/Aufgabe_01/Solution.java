package Level_06.Lektion_11.Aufgabe_01;

/* 
Katze und static
*/

public class Solution {
    public static Katze katze;
    public static void main(String[] args) {
        // Erstelle 10 Katzen
        for(int i = 0; i < 10; i++)
            katze = new Katze();
        // Zeige den Wert der Variable katzenAnzahl an
        System.out.println(Katze.katzenAnzahl);
    }

    public static class Katze {
        // Erstelle die statische Variable katzenAnzahl
        static public int katzenAnzahl;
        // Deklariere einen Konstruktor
        public Katze(){
            katzenAnzahl++;
        }
    }
}
