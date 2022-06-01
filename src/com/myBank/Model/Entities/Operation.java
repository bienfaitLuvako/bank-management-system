package com.myBank.Model.Entities;

import java.util.Date;

public class Operation {
	private Long id;
	private Date dateOperation;
	private double montant;
	private Compte compte;	
	private Agent agent;
	
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operation(Long id, Date dateOperation, double montant, Compte compte, Agent agent) {
		super();
		this.id = id;
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.compte = compte;
		this.agent = agent;
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
	 * @return the dateOperation
	 */
	public Date getDateOperation() {
		return dateOperation;
	}
	/**
	 * @param dateOperation the dateOperation to set
	 */
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}
	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
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
	/**
	 * @return the agent
	 */
	public Agent getAgent() {
		return agent;
	}
	/**
	 * @param agent the agent to set
	 */
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	
	
}
