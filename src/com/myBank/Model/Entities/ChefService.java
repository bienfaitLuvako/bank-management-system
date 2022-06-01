package com.myBank.Model.Entities;

public class ChefService {
	
	private Agent agent;
	private Agence agence;
	private Service service;
	
	public ChefService(Agent agent, Agence agence, Service service) {
		super();
		this.agent = agent;
		this.agence = agence;
		this.service = service;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	
	
	
	
	

}
