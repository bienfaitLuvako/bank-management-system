package com.myBank.Model.Entities;

import java.util.Date;

public class Versement extends Operation{

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Long id, Date dateOperation, double montant, Compte compte, Agent agent) {
		super(id, dateOperation, montant, compte, agent);
		// TODO Auto-generated constructor stub
	}

}
