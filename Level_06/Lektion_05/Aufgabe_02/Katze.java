package Level_06.Lektion_05.Aufgabe_02;
/* 
Zombie-Katzen, Zombie-Hunde
*/

public class Katze {
    public static void main(String[] args) {

    }

    //schreib hier deinen Code
    protected void finalize(){
        System.out.println("Eine Katze wurde zerstört");
    }
}

class Hund {
    //schreib hier deinen Code
    protected void finalize(){
        System.out.println("Ein Hund wurde zerstört");
    }
}
