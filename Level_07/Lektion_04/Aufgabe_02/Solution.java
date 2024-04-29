package Level_07.Lektion_04.Aufgabe_02;

/* 
String-Array in umgekehrter Reihenfolge
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String arry[] = new String[10];
        for(int i = 0; i < arry.length-2; i++)
            arry[i] = input.readLine();

        for(int i = arry.length-1; i >= 0; i--)
            System.out.println(arry[i]);
    }
}