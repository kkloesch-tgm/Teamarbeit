package a08;


public class RaumInhalt implements IRaumInhalt{
    private double rauminhalt;
    /**
	 * Konstruktor
         * Berechnet das Volumen des Quaders/Zylinders/Prismas mithilfe der Fläche und Höhe 
	 * 
	 *@author Konrad Kloesch
	 */
    public RaumInhalt(Flaeche a, double hoehe){
        rauminhalt=a.getFlaeche()*hoehe;
    }
    /**
	 * @return Gibt den Rauminhalt zurück
         * 
	 * @author Konrad Kloesch
	 */
    @Override
    public double getRaumInhalt() {
        return rauminhalt;
    }
    
}
