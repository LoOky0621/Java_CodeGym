package Level_04.Lektion_04.Aufgabe_08;

/* 
Dreiecksregel
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a < b + c) && (b < c + a) && (c < a + b)) {
            System.out.println("Das Dreieck ist möglich.");
        } else {
            System.out.println("Das Dreieck ist nicht möglich.");
        }
    }
}

// Input 2, 3, 4