package Level_04.Lektion_02.Aufgabe_02;
/* 
Katzenregister
*/

public class Katze {
    private static int katzenAnzahl = 0;

    public static void neueKatzeZufuegen() {
        //schreib hier deinen Code

        Katze.katzenAnzahl += 1;
    }

    public static void main(String[] args) {
        neueKatzeZufuegen();
        System.out.println(katzenAnzahl);
    }
}