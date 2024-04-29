package Level_07.Lektion_04.Aufgabe_04;


/* 
Das Array umdrehen
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] arry = new int[10];

        for (int i = 0; i < arry.length; i++) {
            arry[i] = Integer.parseInt(input.readLine());
        }

        for (int i = arry.length-1;i >=0;  i--) {
            System.out.println(arry[i]);
        }
    }
}