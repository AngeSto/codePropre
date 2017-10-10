package ex4;

import ex4.animal.Animal;
import ex4.animal.ComportementAnimal;
import ex4.animal.TypeAnimal;
import ex4.zone.Aquarium;
import ex4.zone.FermeReptile;
import ex4.zone.SavaneAfricaine;
import ex4.zone.ZoneCarnivore;
import static ex4.animal.ComportementAnimal.*;
import static ex4.animal.TypeAnimal.*;

import java.util.ArrayList;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
		
	}
	
	public void addAnimal(String nomAnimal, TypeAnimal typeAnimal, ComportementAnimal comportement){
		Animal animal = new Animal(nomAnimal, typeAnimal, comportement);
		
		if (typeAnimal.equals(MAMMIFERE) && comportement.equals(CARNIVORE)){
			zoneCarnivore.addAnimal(animal);
		}
		else if (typeAnimal.equals(MAMMIFERE) && comportement.equals(HERBIVORE)){
			savaneAfricaine.addAnimal(animal);
		}
		else if (typeAnimal.equals(REPTILE)){
			fermeReptile.addAnimal(animal);
		}
		else if (typeAnimal.equals(POISSON)){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	public void calculerKgsNourritureParJour(){
		System.out.println("Il va falloir "+savaneAfricaine.calculerKgsNourritureParJour()+" Kg de nourriture pour la zone savane africaine");
		System.out.println("Il va falloir "+zoneCarnivore.calculerKgsNourritureParJour()+" Kg de nourriture pour la zone carnivore");
		System.out.println("Il va falloir "+fermeReptile.calculerKgsNourritureParJour()+" Kg de nourriture pour la ferme de reptile");
		System.out.println("Il va falloir "+aquarium.calculerKgsNourritureParJour()+" Kg de nourriture pour la zone aquarium");
	}
	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
