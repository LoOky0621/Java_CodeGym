package Level_04.Lektion_04.Aufgabe_03;

/* 
Komm schon, Glückssieben!
*/

public class Solution {
    public static void main(String[] args) {
        intervallPruefen(60);
        intervallPruefen(112);
        intervallPruefen(10);
    }

    public static void intervallPruefen(int a) {
        //schreib hier deinen Code
        if(a > 50 && a < 100)
            System.out.println("Die Zahl "+a+" liegt im Intervall.");  
        else
            System.out.println("Die Zahl "+a+" liegt nicht im Intervall.");
            
    }
}