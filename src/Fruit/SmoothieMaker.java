package Fruit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SmoothieMaker {

	public static void main(String[] args) {

		Collection<Fruit> fruit = new ArrayList<>();
		fruit.add(new Orange());
		fruit.add(new Banana());
		Recipe orangeBanana = new Recipe("Orange Banana", fruit);

		Recipe cherryPeach = new Recipe("Cherry Peach");
		cherryPeach.addFruit(new Cherry());
		cherryPeach.addFruit(new Peach());
		
		cherryPeach.printIngredients();

	}

}
