package Level_04.Lektion_13.Aufgabe_02;
/* 
Ein Rechteck zeichnen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(input.readLine());
        int n = Integer.parseInt(input.readLine());

        for(int reihe = 0; reihe < m; reihe++){
            for(int zeile = 0; zeile < n; zeile++){
                System.out.print("8");
            }
            System.out.println();
        }

    }
}