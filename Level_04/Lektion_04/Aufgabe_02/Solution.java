package Level_04.Lektion_04.Aufgabe_02;
/* 
Am nächsten an 10
*/

public class Solution {
    public static void main(String[] args) {
        naechsteAnZehnAnzeigen(8, 11);
        naechsteAnZehnAnzeigen(7, 14);
    }

    public static void naechsteAnZehnAnzeigen(int a, int b) {
        // schreib hier deinen Code
        int zahl = 10;
        if(abs(a-zahl) <= abs(b-zahl))
            System.out.println(a);
        else
            System.out.println(b);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}