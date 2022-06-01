package com.myBank.Model.Entities;


public class Fonction {

	private Long id;
	private String nomFonction;
	private Service service;
	//prime ou salaire lie a la fonction( un attribut a ajouter)
	
	public Fonction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Fonction(Long id, String nomFonction, Service service) {
		super();
		this.id = id;
		this.nomFonction = nomFonction;
		this.service = service;
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
	 * @return the nomFonction
	 */
	public String getNomFonction() {
		return nomFonction;
	}

	/**
	 * @param nomFonction the nomFonction to set
	 */
	public void setNomFonction(String nomFonction) {
		this.nomFonction = nomFonction;
	}


	public Service getService() {
		return service;
	}


	public void setService(Service service) {
		this.service = service;
	}
	
	
	
}