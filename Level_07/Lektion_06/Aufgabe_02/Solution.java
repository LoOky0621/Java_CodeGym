package Level_07.Lektion_06.Aufgabe_02;
/* 
Längste Zeichenkette
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<>();
        for(int i = 0; i < 5; i++)
            strings.add(input.readLine());

        String längste = strings.get(0);
        for(int i = 1; i < 5; i++)
            if(längste.length() < strings.get(i).length())
                längste = strings.get(i);


        for (String element : strings) {
            if (element.length() == längste.length()) {
                System.out.println(element);
            }
        }
    }
}