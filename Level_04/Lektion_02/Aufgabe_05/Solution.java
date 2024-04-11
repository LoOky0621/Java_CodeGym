package Level_04.Lektion_02.Aufgabe_05;

/* 
Katzen im Universum
*/

public class Solution {
  public static void main(String[] args) {
      Katze katze1 = new Katze();
      //schreib hier deinen Code
      Katze.anzahl += 1;

      Katze katze2 = new Katze();
      //schreib hier deinen Code
      Katze.anzahl += 1;

      System.out.println("Die Anzahl der Katzen beträgt " + Katze.anzahl);
  }

  public static class Katze {
      public static int anzahl = 0;
  }
}