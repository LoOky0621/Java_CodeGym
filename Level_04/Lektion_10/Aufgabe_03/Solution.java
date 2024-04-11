package Level_04.Lektion_10.Aufgabe_03;
/* 
Von einer guten Sache kann man nie zu viel haben
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String kette = input.readLine();
        int wiederholung = Integer.parseInt(input.readLine());
        int count = 0;
        while(count < wiederholung){
            System.out.println(kette);
            count++;
        }

    }
}
