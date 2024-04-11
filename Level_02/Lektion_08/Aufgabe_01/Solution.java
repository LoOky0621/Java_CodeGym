package Level_02.Lektion_08.Aufgabe_01;

/* 
Sogar bis zum Mond!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(gewichtUmwandeln(888));
    }

    public static double gewichtUmwandeln(int gewichtErde) {
        // schreib hier deinen Code
        double mond = gewichtErde * 0.17;
        return mond;
    }
}