package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myBank.Model.Entities.Affectation;

public class AffectationDAO implements ImyBankDAO<Affectation>{
	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;
	PreparedStatement pr = null;

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteAll() {

		return false;
	}

	@Override
	public boolean delete(Affectation t) {

		return false;
	}

	@Override
	public boolean exists(Affectation t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Affectation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Affectation findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Affectation aff) {
		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO affectation(date_affectation, duree, agent_id, fonction_id, agence_id) VALUES(?,?,?,?,?)";
			pr = conn.prepareStatement(requete);
			
			//Il faut update l'attribut fonction_id de la table Personne pour un agent lors de son affectation;
			
			pr.setDate(1, (Date) aff.getDateAffectation());
			pr.setDouble(2, aff.getDuree());
			pr.setLong(3, aff.getAgent().getId());
			pr.setLong(4, aff.getFonction().getId());
			pr.setLong(5, aff.getAgence().getId());
		
			pr.executeUpdate();
		
			pr.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean saveAll(List<Affectation> ts) {

		return false;
	}

	@Override
	public boolean update(Affectation t) {

		return false;
	}

}
