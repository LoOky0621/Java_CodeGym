package Level_05.Lektion_12.Aufgabe_01;

/* 
Die ganze Ente ist nicht genug
*/

public class Solution {

    public static void main(String[] args) {
        Ente ente1 = new Ente();
        Ente ente2 = new Ente();
        System.out.println(ente1);
        System.out.println(ente2);

        //schreib hier deinen Code
        Hund hund = new Hund();
        System.out.println(hund);
        Katze katze = new Katze();
        System.out.println(katze);
        Hund hund2 = new Hund();
        System.out.println(hund2);
        Katze katze2 = new Katze();
        System.out.println(katze2);
    }

    public static class Ente {
        public String toString() {
            return "Ente";
        }
    }

    //schreib hier deinen Code
    public static class Hund {
        public String toString() {
            return "Hund";
        }
    }
    public static class Katze {
        public String toString() {
            return "Katze";
        }
    }
}