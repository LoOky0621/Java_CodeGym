package Level_04.Lektion_06.Aufgabe_03;

/* 
Drei Zahlen sortieren
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int zahl1 = Integer.parseInt(reader.readLine());
        int zahl2 = Integer.parseInt(reader.readLine());
        int zahl3 = Integer.parseInt(reader.readLine());

        int pos1 = 0, pos2 = 0, pos3 = 0;
        if(zahl1 >= zahl2 && zahl1 >= zahl3){
            pos1 = zahl1;
            if(zahl2 >= zahl3){
                pos2 = zahl2;
                pos3 = zahl3;
            }else{
                pos2 = zahl3;
                pos3 = zahl2;
            }
        } else if (zahl2 >= zahl1 && zahl2 >= zahl3) {
            pos1 = zahl2;
            if(zahl1 >= zahl3){
                pos2 = zahl1;
                pos3 = zahl3;
            }else{
                pos2 = zahl3;
                pos3 = zahl1;
            }
        }else {
            pos1 = zahl3;
            if(zahl1 >= zahl2){
                pos2 = zahl1;
                pos3 = zahl2;
            }else{
                pos2 = zahl2;
                pos3 = zahl1;
            }
        }
        System.out.println(pos1+" "+pos2+" "+pos3);
    }
}
// Input 5, 4, 7