package Level_05.Lektion_12.Aufgabe_05;

/* 
Konsolenbasiertes Sparschwein
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int erg = 0;
        while (true)
        {
            String s = input.readLine();
            if (s.equals("summe"))
                break;
            int zahl = Integer.parseInt(s);
            erg += zahl;
        }
        System.out.println(erg);
    }
}
