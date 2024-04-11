package Level_04.Lektion_13.Aufgabe_05;

/* 
Kettenbrief
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name = input.readLine();
        for(int i = 0; i < 10; i++){
            System.out.println(name+" liebt mich.");
        }

    }
}
