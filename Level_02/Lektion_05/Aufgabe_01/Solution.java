package Level_02.Lektion_05.Aufgabe_01;

/* 
Die benötigte Zahl
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + 3 * x;  // y= 3
        //x = x * 2;      // x = 2
        x = x * 16;     // x = 16
        //y = y + 2 * x;  // y = 2
        y = y + x;      // y = 1

        System.out.println(y);
    }
}