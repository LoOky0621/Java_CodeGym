package Level_03.Lektion_04.Aufgabe_03;

/* 
Hallo, StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //schreib hier deinen Code
    Zerg zerg1 = new Zerg();
    zerg1.name = "Bwipo";
    Zerg zerg2 = new Zerg();
    zerg2.name = "Adam";
    Zerg zerg3 = new Zerg();
    zerg3.name = "Nisqy";
    Zerg zerg4 = new Zerg();
    zerg4.name = "Upset";
    Zerg zerg5 = new Zerg();
    zerg5.name = "Hyli";

    Protoss protoss1 = new Protoss();
    protoss1.name = "Always";
    Protoss protoss2 = new Protoss();
    protoss2.name = "FNATIC";
    Protoss protoss3 = new Protoss();
    protoss3.name = "!!!";

    Terraner terraner1 = new Terraner();
    terraner1.name = "Ohne";
    Terraner terraner2 = new Terraner();
    terraner2.name = "G2";
    Terraner terraner3 = new Terraner();
    terraner3.name = "Fahrn wir";
    Terraner terraner4 = new Terraner();
    terraner4.name = "Zur WM";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terraner {
        public String name;
    }
}