package Level_05.Lektion_12.Aufgabe_07;

/* 
Funktionen verbessern
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a,b,c,d,e);

        System.out.println("Kleinste Zahl = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {
        int ab = a <= b ? a : b;
        int cd = c <= d ? c : d;
        int abcd = ab <= cd ? ab : cd;
        return abcd <= e ? abcd:e;
    }
}

