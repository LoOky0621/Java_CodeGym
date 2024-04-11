package Level_03.Lektion_12.Aufgabe_01;

/* 
Quersumme einer dreistelligen Zahl
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(quersummeBerechnen(546));
    }

    public static int quersummeBerechnen(int zahl) {
        //schreib hier deinen Codeint summe = 0;
        int summe = 0;
        summe = summe + zahl % 10;
        zahl = zahl / 10;
        summe = summe + zahl % 10;
        zahl = zahl / 10;
        summe = summe + zahl % 10;
        return summe;
    }
}