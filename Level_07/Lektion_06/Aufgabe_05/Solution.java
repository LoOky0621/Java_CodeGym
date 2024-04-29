package Level_07.Lektion_06.Aufgabe_05;
/* 
Entfernen und Einfügen
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 5; i++)
            list.add(input.readLine());
        for(int i = 0; i < 13; i++)
            list.add(0, list.remove(4));
        for(int i = 0; i < 5; i++)
            System.out.println(list.get(i));
    }
}