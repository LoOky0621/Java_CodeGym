package Level_06.Lektion_11.Aufgabe_08;


/* 
Katzenbeziehungen
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameMutter = reader.readLine();
        Katze katzeMutter = new Katze(nameMutter);

        String nameTochter = reader.readLine();
        Katze katzeTochter = new Katze(nameTochter, katzeMutter);

        System.out.println(katzeMutter);
        System.out.println(katzeTochter);
    }

    public static class Katze {
        private String name;
        private Katze elternteil;

        Katze(String name) {
            this.name = name;
        }

        Katze(String name, Katze elternteil) {
            this.name = name;
            this.elternteil = elternteil;
        }

        @Override
        public String toString() {
            if (elternteil == null) {
                return "Der Name der Katze ist " + name + ", keine Mutter ";
            } else {
                return "Der Name der Katze ist " + name + ", " + elternteil.name + " ist die Mutter";
            }
        }
    }

}