package Level_05.Lektion_08.Aufgabe_02;
/* 
Katzen erschaffen
*/

public class Katze {
    //schreib hier deinen Code
    private String name;
    private int alter;
    private int gewicht;
    private String adresse;
    private String farbe;

    public Katze(String name) {
        this.name = name;
        this.alter = 2;
        this.gewicht = 3;
        this.farbe = "rot";
    }

    public Katze(String name, int gewicht, int alter) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.farbe = "blau";
    }
    public Katze(String name, int alter) {
        this.name = name;
        this.alter = alter;
        this.gewicht = 3;
        this.farbe = "braun";
    }
    public Katze(int gewicht, String farbe) {
        this.gewicht = gewicht;
        this.alter = 5;
        this.farbe = farbe;
    }
    public Katze(int gewichte, String farbe, String adress) {
        this.alter = 3;
        this.gewicht = gewichte;
        this.adresse = adress;
        this.farbe = farbe;
    }

    public static void main(String[] args) {

    }
}