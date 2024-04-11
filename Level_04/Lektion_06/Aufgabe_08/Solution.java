package Level_04.Lektion_06.Aufgabe_08;

/* 
Ziel erfasst!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());

        if(a>0 && b>0){
            System.out.println("1");
        }
        else if(a<0 && b>0){
            System.out.println("2");
        }
        else if(a<0 && b<0){
            System.out.println("3");
        }
        else if(a>0 && b<0){
            System.out.println("4");
        }
        else{}
    }
}