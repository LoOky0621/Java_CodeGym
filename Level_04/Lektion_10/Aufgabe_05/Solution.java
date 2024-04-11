package Level_04.Lektion_10.Aufgabe_05;

/* 
Multiplikationstabelle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        int reihe = 1;
        while(reihe <= 10){
            int zeile = 1;
            while(zeile <= 10){
                System.out.print(zeile*reihe+ " ");
                zeile++;
            }
            System.out.println();
            reihe++;
        }

    }
}