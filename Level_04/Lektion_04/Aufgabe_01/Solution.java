package Level_04.Lektion_04.Aufgabe_01;

/* 
Gut oder schlecht?
*/

public class Solution {
    public static void main(String[] args) {
        vergleichen(3);
        vergleichen(6);
        vergleichen(5);
    }

    public static void vergleichen(int a) {
        //schreib hier deinen Code
        if(a > 5)
            System.out.println("die Zahl ist größer als 5");
        else
            {
                if (a < 5)
                    System.out.println("die Zahl ist kleiner als 5");
                else
                    System.out.println("die Zahl ist gleich 5");
            }

    }
}