package Level_07.Lektion_04.Aufgabe_03;

/* 
Einsame Arrays interagieren
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String arrys[] = new String[10];
        int arry[] = new int[10];
        for(int i = 0; i < arrys.length; i++)
            arrys[i] = input.readLine();
        for(int i = 0; i < arrys.length; i++){
            arry[i] = arrys[i].length();
        }
        for(int i = 0; i < arry.length; i++)
            System.out.println(arry[i]);
    }
}