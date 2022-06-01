package com.myBank.Model.Entities;

import java.util.Date;

public class Retrait extends Operation{

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(Long id, Date dateOperation, double montant, Compte compte, Agent agent) {
		super(id, dateOperation, montant, compte, agent);
		// TODO Auto-generated constructor stub
	}

	
}
