package Level_04.Lektion_16.Aufgabe_04;


/* 
Ein Name ist ein Name
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name = input.readLine();
        int jjjj = Integer.parseInt(input.readLine());
        int mm = Integer.parseInt(input.readLine());
        int tt = Integer.parseInt(input.readLine());

        System.out.println("Mein Name ist "+name+".");
        System.out.println("Ich wurde am "+tt+"."+mm+"."+jjjj+" geboren");

    }
}
