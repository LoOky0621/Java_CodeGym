package Level_04.Lektion_06.Aufgabe_05;
/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String name = input.readLine();
        int alter = Integer.parseInt(input.readLine());

        if(alter < 18)
            System.out.println("Du bist noch zu jung");
    }
}
// Input Donald 16