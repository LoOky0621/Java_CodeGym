package Level_04.Lektion_13.Aufgabe_03;

/* 
Dreieck aus Achten
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        for(int zeile = 1; zeile <= 10; zeile++){
            for(int reihe = 1; reihe <= 10; reihe++){
                if(reihe <= zeile)
                    System.out.print("8");
            }
            System.out.println();
        }

    }
}
