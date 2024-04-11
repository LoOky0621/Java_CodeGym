package Level_03.Lektion_03.Aufgabe_02;

/* 
Währungsumtausch
*/

public class Solution {
    public static void main(String[] args) {
        //schreib hier deinen Code
        System.out.println(eurInUsdUmwandeln(13, 1.154));
        System.out.println(eurInUsdUmwandeln(18, 1.254));
        
    }

    public static double eurInUsdUmwandeln(int eur, double wechselkurs) {
        //schreib hier deinen Code
        double dollar;
        dollar = eur * wechselkurs;
        return dollar;
    }
}