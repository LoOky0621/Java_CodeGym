package Level_02.Lektion_08.Aufgabe_04;

/*
Die kleinste aus vier Zahlen
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        //schreib hier deinen Code
        int m;

        m=min(a,b);
        m=min(m,c);
        m=min(m,d);
        return m;


       /* if(a < b)
            m = a;
        else
            m = b;

        if(c < m)
            m = c;
        if(d < m)
            m = d;

        return m;  */
    }

    public static int min(int a, int b) {
        //schreib hier deinen Code
        if(a < b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}