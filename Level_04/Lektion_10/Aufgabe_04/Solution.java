package Level_04.Lektion_10.Aufgabe_04;

/* 
Dollars in einer Zukunft
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        int zeile = 0, reihe = 0;
        while(reihe < 10){
            while (zeile < 10){
                System.out.print("$");
                zeile++;
            }
            System.out.println();
            reihe++;
            zeile = 0;
        }
    }
}
