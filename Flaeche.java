package a08;

/**
 * 
 * @author Nemanja Stojicevic
 * @version 10.11.2016
 *
 */
public class Flaeche implements IFlaeche {

    private double a;

    /**
     * Berechnet die Flaeche von einem Rechteck/Kreis/Dreieck mittels den
     * Variablen x,y,z
     *
     * @author Konrad Kloesch
     */
    public Flaeche(int x, int y, int z) {
        if (y == 0) {
            a = x * x * 3.14;
        } else if (z == 0) {
            a = x * y;
        } else {
            int s = (x + y + z) / 2;
            a = Math.sqrt(s * (s - x) * (s - y) * (s - z));

        }

    }

    /**
     * @return Gibt die Flaeche zurück
     *
     * @author Konrad Kloesch
     */
    @Override
    public double getFlaeche() {

        return this.a;
    }
}
