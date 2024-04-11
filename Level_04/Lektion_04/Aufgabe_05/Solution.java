package Level_04.Lektion_04.Aufgabe_05;
/* 
Positive und negative Zahlen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            
            
        String a = reader.readLine();
        int zahl = Integer.parseInt(a);
        
        if(zahl> 0)
            {
                zahl = zahl * 2;
                System.out.println(zahl);
            }
        else if(zahl == 0)
            System.out.println(zahl);
        else
            {
            zahl = zahl + 1;
            System.out.println(zahl);
            }

    }

}

// Input data 1