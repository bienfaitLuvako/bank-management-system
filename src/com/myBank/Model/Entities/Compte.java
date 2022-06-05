package com.myBank.Model.Entities;

import java.util.List;

public class Compte {
	private Long id;
	private String numCompte;
	private String dateCreation;
	private double solde;
	private double interetDu;
	private Client client;
	
	private List<Operation> operations;
	
	public Compte(Long id, String numCompte, String dateCreation, double solde, double interetDu, Client client){
		super();
		this.id = id;
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.interetDu = interetDu;
		this.client = client;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the numCompte
	 */
	public String getNumCompte() {
		return numCompte;
	}
	/**
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	/**
	 * @return the dateCreation
	 */
	public String getDateCreation() {
		return dateCreation;
	}
	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return the interetDu
	 */
	public double getInteretDu() {
		return interetDu;
	}
	/**
	 * @param interetDu the interetDu to set
	 */
	public void setInteretDu(double interetDu) {
		this.interetDu = interetDu;
	}
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * @return the operations
	 */
	public List<Operation> getOperations() {
		return operations;
	}
	/**
	 * @param operations the operations to set
	 */
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	
	
}


