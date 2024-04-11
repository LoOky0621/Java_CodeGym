package Level_04.Lektion_07.Aufgabe_01;

/* 
Etiketten und Zahlen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int zahl = Integer.parseInt(input.readLine());
        if(zahl == 0)
            System.out.println("Null");
        else if (positiv(zahl)) {
            if (gerade(zahl))
                System.out.println("Positive gerade Zahl");
            else
                System.out.println("Positive ungerade Zahl");
        }else if(!positiv(zahl)){
            if(gerade(zahl))
                System.out.println("Negative gerade Zahl");
            else
                System.out.println("Negative ungerade Zahl");
        }
    }
    public static boolean positiv(int zahl){
        return zahl > 0;
    }
    public static boolean gerade(int zahl){
        return zahl % 2 == 0;
    }
}