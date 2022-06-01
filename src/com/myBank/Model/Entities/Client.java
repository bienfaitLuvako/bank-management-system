package com.myBank.Model.Entities;

import java.util.List;

public class Client extends Personne{
	private List<Compte> comptes;
	
	private List<Operation> operations;

	public Client(Long id, String firstname, String lastname, String idNat, double age, String genre, String photo,
			String phone) {
		super(id, firstname, lastname, idNat, age, genre, photo, phone);
	}
	
	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	
	

	
}

