package Level_05.Lektion_08.Aufgabe_06;

/* 
Maximale Konstruktoren
*/

public class Kreis {
    public double x;
    public double y;
    public double radius;

    //schreib hier deinen Code


    public Kreis() {
    }

    public Kreis(double x) {
        this.x = x;
    }

    public Kreis(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Kreis(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}