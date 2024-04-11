package Level_04.Lektion_01.Aufgabe_02;

/* 
Der Apfelpreis
*/

public class Solution {
    public static void main(String[] args) {
        Apfel apfel = new Apfel();
        apfel.preisZufuegen(50);
        Apfel apfel2 = new Apfel();
        apfel2.preisZufuegen(100);
        System.out.println("Der Preis für Äpfel beträgt " + Apfel.apfelPreis);
    }

    public static class Apfel {
        public static int apfelPreis = 0;

        public static void preisZufuegen(int apfelPreis) {
            //schreib hier deinen Code
            Apfel.apfelPreis += apfelPreis;
        }
    }
}
