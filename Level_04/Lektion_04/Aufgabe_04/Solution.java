package Level_04.Lektion_04.Aufgabe_04;

/* 
Jahreszeiten auf Terra
*/

public class Solution {
    public static void main(String[] args) {
        jahreszeitPruefen(12);
        jahreszeitPruefen(4);
        jahreszeitPruefen(7);
        jahreszeitPruefen(10);
    }

    public static void jahreszeitPruefen(int monat) {
        //schreib hier deinen Code
        if (monat >=3 && monat <= 5)
            System.out.println("Frühling");
        else if (monat >=6 && monat <= 8)   
            System.out.println("Sommer");
        else if (monat >=9 && monat <= 11)   
            System.out.println("Herbst"); 
        else
            System.out.println("Winter"); 
    }
}