package Level_07.Lektion_04.Aufgabe_06;
/* 
Straßen und Häuser
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int arry[] = new int[15];
        int erg1 = 0, erg2 = 0;
        for(int i = 0; i < 15; i++){
            arry[i] = Integer.parseInt(input.readLine());
            if(i%2 == 0)
                erg1 = erg1 + arry[i];
            else
                erg2 = erg2 + arry[i];
        }
        if(erg1 > erg2)
            System.out.println("Häuser mit gerader Nummer haben mehr Einwohner");
        else if(erg2 > erg1)
            System.out.println("Häuser mit ungerader Nummer haben mehr Einwohner");

    }
}