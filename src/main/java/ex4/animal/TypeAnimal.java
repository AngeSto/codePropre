package ex4.animal;

public enum TypeAnimal {
	MAMMIFERE("mammifère"), POISSON("poisson"), REPTILE("reptile");

	private String type;
	private TypeAnimal(String type){
		this.type = type;
	}
	@Override
	public String toString(){
		
		return type;
	}
}
