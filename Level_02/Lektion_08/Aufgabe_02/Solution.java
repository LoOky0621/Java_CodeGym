package Level_02.Lektion_08.Aufgabe_02;

/* 
Mindestens zwei Zahlen
*/

public class Solution {
    public static int min(int a, int b) {
        //schreib hier deinen Code
        if(a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}