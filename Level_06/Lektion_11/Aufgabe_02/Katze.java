package Level_06.Lektion_11.Aufgabe_02;


/* 
static-Katzen
*/
import java.util.ArrayList;

public class Katze {
    //schreib hier deinen Code
    public static ArrayList<Katze> katzen;
    public static int counter = 0;
    public Katze() {
        counter++;
    }

    public static void main(String[] args) {
        //schreib hier deinen Code
        katzen = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            katzen.add(new Katze());
        katzenAusdrucken();
    }

    public static void katzenAusdrucken() {
        //schreib hier deinen Code
        for (int i = 0; i < 10; i++)
            System.out.println(katzen.get(i));
    }
}