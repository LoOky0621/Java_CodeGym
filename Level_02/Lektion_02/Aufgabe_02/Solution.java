package Level_02.Lektion_02.Aufgabe_02;

/* 
Unser erster Umwandler!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(celsiusInFahrenheitUmwandeln(41));
    }

    public static double celsiusInFahrenheitUmwandeln(int celsius) {
        //schreib hier deinen Code
        double TF = (9 / 5.0) * celsius + 32;
        return TF;
    }
}