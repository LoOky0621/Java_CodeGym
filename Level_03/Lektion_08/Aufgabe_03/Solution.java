package Level_03.Lektion_08.Aufgabe_03;

/* 
Die Welt erobern
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String years = reader.readLine();
        String name = reader.readLine();

        System.out.println(name + " wird in " + years + " Jahren die Welt erobern. Muha-ha-ha!");
    
    }
}