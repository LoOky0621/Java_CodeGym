package Level_05.Lektion_07.Aufgabe_06;

/* 
Ein Programmierer erschafft eine Person
*/

public class Solution {
    public static void main(String[] args) {
        //schreib hier deinen Code
        Person person = new Person();
        person.initialisieren("Paul", 83);

    }

    static class Person {
        //schreib hier deinen Code
        private String name;
        private int alter;
        public void initialisieren(String name, int alter){
            this.name = name;
            this.alter = alter;
        }
    }
}
