package Level_04.Lektion_04.Aufgabe_10;

/* 
Haben wir ein Paar?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        
        if(a == b || a == c || b == c)
            {
                if(a == b && b == c)
                    System.out.print(a +" "+ b +" " + c);
                else if(a == b)
                    System.out.print(a +" "+ b);
                else if(a == c)
                    System.out.print(a +" "+ c); 
                else if(c == b)
                    System.out.print(c +" "+ b);   
            }
    }
}
// Input 4, 6, 6