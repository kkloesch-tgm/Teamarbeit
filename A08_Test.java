package a08;

/**
 * 
 * @author Ulrich Frühstück
 * @description Eine Klasse, die die Main-Methode des Programms 
 * enthällt und sämtliche Methoden der Utility-Klasse aufruft und 
 * testet.
 * @version 10/11/16
 */

public class A08_Test {
	
	/**
	 * Die Main-Methode des Programms, in dem sämtliche Methoden
	 * der Zahlen, Fläche und Rauminhalte-Klasse aufgerufen und somit getestet werden.
	 * @param args ein String Array als Parameter (args= Arguments), damit man 
	 * beim Start des Programms Argumente übergeben kann,
	 * wird allerdings für diese Aufgabe nicht verwendet. 
	 */
	public static void main(String[] args) {
		/* Testen der Methoden der Fläche-Klasse */
		Flaeche f = new Flaeche(3, 4, 5); //erzeugen einer neuen Fläche mit Anfangswerten
		System.out.printf("Testen der Flächen-Methoden\n"); //"Header"
		System.out.printf("Die Fläche ist: %.1f\n", f.getFlaeche()); //ausgeben des Flächeninhalts
		
		/* Testen der Methoden der Zahlen-Klasse */
		Zahlen z = new Zahlen(); //erzeugen eines neuen Zahlen-Objekts
		System.out.printf("Testen der Zahlen-Methoden\n"); //"Header"
		/* Hinzufügen von einigen Test-Werten */
		z.add(3.5);
		z.add(4.8);
		z.add(2.3);
		System.out.printf("Die Summe beträgt: %.1f\n", z.getSumme()); //ausgeben der Summe
		System.out.printf("Das Maximum ist: %.1f\n", z.getMaximum()); //ausgeben des Maximums 
		System.out.printf("Das Minimum ist: %.1f\n", z.getMinimum()); //ausgeben des Minimums
		
		
		/* Testen der Methoden der Rauminhalt-Klasse */
		RaumInhalt ri = new RaumInhalt(f, 4.2); /* //erzeugen eines neuen Rauminhalt-Objekts mit Anfangswerten, 
		als Fläche benutze ich natürlich gleich das Flächenobjekt, das ich bereits angelegt habe */
		System.out.printf("Testen der Zahlen-Methoden\n"); //"Header"
		System.out.printf("Der Rauminhalt beträgt: %.1f\n", ri.getRaumInhalt()); //ausgeben des Rauminhalts
		
	}
}
