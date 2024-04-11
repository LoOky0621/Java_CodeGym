package Level_05.Lektion_12.Aufgabe_06;

/* 
Chef, hier passiert gerade etwas seltsames
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int summe = a + b;
        System.out.println("Summe = " + summe);
    }
}
