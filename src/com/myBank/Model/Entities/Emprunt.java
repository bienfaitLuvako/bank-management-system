package com.myBank.Model.Entities;

import java.util.Date;

public class Emprunt extends Operation{

	public Emprunt() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emprunt(Long id, Date dateOperation, double montant, Compte compte, Agent agent) {
		super(id, dateOperation,  montant,  compte,  agent);
	}

}
