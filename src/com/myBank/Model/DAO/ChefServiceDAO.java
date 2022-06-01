package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myBank.Model.Entities.ChefService;

public class ChefServiceDAO implements ImyBankDAO<ChefService>{

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
	public boolean delete(ChefService t) {

		return false;
	}

	@Override
	public boolean exists(ChefService t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ChefService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChefService findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(ChefService chef) {

		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO chefService(agent_id,agence_id,service_id) VALUES(?,?,?)";
			pr = conn.prepareStatement(requete);
			
			pr.setLong(1, chef.getAgent().getId());
			pr.setLong(2, chef.getAgence().getId());
			pr.setLong(3, chef.getService().getId());
			
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
	public boolean saveAll(List<ChefService> ts) {

		return false;
	}

	@Override
	public boolean update(ChefService t) {

		return false;
	}

}
