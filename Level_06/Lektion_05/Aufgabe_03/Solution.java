package Level_06.Lektion_05.Aufgabe_03;

/* 
Katze- und Hund-Objekte: je 50.000
*/

public class Solution {
    public static void main(String[] args) {
        // schreib hier deinen Code
        int i = 0;
        while(i < 50000)
        {
            Katze katze = new Katze();
            Hund hund = new Hund();
            i++;
        }
    }
}

class Katze {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Eine Katze wurde zerstört");
    }
}

class Hund {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Ein Hund wurde zerstört");
    }
}
