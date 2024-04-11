package Level_05.Lektion_12.Aufgabe_02;
/* 
Mann und Frau
*/

public class Solution {
    public static void main(String[] args) {
        //schreib hier deinen Code
        Mann mann = new Mann("Peter", 20, "Mannheim");
        Mann mann1 = new Mann("Wurst",18, "ludwigshafen");
        Frau frau = new Frau("Nadine", 30, "ludwigshafen");
        Frau frau1 = new Frau("Anna", 54, "Heidelberg");
        System.out.println(mann.name+" "+mann.alter+" "+mann.adresse);
        System.out.println(mann1.name+" "+mann1.alter+" "+mann1.adresse);
        System.out.println(frau.name+" "+frau.alter+" "+frau.adresse);
        System.out.println(frau1.name+" "+frau1.alter+" "+frau1.adresse);

    }

    //schreib hier deinen Code
    public static class Mann{
        private String name;
        private int alter;
        private String adresse;

        public Mann(String name, int alter, String adresse) {
            this.name = name;
            this.alter = alter;
            this.adresse = adresse;
        }
    }
    public static class Frau{
        private String name;
        private int alter;
        private String adresse;

        public Frau(String name, int alter, String adresse) {
            this.name = name;
            this.alter = alter;
            this.adresse = adresse;
        }
    }


}