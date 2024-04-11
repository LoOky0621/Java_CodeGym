package Level_03.Lektion_12.Aufgabe_03;
import java.io.*;
/* 
Finanzielle Erwartungen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String zahl = reader.readLine();
        int nzahl = Integer.parseInt(zahl);
        System.out.println("Ich werde "+zahl+" Euro pro Stunde verdienen");
    }
}
