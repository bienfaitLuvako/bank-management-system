package com.myBank.Model.Entities;

import java.util.Date;

public class CompteEpargne extends Compte{
	
	private double taux;

	public CompteEpargne(Long id, String numCompte, Date dateCreation, double solde, double interetDu, Client client,
			double taux) {
		super(id, numCompte, dateCreation, solde, interetDu, client);
		this.taux = taux;
	}

	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	

}
