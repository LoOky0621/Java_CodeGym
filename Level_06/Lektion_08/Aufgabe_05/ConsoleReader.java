package Level_06.Lektion_08.Aufgabe_05;

/* 
Klasse ConsoleReader
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ConsoleReader {
    public static String stringLesen() throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        return str;
    }

    public static int intLesen() throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int zahl = Integer.parseInt(input.readLine());
        return zahl;
    }

    public static double doubleLesen() throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double zahl = Double.parseDouble(input.readLine());
        return zahl;
    }

    public static boolean booleanLesen() throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean frage = Boolean.parseBoolean(input.readLine());
        return frage;
    }

    public static void main(String[] args) {

    }
}