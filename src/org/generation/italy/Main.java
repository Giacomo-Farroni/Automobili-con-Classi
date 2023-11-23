package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dichiaro 2 oggetti per la classe automobili (auto1 e auto2);
		
	Automobili auto1=new Automobili();
	Automobili auto2=new Automobili();
	Automobili autoCorrente = auto1;
	
	//inzializzazione degli attributi degli oggetti della classe automobile;
	
	auto1.velocità = 0;
	auto1.consumoMedio= 20;
	auto1.carburante = 30;
	auto1.totKmPercorsi = 0;
	
	
	auto2.velocità = 0;
	auto2.consumoMedio = 23;
	auto2.carburante = 50;
	auto2.totKmPercorsi = 0;
	
	
	Scanner sc=new Scanner(System.in);
	String scelta, risposta;
	
	System.out.println("Auto1: ");
	auto1.mostraDati();
	
	System.out.println("Auto2: ");
	auto2.mostraDati();
	
	
	
	do {
		
		System.out.println("Quale auto vuoi? Auto1 o Auto2?");
		
			scelta=sc.nextLine();
			
			if(scelta.equalsIgnoreCase("auto1"))
				autoCorrente = auto1;
			
			else if(scelta.equalsIgnoreCase("auto2"))
				autoCorrente = auto2;
	
			do {
				
					System.out.println("Vuoi accellerare o decellerare la tua velocità?");
					scelta=sc.nextLine();
				
							switch(scelta) 
							
							{
							
							case "accellera":
								autoCorrente.accellera();
								break;
								
							case "decellera":
								autoCorrente.decellera();
								break;
						
							}
				
					autoCorrente.aggiorna();
						
					System.out.println("vuoi fare altre operazioni?");
					risposta=sc.nextLine();
					
			
			} while(risposta.startsWith("s"));
			
			
				
					System.out.println("vuoi guidare ancora?");
					risposta=sc.nextLine();
	
			} while(risposta.startsWith("s"));
	
	
	
		System.out.println("Auto1: ");
		auto1.mostraDati();
		
		System.out.println("Auto2: ");
		auto2.mostraDati();
	
	
	sc.close();
	
	}
	
	

}
