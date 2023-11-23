package org.generation.italy;

public class Automobili {

	int velocit�;
	float carburante, consumoMedio, totKmPercorsi; 
	// se usassi Float con la f maiuscola, dovrei aggiungere la f dopo i numeri;
	// ci� perch� Float � una classe, float � un tipo primitivo.
	// Metodi
	
	public void accellera() {
		
		if(velocit� <= 190 && carburante > 0)
			velocit� += 10;
	
	}
	
	public void decellera() {
		
		if(velocit� > 9)
			velocit� -= 10;
	}
	
	public void mostraDati () {
	
	System.out.println("velocit� attuale " + velocit� + " km/h");
	System.out.println("consumo medio " + consumoMedio + " Km/l" );	
	System.out.println("carburante " + carburante + " litri");
	System.out.println("km percorsi " + totKmPercorsi + " km");
	
	}
	
	public void aggiorna () {
	// passata un ora
		
		int kmPercorsi1h = velocit�; 
		totKmPercorsi += kmPercorsi1h;
		carburante -= kmPercorsi1h/consumoMedio; 
		
		
		if(carburante<=0)
			velocit�=0;
		
	/* essendo il carburante in litri, devo ottenere dalla formula un risultato
	 * in litri. Ergo, devo dividere i kmPercorsi (espressi in km) con il
	 * consumoMedio (espresso in km su litri). Quindi, ottengo una semplificaizione
	 * dell'unit� di misura dei kilometri e mi rimangono i litri.*/
	
		
	}
	
}
