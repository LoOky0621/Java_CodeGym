package Level_03.Lektion_08.Aufgabe_04;

/* 
Vorhersagen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String zahl1 = reader.readLine();
        String zahl2 = reader.readLine();

        System.out.println(name+ " wird "+zahl1+" in "+zahl2+" Jahren erhalten.");
    
    }
}
