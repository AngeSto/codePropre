package ex4;

import static ex4.animal.ComportementAnimal.*;
import static ex4.animal.TypeAnimal.*;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", MAMMIFERE, HERBIVORE);
		zoo.addAnimal("Zèbre", MAMMIFERE, HERBIVORE);
		zoo.addAnimal("Lion", MAMMIFERE, HERBIVORE);
		zoo.addAnimal("Panthère", MAMMIFERE, CARNIVORE);
		zoo.addAnimal("Requin blanc", POISSON, HERBIVORE);
		zoo.addAnimal("Truite dorée", POISSON, HERBIVORE);
		zoo.addAnimal("Boa constrictor", REPTILE, CARNIVORE);
		zoo.addAnimal("Python", REPTILE, CARNIVORE);
		
		zoo.afficherListeAnimaux();
		zoo.calculerKgsNourritureParJour();
	}
	
}
