package Level_07.Lektion_04.Aufgabe_05;
/* 
Ein großes und zwei kleine Arrays
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int arry[] = new int[20];
        int arry1[] = new int[10];
        int arry2[] = new int[10];
        for(int i = 0; i < arry.length; i++){
            arry[i] = Integer.parseInt(input.readLine());
            if(i < 10)
                arry1[i] = arry[i];
            else
                arry2[i-10] = arry[i];
        }
        for(int i = 0; i < arry2.length; i++)
            System.out.println(arry2[i]);
    }
}