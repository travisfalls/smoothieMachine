package Fruit;

import java.util.ArrayList;
import java.util.Collection;

public class Recipe {
	final String name;
	final Collection<Fruit> fruityIngredients;

	public Recipe(String name) {
		this.name = name;
		fruityIngredients = new ArrayList<>();
	}

	public Recipe(String name, Collection<Fruit> fruit) {
		this.name = name;
		fruityIngredients = fruit;
	}

	public void addFruit(Fruit fruit) {
		fruityIngredients.add(fruit);
	}

	public void printIngredients() {
		for(Fruit ingredient : fruityIngredients){
			System.out.println(ingredient.getName());
		}
		
	}

}
