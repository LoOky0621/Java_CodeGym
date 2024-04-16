package Level_06.Lektion_11.Aufgabe_04;

/* 
static-Mindestanzahl
*/

public class Solution {
    public static int schritt;

    public static void main(String[] args) {
        methode1();
    }

    public static void methode1() {
        methode2();
    }

    public static void methode2() {
        new Solution().methode3();
    }

    public void methode3() {
        methode4();
    }

    public void methode4() {
        schritt++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
        if (schritt > 1) {
            return;
        }
        main(null);
    }
}