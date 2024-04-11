package Level_04.Lektion_02.Aufgabe_01;

/* 
Wie heißt die Katze?
*/

public class Katze {
    private String name = "namenlose Katze";

    public void nameFestlegen(String name) {
        //schreib hier deinen Code
        this.name = name;
    }

    public static void main(String[] args) {
        Katze katze = new Katze();
        katze.nameFestlegen("Simba");
        System.out.println(katze.name);
    }
}