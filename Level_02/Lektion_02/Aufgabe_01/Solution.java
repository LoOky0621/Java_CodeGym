package Level_02.Lektion_02.Aufgabe_01;

/*
Berechne den Umfang eines Kreises
*/

public class Solution {
    public static void main(String[] args) {
        kreisumfangAusdrucken(5);
    }

    public static void kreisumfangAusdrucken(int radius) {
        //schreib hier deinen Code
        double pi = 3.14;
        double c = 2 * pi * radius;
        System.out.println(c);

    }
}