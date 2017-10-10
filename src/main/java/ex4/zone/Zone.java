package ex4.zone;

import java.util.ArrayList;
import java.util.List;

import ex4.animal.Animal;

public abstract class Zone {

	protected List<Animal> listanimal;
	protected double CST;

	public Zone() {
		this.listanimal = new ArrayList<>();
		this.CST = 0;
	}

	public void addAnimal(Animal newanimal) {
		listanimal.add(newanimal);
	}

	public void afficherListeAnimaux() {
		for (Animal animal : listanimal) {
			System.out.println(animal);
		}
	}

	public double calculerKgsNourritureParJour() {
		return listanimal.size() * CST;
	}
}
