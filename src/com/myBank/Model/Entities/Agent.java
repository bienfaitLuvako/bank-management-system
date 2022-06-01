package com.myBank.Model.Entities;
import java.util.List;

public class Agent extends Personne{
	private String numMat;
	private String username;
	private String password;
	private Fonction fonctionEnCours;
	
	
	public Fonction getFonctionEnCours() {
		return fonctionEnCours;
	}



	public void setFonctionEnCours(Fonction fonctionEnCours) {
		this.fonctionEnCours = fonctionEnCours;
	}

	private List<Fonction> fonctions;
	private List<Affectation> mutations;
	private List<Operation> operations;
	
	
	
	

	public Agent(Long id, String firstname, String lastname, String idNat, double age, String genre, String photo,
			String phone, String numMat, String username, String password, Fonction fonctionEnCours) {
		super(id, firstname, lastname, idNat, age, genre, photo, phone);
		this.numMat = numMat;
		this.username = username;
		this.password = password;
		this.fonctionEnCours = fonctionEnCours;
	}

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the numMat
	 */
	public String getNumMat() {
		return numMat;
	}

	/**
	 * @param numMat the numMat to set
	 */
	public void setNumMat(String numMat) {
		this.numMat = numMat;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

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

	/**
	 * @return the mutations
	 */
	public List<Affectation> getMutations() {
		return mutations;
	}

	/**
	 * @param mutations the mutations to set
	 */
	public void setMutations(List<Affectation> mutations) {
		this.mutations = mutations;
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
