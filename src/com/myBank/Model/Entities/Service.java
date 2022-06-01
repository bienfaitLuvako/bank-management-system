package com.myBank.Model.Entities;

import java.util.List;

public class Service {
	private Long id;
	private String nom;
	private List<Fonction> fonctions;
	
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		
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
	 * @return the effectifAgents

	/**
	 * @return the fonctions
	 */
	public List<Fonction> getFonctions() {
		return fonctions;
	}
	/**
	 * @param fonctions the fonctions to set
	 */
	public void setFonctions(List<Fonction> fonctions) {
		this.fonctions = fonctions;
	}
	
}
