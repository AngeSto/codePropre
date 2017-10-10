package ex1;

import java.util.Date;

public class Entreprise {

	/** siret : int */
	private int siret;
	/** nom : String */
	private String nom;
	/** adresse : String */
	private String adresse;
	/** dateCreation : Date */
	private Date dateCreation;
	
	/** CAPITAL_MAX : représente le capital max */
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * Affiche le statut du compte composé du siret, du nom, de l'adresse et de la date de création
	 */
	public void afficherStatut(){
		System.out.println("Siret :"+siret+"\nNom : "+nom+"\nAdresse :"+adresse+"\nDate de création :"+dateCreation);
		
	}

	/**
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
