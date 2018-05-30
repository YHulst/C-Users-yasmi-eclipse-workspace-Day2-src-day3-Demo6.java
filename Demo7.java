package day3;

import java.util.ArrayList;

public class Demo7 {

	public static void main(String[] args) {
			
		ArrayList<Fiets> veleFietsen = new ArrayList();
		veleFietsen.add(new Fiets("roze"));
		veleFietsen.add(new Fiets("paars"));
		veleFietsen.add(new Fiets("geel"));
		veleFietsen.add(new Fiets("groen"));
		veleFietsen.add(new Fiets("blauw"));
		//	System.out.println(veleFietsen.size());
		
		int count = 0;
		for (Fiets f : veleFietsen) {
			System.out.print("Kleur fiets: ");
			System.out.print(f.kleur);
			System.out.println(". ");
			
			count += 1; 
			
		if (count == 2) {
			f.fietsen();
		}
			
						
		}
		
		
	}
}

class Fiets{
	String kleur;
	int aantalSpaken;
	
	Fiets(String kleur) {
		this.kleur = kleur;
	}
	
	void fietsen() {
		System.out.println("Ik fiets!");
	}
	
}

