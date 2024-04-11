package Level_04.Lektion_07.Aufgabe_03;
/* 
Positive Zahl
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int zahl1 = Integer.parseInt(input.readLine());
        int zahl2 = Integer.parseInt(input.readLine());
        int zahl3 = Integer.parseInt(input.readLine());
        int counter = 0;
        if(zahl1 != 0 || zahl2 != 0 || zahl3 != 0){
            if(positiv(zahl1))
                counter++;
            if(positiv(zahl2))
                counter++;
            if(positiv(zahl3))
                counter++;
            System.out.println(counter);
        }else{System.out.println("0");}
    }
    public static boolean positiv(int zahl){
            return zahl > 0;
    }
}
