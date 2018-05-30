package day3;

import java.util.Scanner;

public class Spelletje {
	


	public static void main (String [] args) {
		Spel spel = new Spel();
		System.out.println("Welkom bij mijn spel");
		boolean doorspelen = true;
		while(doorspelen) {
			String input = toonMenu();
			spel.vorigWoord = input; 
			String input2 = toonMenu();
			spel.huidigWoord = input2;
			System.out.println(spel.vorigWoord);
			System.out.println(spel.huidigWoord);
			switch(input) {
				case "a":
				//	ietsRandom();
					break;
				case "q":
					doorspelen = false;
			}
			
		}
		System.out.println("Bedankt voor het spelen");
	}
	
	static String toonMenu() {
		System.out.println("Voer een woord in: ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();

	}
}

class Speler{
	
	String naam;
	int nummer;
	int score; 
	
	Speler(String naam, int nummer){
		this.naam = naam;
		this.nummer = nummer;
	}
}

class Spel{
	String huidigWoord;
	String vorigWoord; 
	
	boolean vergelijkWoorden(String woord1, String woord2) {
		return true;
	}
	
	
}



