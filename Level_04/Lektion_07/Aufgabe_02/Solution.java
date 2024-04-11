package Level_04.Lektion_07.Aufgabe_02;
/* 
Zahlen beschreiben
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int zahl = Integer.parseInt(input.readLine());
        if(zahl < 1000 && zahl > 0) {
            if (zahl % 2 == 0) {
                if (stellen(zahl) == 3)
                    System.out.println("gerade dreistellige Zahl");
                else if (stellen(zahl) == 2)
                    System.out.println("gerade zweistellige Zahl");
                else
                    System.out.println("gerade einstellige Zahl");
            } else {
                if (stellen(zahl) == 3)
                    System.out.println("ungerade dreistellige Zahl");
                else if (stellen(zahl) == 2)
                    System.out.println("ungerade zweistellige Zahl");
                else
                    System.out.println("ungerade einstellige Zahl");
            }
        }else{}
    }
    public static int stellen(int zahl){
        if(zahl >= 100 && zahl < 1000)
            return 3;
        else if (zahl >= 10 & zahl < 100)
            return 2;
        else
            return 1;
    }
}