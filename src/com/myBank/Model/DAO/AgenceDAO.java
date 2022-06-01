package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myBank.Model.Entities.Agence;

public class AgenceDAO implements ImyBankDAO<Agence>{

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
	public boolean exists(Agence t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Agence> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agence findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Agence ag) {

		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO agence(altitude,latitude,longitude,nom) VALUES(?,?,?,?)";
			pr = conn.prepareStatement(requete);
			
			pr.setDouble(1, ag.getAltitude());
			pr.setDouble(2, ag.getLatitude());
			pr.setDouble(3, ag.getLongitude());
			pr.setString(4, ag.getNom());
			
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
	public boolean saveAll(List<Agence> ts) {

		return false;
	}

	@Override
	public boolean update(Agence t) {

		return false;
	}

	@Override
	public boolean delete(Agence t) {

		return false;
	}

}
