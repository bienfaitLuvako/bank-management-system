package com.myBank.Model.Entities;

import java.util.Date;

public class Virement extends Operation{

	private Compte compte;

	public Virement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Virement(Long id, Date dateOperation, double montant, Compte compteRetrait, Agent agent, Compte compteDepot) {
		super(id, dateOperation, montant, compteRetrait, agent);
		compte = compteDepot;
	}

	/**
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	
}
