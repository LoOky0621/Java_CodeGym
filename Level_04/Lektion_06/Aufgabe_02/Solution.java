package Level_04.Lektion_06.Aufgabe_02;
/* 
Die größte von vier Zahlen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String zahl1 = reader.readLine();
        int zahl1n = Integer.parseInt(zahl1);
        String zahl2 = reader.readLine();
        int zahl2n = Integer.parseInt(zahl2);
        String zahl3 = reader.readLine();
        int zahl3n = Integer.parseInt(zahl3);
        String zahl4 = reader.readLine();
        int zahl4n = Integer.parseInt(zahl4);
        int zahlneu = 0;
        if(zahl1n > zahl2n)
        zahlneu = zahl1n;
        else
        zahlneu = zahl2n;
        if(zahl3n > zahlneu)
        zahlneu = zahl3n;
        if(zahl4n > zahlneu)
        zahlneu = zahl4n;
        
        System.out.println(zahlneu);
    }
}