package Level_04.Lektion_01.Aufgabe_01;

/* 
Dieses Alter funktioniert bei mir nicht…
*/

public class Solution {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Alter: " + person.alter);
        person.alterAnpassen(person.alter);
        System.out.println("Angepasstes Alter: " + person.alter);
    }

    public static class Person {
        public int alter = 20;

        public void alterAnpassen(int alter) {
            this.alter = alter + 20;
            System.out.println("Das Alter in alterAnpassen() ist " + alter);
        }
    }
}