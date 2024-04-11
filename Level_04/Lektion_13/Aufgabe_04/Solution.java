package Level_04.Lektion_13.Aufgabe_04;

/* 
Linien zeichnen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        for(int verti = 0; verti <= 10; verti++){
            for(int hori = 1; hori <= 10; hori++){
                if(verti == 0)
                    System.out.print("8");
                else if(hori == 1)
                    System.out.print("8");
            }
            System.out.println();
        }

    }
}