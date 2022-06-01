package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myBank.Model.Entities.Fonction;

public class FonctionDAO implements ImyBankDAO<Fonction>{

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Fonction t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exists(Fonction t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fonction> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fonction findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Fonction fonc) {

		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO fonction(nom_fonction,service_id) VALUES(?,?)";
			pr = conn.prepareStatement(requete);
			
			pr.setString(1, fonc.getNomFonction());
			pr.setLong(2, fonc.getService().getId());
			
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
	public boolean saveAll(List<Fonction> ts) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Fonction t) {
		// TODO Auto-generated method stub
		return false;
	}

}
