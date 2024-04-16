package Level_06.Lektion_08.Aufgabe_01;


/* 
Körpergewicht kontrollieren
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double gewicht = Double.parseDouble(bis.readLine());
        double groesse = Double.parseDouble(bis.readLine());

        Koerper.bmiBerechnen(gewicht, groesse);
    }

    public static class Koerper {
        public static void bmiBerechnen(double gewicht, double groesse) {
            // schreib hier deinen Code
            double bmi = gewicht / (groesse * groesse);
            if(bmi < 18.5)
                System.out.println("Untergewicht: BMI < 18,5");
            else if(18.5 <= bmi && bmi < 25)
                System.out.println("Normalgewicht: 18,5 <= BMI < 25");
            else if (25 <= bmi && bmi < 30)
                System.out.println("Übergewicht: 25 <= BMI < 30");
            else if (bmi >= 30)
                System.out.println("Adipös: BMI >= 30");
        }
    }
}