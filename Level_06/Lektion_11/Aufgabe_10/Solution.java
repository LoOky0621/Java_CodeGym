package Level_06.Lektion_11.Aufgabe_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Aufsteigende Zahlen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //schreib hier deinen Code
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++)
            list.add(Integer.parseInt(reader.readLine()));


        for(int j = 0; j < 5; j++) {
            int min = list.get(0), index = 0;
            for (int i = 1; i < list.size(); i++) {
                min = vergleich(min, list.get(i));
                if (min == list.get(i))
                    index = i;
            }
            System.out.println(min);
            list.remove(index);
        }
    }
    public static int vergleich(int a,int b){
        return a > b ?b:a;
    }
}