package Level_05.Lektion_12.Aufgabe_03;

/* 
Tom und Jerry
*/

public class Solution {
    public static void main(String[] args) {
        Maus jerryMaus = new Maus("Jerry", 12, 5);
        Hund wuf = new Hund("Peter",6,7);
        Katze tom = new Katze("Tom",7,5);
    }

    public static class Maus {
        String name;
        int groesse;
        int schwanz;

        public Maus(String name, int groesse, int schwanz) {
            this.name = name;
            this.groesse = groesse;
            this.schwanz = schwanz;
        }
    }
    public static class Katze {
        String name;
        int groesse;
        int schwanz;

        public Katze(String name, int groesse, int schwanz) {
            this.name = name;
            this.groesse = groesse;
            this.schwanz = schwanz;
        }
    }
    public static class Hund {
        String name;
        int groesse;
        int schwanz;

        public Hund(String name, int groesse, int schwanz) {
            this.name = name;
            this.groesse = groesse;
            this.schwanz = schwanz;
        }
    }
}