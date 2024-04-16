package Level_06.Lektion_11.Aufgabe_05;

/* 
Notizblock für neue Ideen
*/

public class Solution {
    public static void main(String[] args) {
        ideeAusdrucken(new Idee());
    }

    //schreib hier deinen Code
    public static class Idee {
        public String beschreibungAbrufen(){
            return "Sex ist nice";
        }
    }
    public static void ideeAusdrucken(Idee idee){
        System.out.println(idee.beschreibungAbrufen());
    }
}
