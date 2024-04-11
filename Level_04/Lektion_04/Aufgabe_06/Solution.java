package Level_04.Lektion_04.Aufgabe_06;

/* 
Wochentag
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            
            
        String zahl = reader.readLine();
        int woche = Integer.parseInt(zahl);
        
        if(woche <= 7 || woche > 0)
            if(woche == 1)
            System.out.println("Montag");
            else if(woche == 2)
            System.out.println("Dienstag");
            else if(woche == 3)
            System.out.println("Mittwoch");
            else if(woche == 4)
            System.out.println("Donnerstag");
            else if(woche == 5)
            System.out.println("Freitag");
            else if(woche == 6)
            System.out.println("Samstag");
            else if(woche == 7)
            System.out.println("Sonntag");
        else
        System.out.println("Diesen Wochentag gibt es nicht");
    }
}

// input data 4