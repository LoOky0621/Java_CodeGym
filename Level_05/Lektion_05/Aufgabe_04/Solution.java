package Level_05.Lektion_05.Aufgabe_04;

/* 
Die drei „Muskatztiere“
*/

public class Solution {
    public static void main(String[] args) {
        //schreib hier deinen Code
        Katze katze1 = new Katze("Miau", 6,8,20);
        Katze katze2 = new Katze("Wau", 6,8,20);
        Katze katze3 = new Katze("Po", 6,8,20);
    }

    public static class Katze {
        private String name;
        private int alter;
        private int gewicht;
        private int staerke;

        public Katze(String name, int alter, int gewicht, int staerke) {
            this.name = name;
            this.alter = alter;
            this.gewicht = gewicht;
            this.staerke = staerke;
        }
    }
}