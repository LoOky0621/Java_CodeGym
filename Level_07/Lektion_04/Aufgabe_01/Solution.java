package Level_07.Lektion_04.Aufgabe_01;
/* 
Der höchste Wert in einem Array
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = arrayInitialisieren();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] arrayInitialisieren() throws IOException {
        // Array erstellen und füllen
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int arry[] = new int[20];
        for(int i = 0; i < arry.length; i++)
            arry[i] = Integer.parseInt(input.readLine());
        return arry;
    }

    public static int max(int[] array) {
        // Größten Wert finden
        int zahl = array[0];
        for(int i = 0; i < array.length; i++){
            zahl = zahl < array[i] ? array[i]:zahl;
        }
        return zahl;
    }
}