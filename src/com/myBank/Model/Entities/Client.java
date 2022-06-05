package com.myBank.Model.Entities;

import java.util.List;

public class Client extends Personne{
	private Compte savingAccount;
	private Compte CurrentAccount;
	
	private List<Operation> operations;

	public Client(Long id, String firstname, String lastname, String idNat, String birthday, String genre, String photo,
			String phone) {
		super(id, firstname, lastname, idNat, birthday, genre, photo, phone);
	}
	
	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}



	public Compte getSavingAccount() {
		return savingAccount;
	}



	public void setSavingAccount(Compte savingAccount) {
		this.savingAccount = savingAccount;
	}



	public Compte getCurrentAccount() {
		return CurrentAccount;
	}



	public void setCurrentAccount(Compte currentAccount) {
		CurrentAccount = currentAccount;
	}
	
}

