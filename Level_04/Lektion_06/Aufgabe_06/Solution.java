package Level_04.Lektion_06.Aufgabe_06;

/* 
Der Türsteher
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name = input.readLine();
        int alter = Integer.parseInt(input.readLine());
        if(alter > 20)
            System.out.println("18 ist alt genug");
    }
}