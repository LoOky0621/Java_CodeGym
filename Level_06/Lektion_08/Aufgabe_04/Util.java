package Level_06.Lektion_08.Aufgabe_04;

/* 
Abstand zwischen zwei Punkten
*/

public class Util {
    public static double abstandAbrufen(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {

    }
}