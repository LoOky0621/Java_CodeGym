package Level_02.Lektion_02.Aufgabe_04;

/* 
Familienbeziehungen
*/

public class Solution {
    public static void main(String[] args) {
        //schreib hier deinen Code
        Mann mann = new Mann();
        Frau frau = new Frau();
        frau.ehemann = mann;
        mann.ehefrau = frau;
    }

    public static class Mann {
        public int alter;
        public int groesse;
        public Frau ehefrau;
    }

    public static class Frau {
        public int alter;
        public int groesse;
        public Mann ehemann;
    }
}