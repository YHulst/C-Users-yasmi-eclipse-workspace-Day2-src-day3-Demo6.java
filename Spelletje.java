package day3;

import java.util.Scanner;

public class Spelletje {
	


	public static void main (String [] args) {
		Spel spel = new Spel();
		System.out.println("Welkom bij mijn spel");
		System.out.println("Voer naam speler1 in: ");
		String inputnaam1 = toonMenu();
		Speler speler1 = new Speler(inputnaam1, 1);
		spel.speler1 = speler1;
		System.out.println("Voer naam speler2 in: ");
		String inputnaam2 = toonMenu();
		Speler speler2 = new Speler(inputnaam2, 2);
		spel.speler2 = speler2;
		boolean doorspelen = true;
		boolean eersteronde = true;
		while(doorspelen) {
			String input;
			if(eersteronde)
			{
				spel.spelerAanzet = spel.speler1;
				System.out.println(spel.spelerAanzet.naam + " voer een woord in: ");
				input = toonMenu();
				spel.vorigWoord = input; 
				spel.spelerAanzet = speler2;
				System.out.println(spel.spelerAanzet.naam + " voer een woord in: ");
				String input2 = toonMenu();
				spel.huidigWoord = input2;
				eersteronde = false;
			}
			else
			{
				if(spel.spelerAanzet == spel.speler1)
				{
					spel.spelerAanzet = spel.speler2;
				}
				else {
					spel.spelerAanzet = spel.speler1;
				}
				System.out.println(spel.spelerAanzet.naam + " voer een woord in: ");
				spel.vorigWoord = spel.huidigWoord;
				input = toonMenu();
				spel.huidigWoord = input; 
			}
			//String input = toonMenu();
			//spel.vorigWoord = input; 
			//String input2 = toonMenu();
			//spel.huidigWoord = input2;
			//System.out.println(spel.vorigWoord);
			//System.out.println(spel.huidigWoord);
			boolean correctantwoord = spel.vergelijkWoorden(spel.vorigWoord, spel.huidigWoord);
			if(correctantwoord)
			{
				spel.spelerAanzet.score++;
			}
			else
			{
				doorspelen = false;
			}
			//switch(input) {
				//case "a":
				//	ietsRandom();
					//break;
				//case "q":
					//doorspelen = false;
			//}
			
		}
		System.out.println("Bedankt voor het spelen");
	}
	
	static String toonMenu() {
		//System.out.println("Voer een woord in: ");
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
	Speler spelerAanzet;
	Speler speler1;
	Speler speler2;
	
	boolean vergelijkWoorden(String woord1, String woord2) {
		char letterWoord1;
		char letterWoord2;
		
		int lengteWoord1 = woord1.length();
		int lengteWoord2 = woord2.length();
		
		letterWoord1 = woord1.charAt(lengteWoord1 -1);
		letterWoord2 = woord2.charAt(0);
		//System.out.println(letterWoord1);
		//System.out.println(letterWoord2);
		
		if(letterWoord1 == letterWoord2)
		{
			//System.out.println(letterWoord1 == letterWoord2);
			System.out.println("De score is " + speler1.naam + ": " + speler1.score + "punten en "+ speler2.naam + ": " + speler2.score + "punten");
			return true;
		}
		else
		{
			System.out.println(letterWoord1 == letterWoord2);
			return false;
		}
	}
	
	
}



