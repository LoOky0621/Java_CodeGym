package Level_04.Lektion_04.Aufgabe_09;
/* 
Blind über die Straße gehen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double t = Double.parseDouble(input.readLine());
        t = t % 5;

        // Überprüfung und Ausgabe der Ampelfarbe
        if (t >= 0 && t < 3) {
            System.out.println("grün");
        } else if (t >= 3 && t < 4) {
            System.out.println("gelb");
        } else if (t >= 4 && t < 5) {
            System.out.println("rot");
        }
    }
}
// Input 2.5