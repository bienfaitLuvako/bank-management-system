package com.myBank.Model.Entities;

public class CompteCourant extends Compte{

	private double decouvert;

	public CompteCourant(Long id, String numCompte, String dateCreation, double solde, double interetDu, Client client,
			double decouvert) {
		super(id, numCompte, dateCreation, solde, interetDu, client);
		this.decouvert = decouvert;
	}

	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
	
	

	
	
	
	
	
}
