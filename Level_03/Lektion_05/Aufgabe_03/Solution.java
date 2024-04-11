package Level_03.Lektion_05.Aufgabe_03;

/* 
Zeitumwandlung
*/

public class Solution {
    //schreib hier deinen Code
    public static int inSekundenUmwandeln(int stunde)
    {
        int sek;
        sek = stunde*60*60;
        return sek;
    }

    public static void main(String[] args) {
        //schreib hier deinen Code
        System.out.println(inSekundenUmwandeln(18));
        System.out.println(inSekundenUmwandeln(17));
    }
}