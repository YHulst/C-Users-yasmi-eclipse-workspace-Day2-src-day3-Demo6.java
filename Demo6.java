package day3;

public class Demo6 {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("salami");
		Pizza pizza2 = new Pizza("hawaii");
		Pizza pizza3 = new Pizza("margaritha");
		Pizza pizza4 = new Pizza("fungi");
		
		Pizza [] pizzas = {pizza1, pizza2, pizza3, pizza4};
		
		for (int x=0 ; x < pizzas.length; x++) {
			
			System.out.println(pizzas[x].ingredient);			
		}
			

	}

}

class Pizza{
	String ingredient;
	
	Pizza(String ingredient){
		this.ingredient = ingredient;
		
	}
}
