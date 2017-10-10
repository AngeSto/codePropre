package ex4.animal;

public class Animal {

	private TypeAnimal types;
	private String noms;
	private ComportementAnimal comportements;
	
	public String toString(){
		
		return "Animal "+noms+" de type "+types;
	}
	
	public Animal(String nomAnimal, TypeAnimal typeAnimal, ComportementAnimal comportement) {
		this.noms = nomAnimal;
		this.types = typeAnimal;
		this.comportements = comportement;
	}
	/**Getter for types
	 * @return types
	 */
	public TypeAnimal getTypes() {
		return types;
	}
	/**
	 * @param types the types to set
	 */
	public void setTypes(TypeAnimal types) {
		this.types = types;
	}
	/**Getter for noms
	 * @return noms
	 */
	public String getNoms() {
		return noms;
	}
	/**
	 * @param noms the noms to set
	 */
	public void setNoms(String noms) {
		this.noms = noms;
	}
	/**Getter for comportements
	 * @return comportements
	 */
	public ComportementAnimal getComportements() {
		return comportements;
	}
	/**
	 * @param comportements the comportements to set
	 */
	public void setComportements(ComportementAnimal comportements) {
		this.comportements = comportements;
	}
	
}
