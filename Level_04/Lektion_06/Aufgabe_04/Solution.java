package Level_04.Lektion_06.Aufgabe_04;

/* 
Jen oder Jen?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name1 = input.readLine();
        String name2 = input.readLine();

        if(name1.equals(name2))
            System.out.println("Die Namen sind identisch");
        else{
            if(name2.length() == name1.length())
                System.out.println("Die Namen sind gleich lang");
        }
    }
}