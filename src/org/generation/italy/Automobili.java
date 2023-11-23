package org.generation.italy;

public class Automobili {

	int velocità;
	float carburante, consumoMedio, totKmPercorsi; 
	// se usassi Float con la f maiuscola, dovrei aggiungere la f dopo i numeri;
	// ciò perché Float è una classe, float è un tipo primitivo.
	// Metodi
	
	public void accellera() {
		
		if(velocità <= 190)
			velocità += 10;
	
	}
	
	public void decellera() {
		
		if(velocità > 9)
			velocità -= 10;
	}
	
	public void mostraDati () {
	
	System.out.println("velocità attuale " + velocità + "km/h");
	System.out.println("consumo medio " + consumoMedio + "Km/l" );	
	System.out.println("carburante " + carburante + "litri");
	System.out.println("km percorsi " + totKmPercorsi + "km");
	
	}
	
	public void aggiorna () {
	// passata un ora
		
		int kmPercorsi1h = velocità; 
		totKmPercorsi += kmPercorsi1h;
		carburante -= kmPercorsi1h/consumoMedio; 
		carburante = velocità/consumoMedio;
		
	/* essendo il carburante in litri, devo ottenere dalla formula un risultato
	 * in litri. Ergo, devo dividere i kmPercorsi (espressi in km) con il
	 * consumoMedio (espresso in km su litri). Quindi, ottengo una semplificaizione
	 * dell'unità di misura dei kilometri e mi rimangono i litri.*/
	
		
	}
	
}
