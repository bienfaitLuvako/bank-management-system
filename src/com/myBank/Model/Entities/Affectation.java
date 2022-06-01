package com.myBank.Model.Entities;

import java.util.Date;

public class Affectation {	
	private Long id;
	private Date dateAffectation;
	private double duree;    // La duree est mensuelle ou CDI()
	private Agent agent;
	private Fonction fonction;
	private Service service;
	private Agence agence;
	
	public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Affectation(Long id, Date dateMutation, Fonction fonction, Agence agence, Agent agent) {
		super();
		this.id = id;
		this.dateAffectation = dateMutation;
		this.fonction = fonction;
		this.agence = agence;
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
	 * @return the dateMutation
	 */
	public Date getDateMutation() {
		return dateAffectation;
	}

	/**
	 * @param dateMutation the dateMutation to set
	 */
	public void setDateMutation(Date dateMutation) {
		this.dateAffectation = dateMutation;
	}

	/**
	 * @return the fonction
	 */
	public Fonction getFonction() {
		return fonction;
	}

	/**
	 * @param fonction the fonction to set
	 */
	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	/**
	 * @return the agence
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * @param agence the agence to set
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
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

	public Date getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	

}
