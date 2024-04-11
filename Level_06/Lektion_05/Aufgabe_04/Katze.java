package Level_06.Lektion_05.Aufgabe_04;

/* 
Katzenzähler
*/

public class Katze {
    public static int katzenAnzahl = 0;

    //schreib hier deinen Code
    Katze(){
        katzenAnzahl++;
    }

    protected void finalize(){
        katzenAnzahl--;
    }


    public static void main(String[] args) {

    }
}