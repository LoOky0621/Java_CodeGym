package Level_05.Lektion_08.Aufgabe_07;
/* 
Konstruktor
*/

public class Kreis {
    public Farbe farbe;

    public static void main(String[] args) {
        Kreis kreis = new Kreis();
        kreis.farbe.setBeschreibung("Rot");
        System.out.println(kreis.farbe.getBeschreibung());
    }

    public Kreis() {
        farbe = new Farbe();
    }

    public class Farbe {
        String beschreibung;

        public String getBeschreibung() {
            return beschreibung;
        }

        public void setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
        }
    }
}

