package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myBank.Model.Entities.Service;

public class ServiceDAO implements ImyBankDAO<Service> {

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
	public boolean exists(Service t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Service> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Service findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Service ser) {

		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO service(type_service, nom) VALUES(?,?)";
			pr = conn.prepareStatement(requete);
			
			pr.setString(1, ser.getClass().getSimpleName());
			pr.setString(2, ser.getNom());
			
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
	public boolean saveAll(List<Service> ts) {

		return false;
	}

	@Override
	public boolean update(Service t) {

		return false;
	}

	@Override
	public boolean delete(Service t) {

		return false;
	}

}
