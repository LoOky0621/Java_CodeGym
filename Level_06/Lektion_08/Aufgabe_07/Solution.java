package Level_06.Lektion_05.Aufgabe_05;

/* 
Gerade und ungerade Ziffern
*/

import java.io.*;


public class Solution {

    public static int gerade;
    public static int ungerade;

    public static void main(String[] args) throws IOException {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int zahl = Integer.parseInt(input.readLine());

        while (zahl > 0) {
            int letzteZiffer = zahl % 10;

            if (letzteZiffer % 2 == 0)
                gerade++;
            else
                ungerade++;

            zahl = zahl / 10;
        }

        System.out.println("Gerade: " + gerade + " Ungerade: " + ungerade);

    }
}
