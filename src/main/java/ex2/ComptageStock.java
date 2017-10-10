package ex2;

import java.time.LocalDate;


public class ComptageStock {

	/** nb : int */
	private int nb;
	/** resultat : int */
	private int resultat;
	/** dateDebutComptage : Date */
	private LocalDate dateDebutComptage;
	/** dateFinComptage : Date */
	private LocalDate dateFinComptage;

	public ComptageStock (LocalDate dateDebutComptage){
		this.dateDebutComptage = dateDebutComptage;
	}
	
	
	/**
	 * @param montant
	 *            paramètre montant
	 */
	public void ajouterElement(int montant) {
		nb++;
		resultat += montant;
	}

	/**
	 * 
	 */
	public void afficheStatutComptage(TypeComptage typeComptage) {
		if (nb == 0) {
			throw new RuntimeException("Le comptage contient aucun élément");
		}
		afficherResultat(typeComptage);
		afficherDateDebut();
		afficherDateFin();

	}

	/**
	 * @param typeComptage
	 */
	private void afficherResultat(TypeComptage typeComptage) {

		if (typeComptage != null && typeComptage.equals(TypeComptage.SOMME)) {
			afficherType("SOMME", resultat);
		} else if (typeComptage != null && typeComptage.equals(TypeComptage.MOYENNE)) {
			afficherType("MOYENNE", resultat / nb);
		}
	}

	/**
	 * @param type
	 * @param resultat
	 */
	private void afficherType(String type, double resultat) {
		System.out.println("Ce comptage est de type " + type);
		System.out.println("Nombre d'élements " + nb);
		System.out.println("Résultat " + resultat);
	}

	/**
	 * 
	 */
	private void afficherDateDebut() {
		if (dateDebutComptage != null) {
			System.out.println("Date de création du compte : "+DateUtils.format(dateDebutComptage));
		}
	}

	/**
	 * 
	 */
	private void afficherDateFin() {
		if (dateFinComptage != null) {
			System.out.println("Le comptage est clos depuis le " + DateUtils.format(dateFinComptage));
			if (nb == 0) {
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			} else {
				System.out.println("Le comptage est clos et est OK.");
			}
		} else {
			System.out.println("Le compte est actif.");
		}
	}

	/**
	 * Getter for nb
	 * 
	 * @return nb
	 */
	public int getNb() {
		return nb;
	}

	/**
	 * @param nb
	 *            the nb to set
	 */
	public void setNb(int nb) {
		this.nb = nb;
	}

	/**
	 * Getter for resultat
	 * 
	 * @return resultat
	 */
	public int getResultat() {
		return resultat;
	}

	/**
	 * @param resultat
	 *            the resultat to set
	 */
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}

	/**
	 * Getter for dateDebutComptage
	 * 
	 * @return dateDebutComptage
	 */
	public LocalDate getDateDebutComptage() {
		return dateDebutComptage;
	}

	/**
	 * @param dateDebutComptage
	 *            the dateDebutComptage to set
	 */
	public void setDateDebutComptage(LocalDate dateDebutComptage) {
		this.dateDebutComptage = dateDebutComptage;
	}

	/**
	 * @param dateFinComptage
	 *            the dateFinComptage to set
	 */
	public void setDateFinComptage(LocalDate dateFinComptage) {
		this.dateFinComptage = dateFinComptage;
	}
}