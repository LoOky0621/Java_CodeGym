package Level_07.Lektion_06.Aufgabe_06;

/* 
Kürzeste oder längste
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
            list.add(input.readLine());

        int indexmax = 0, indexmin = 0;
        String maxIndex = list.get(0), minIndex = list.get(0);
        for(int i = 1; i < 10; i++){
            if(maxIndex.length() > list.get(i).length()){
                maxIndex = list.get(i);
                indexmax = i;
            }
            if(minIndex.length() < list.get(i).length()){
                minIndex = list.get(i);
                indexmin = i;
            }

        }
        if(indexmax < indexmin)
            System.out.println(maxIndex);
        else if(indexmin < indexmax)
            System.out.println(minIndex);
    }
    public static int längste(int a, int b){
        return a > b ? a : b;
    }
    public static int kürzeste(int a, int b){
        return a < b ? a : b;
    }
}