package Level_07.Lektion_06.Aufgabe_04;
/* 
An den Anfang der Liste
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            list.add(0, input.readLine());
        for(int i = 0; i < 10; i++)
            System.out.println(list.get(i));
    }
}
