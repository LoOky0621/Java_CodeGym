package Level_07.Lektion_06.Aufgabe_01;
/* 
Was für eine Liste ist das?
*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //schreib hier deinen Code
        ArrayList<String> list = new ArrayList<String>();
        list.add("Peter");
        list.add("Parker");
        list.add("hulk");
        list.add("Thor");
        list.add("Natascha");
        System.out.println(list.size());
        for(int i = 0; i < 5; i++)
            System.out.println(list.get(i));
    }
}