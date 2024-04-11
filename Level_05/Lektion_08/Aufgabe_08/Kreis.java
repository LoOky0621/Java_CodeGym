package Level_05.Lektion_08.Aufgabe_08;

/* 
Einen Konstruktors aus einem Konstruktor heraus aufrufen
*/

public class Kreis {

    public double x;
    public double y;
    public double radius;

    public Kreis(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Kreis(double x, double y) {
        //schreib hier deinen Code
        this(x, y, 10);
    }

    public Kreis() {

        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Kreis kreis = new Kreis();
        System.out.println(kreis.x + " " + kreis.y + " " + kreis.radius);
        Kreis einWeitererKreis = new Kreis(10, 5);
        System.out.println(einWeitererKreis.x + " " + einWeitererKreis.y + " " + einWeitererKreis.radius);
    }
}