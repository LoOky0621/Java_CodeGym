package Level_05.Lektion_05.Aufgabe_02;
/* 
Implementiere die Methode kaempfen
*/

public class Katze {
    public int alter;
    public int gewicht;
    public int staerke;

    public Katze() {
    }

    public boolean kaempfen(Katze andereKatze) {
        //schreib hier deinen Code
        int counter1 = 0, counter2 =0;
        if(this.staerke > andereKatze.staerke)
            counter1 +=2;
        else
            counter2 +=2;
        if(this.gewicht <= andereKatze.gewicht)
            counter1 +=2;
        else
            counter2 +=2;
        if(this.alter <= andereKatze.alter)
            counter1 +=1;
        else
            counter2 +=2;

        return counter1 > counter2;
    }

    public static void main(String[] args) {
        Katze katze1 = new Katze();
        katze1.alter = 6;
        katze1.gewicht = 5;
        katze1.staerke = 20;
        Katze katze2 = new Katze();
        katze2.alter = 5;
        katze2.gewicht = 6;
        katze2.staerke = 18;

        if(katze1.kaempfen(katze2))
            System.out.println("Katze1 Gewinnt!");
        else
            System.out.println("Katze2 Gewinnt!");

        if(katze2.kaempfen(katze1))
            System.out.println("Katze2 Gewinnt!");
        else
            System.out.println("Katze1 Gewinnt!");
    }
}