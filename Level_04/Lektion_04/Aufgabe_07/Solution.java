package Level_04.Lektion_04.Aufgabe_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Anzahl der Tage in einem Jahr
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tage = Integer.parseInt(reader.readLine());

        if (tage % 4 == 0) {
            if ((tage % 100 == 0) && (tage % 400 != 0)) {
                tage = 365;
            } else {
                tage = 366;
            }
        } else {
            tage = 365;
        }

        System.out.println("Anzahl der Tage im Jahr: " + tage);
    }
}