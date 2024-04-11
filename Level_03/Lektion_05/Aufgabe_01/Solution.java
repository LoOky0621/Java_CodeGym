package Level_03.Lektion_05.Aufgabe_01;

/* 
Pool mit Wasser füllen
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(volumenBerechnen(25, 5, 2));
    }

    public static long volumenBerechnen(int a, int b, int c) {
        //schreib hier deinen Code
        long volumen;
        volumen = a * b * c * 1000;
        return volumen;
    }
}