package Level_04.Lektion_06.Aufgabe_07;

/* 
Drei Zahlen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int zahl1 = Integer.parseInt(input.readLine());
        int zahl2 = Integer.parseInt(input.readLine());
        int zahl3 = Integer.parseInt(input.readLine());

        if(zahl1 == zahl2 | zahl1 == zahl3 | zahl2 == zahl3) {
            if (zahl1 != zahl2 && zahl1 != zahl3)
                System.out.println("1");
            if (zahl2 != zahl1 && zahl2 != zahl3)
                System.out.println("2");
            if (zahl3 != zahl1 && zahl3 != zahl2)
                System.out.println("3");
        }else{

        }
    }
}

// Input 9, 2, 9