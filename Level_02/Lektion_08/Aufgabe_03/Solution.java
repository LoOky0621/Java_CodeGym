package Level_02.Lektion_08.Aufgabe_03;

/* 
Die kleinste aus drei Zahlen
*/

public class Solution {
    public static int min(int a, int b, int c) {
        //schreib hier deinen Code
        int m;
        
        if(a < b)
            m = a;
        else    
            m = b;
            
        if(c < m)
            m = c;
        
        return m;    
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
