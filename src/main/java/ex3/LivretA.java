package ex3;

public class LivretA extends CompteBancaire {
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle() {

		this.solde = solde + solde * tauxRemuneration / 100;

	}

	public void setDecouvert(double decouvert) {
		throw new RuntimeException("Impossible de changer le découvert d'un LivretA");
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
