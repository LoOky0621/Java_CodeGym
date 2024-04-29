package Level_07.Lektion_06.Aufgabe_03;
/* 
Uns selbst prägnanter ausdrücken
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String str = input.readLine();
        for(int i = 0; i < 4; i++) {
            list.add(input.readLine());
            str = str.length() >= list.get(i).length() ? list.get(i):str;
        }
        System.out.println(str);
    }
}
