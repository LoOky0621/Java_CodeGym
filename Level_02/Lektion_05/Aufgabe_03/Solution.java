package Level_02.Lektion_05.Aufgabe_03;

/* 
Haustiere brauchen Menschen
*/

public class Solution {
    public static void main(String[] args) {
        //schreib hier deinen Code
        Fisch fisch = new Fisch();
        fisch.halter = new Frau();
        Hund hund = new Hund();
        hund.halter = new Frau();
        Katze katze = new Katze();
        katze.halter = new Frau();
        Frau frau = new Frau();
    }

    public static class Katze {
        public Frau halter;
    }

    public static class Hund {
        public Frau halter;
    }

    public static class Fisch {
        public Frau halter;
    }

    public static class Frau {
    }
}