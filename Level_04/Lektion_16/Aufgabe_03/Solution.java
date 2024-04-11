package Level_04.Lektion_16.Aufgabe_03;

/* 
Addieren
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int erg = 0;
        while(true){
            int zahl = Integer.parseInt(input.readLine());
            if(zahl != -1)
                erg += zahl;
            else{
                break;
            }
        }
        System.out.println(erg-1);
    }
}
