package Level_04.Lektion_02.Aufgabe_04;

/* 
Namensregister
*/

public class Katze {
    private String vollstaendigerName;

    public void nameFestlegen(String vorname, String nachname) {
        String vollstaendigerName = vorname + " " + nachname;

        //schreib hier deinen Code
        this.vollstaendigerName = vollstaendigerName;
    }

    public static void main(String[] args) {
        Katze katze = new Katze();
        katze.nameFestlegen("König", "Simba");
        System.out.println(katze.vollstaendigerName);
    }
}
