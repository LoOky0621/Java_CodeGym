package Level_05.Lektion_05.Aufgabe_07;

/* 
Arithmetisches Mittel
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double erg = 0;
        int counter = -1,zahl = 0;
        while (zahl != -1) {
            erg += zahl;
            counter++;
            zahl = Integer.parseInt(input.readLine());
        }
        System.out.println(erg / counter);

    }
}

