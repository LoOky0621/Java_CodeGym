package Level_04.Lektion_06.Aufgabe_01;

/* 
Mindestens zwei Zahlen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String zahl1 = reader.readLine();
        int zahl3 = Integer.parseInt(zahl1);
        String zahl2 = reader.readLine();
        int zahl4 = Integer.parseInt(zahl2);
        
        if(zahl3 <= zahl4){
            System.out.println(zahl1);
        }
        else
            System.out.println(zahl2);
    }
}