package Level_03.Lektion_08.Aufgabe_06;

/* 
Tiefe und reine Liebe
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name1+" + "+name2+" + "+name3+ " = Reine Liebe. Ooo la-la!");
    }
}