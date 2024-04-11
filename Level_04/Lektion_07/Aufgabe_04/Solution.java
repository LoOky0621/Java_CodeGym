package Level_04.Lektion_07.Aufgabe_04;

/* 
Positive und negative Zahlen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int zahl1 = Integer.parseInt(input.readLine());
        int zahl2 = Integer.parseInt(input.readLine());
        int zahl3 = Integer.parseInt(input.readLine());
        int pcounter = 0, ncounter = 0;
            if(positiv(zahl1))
                pcounter++;
            else if(zahl1 != 0)
                ncounter++;
            if(positiv(zahl2))
                pcounter++;
            else if(zahl2 != 0)
                ncounter++;
            if(positiv(zahl3))
                pcounter++;
            else if(zahl3 != 0)
                ncounter++;
        System.out.println("Anzahl negativer Zahlen: "+ncounter);
        System.out.println("Anzahl positiver Zahlen: "+pcounter);
    }
    private static boolean positiv(int zahl){
        return zahl > 0;
    }
}
