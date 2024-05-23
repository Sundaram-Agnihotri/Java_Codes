package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.bird.Bird;
import animal.bird.Eagle;
import animal.fish.Eel;
import animal.reptile.Crocodile;
import animal.reptile.Reptile;

public class Main {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		Animal animal = new Animal();
		Reptile reptile = new Reptile();
		Animal croc = new Crocodile();
		Animal eel = new Eel();
		Bird eagle = new Eagle();

		animals.add(animal);
		animals.add(reptile);
		animals.add(croc);
		animals.add(eel);
		animals.add(eagle);

		listAnimals(animals);

	}

	private static void listAnimals(List<Animal> animals) {
		for(Animal animal: animals){
			System.out.println(animal.showInfo());
		}
	}


}
