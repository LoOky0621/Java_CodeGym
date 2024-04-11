package Level_03.Lektion_03.Aufgabe_03;

/* 
Aufgabe mit Prozentsätzen
*/

public class Solution {
    public static double zehnProzentZufuegen(int i) {
        //schreib hier deinen Code
        double zahl;
        zahl = i * 1.1;
        return zahl;
    }

    public static void main(String[] args) {
        System.out.println(zehnProzentZufuegen(9));
    }
}
