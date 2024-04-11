package Level_05.Lektion_05.Aufgabe_05;
/* 
Fellknäuelgemetzel
*/

public class Solution {
    public static void main(String[] args) {
        //schreib hier deinen Code
        Katze katze1 = new Katze("Charlie", 3, 4, 12);
        Katze katze2 = new Katze("Jacke", 4, 3, 15);
        Katze katze3 = new Katze("Elen", 5, 2, 11);

        if(katze1.kaempfen(katze2))
            System.out.println("Sieger ist: "+katze1.name);
        else
            System.out.println("Sieger ist: "+katze2.name);

        if(katze1.kaempfen(katze3))
            System.out.println("Sieger ist: "+katze1.name);
        else
            System.out.println("Sieger ist: "+katze3.name);

        if(katze2.kaempfen(katze3))
            System.out.println("Sieger ist: "+katze2.name);
        else
            System.out.println("Sieger ist: "+katze3.name);
    }

    public static class Katze {
        protected String name;
        protected int alter;
        protected int gewicht;
        protected int staerke;

        public Katze(String name, int alter, int gewicht, int staerke) {
            this.name = name;
            this.alter = alter;
            this.gewicht = gewicht;
            this.staerke = staerke;
        }

        public boolean kaempfen(Katze andereKatze) {
            int alterVorteil = this.alter > andereKatze.alter ? 1 : 0;
            int gewichtVorteil = this.gewicht > andereKatze.gewicht ? 1 : 0;
            int staerkeVorteil = this.staerke > andereKatze.staerke ? 1 : 0;

            int punktzahl = alterVorteil + gewichtVorteil + staerkeVorteil;
            return punktzahl >= 2; // return punktzahl > 2 ? true : false;
        }
    }
}
