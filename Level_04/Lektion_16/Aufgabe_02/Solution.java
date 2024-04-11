package Level_04.Lektion_16.Aufgabe_02;
/* 
Irgendwie durchschnittlich
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int zahl1 = Integer.parseInt(input.readLine());
        int zahl2 = Integer.parseInt(input.readLine());
        int zahl3 = Integer.parseInt(input.readLine());

        if(zahl1 < zahl2 && zahl1 > zahl3 || zahl1 > zahl2 && zahl1 < zahl3)
            System.out.println(zahl1);
        else if(zahl2 < zahl1 && zahl2 > zahl3 || zahl2 > zahl1 && zahl2 < zahl3)
            System.out.println(zahl2);
        else if(zahl3 < zahl1 && zahl3 > zahl2 || zahl3 > zahl1 && zahl3 < zahl2)
            System.out.println(zahl3);
        else{
            if(zahl1 == zahl2)
                System.out.println(zahl1);
            else if(zahl2 == zahl3)
                System.out.println(zahl2);
            else
                System.out.println(zahl3);
        }

    }
}
