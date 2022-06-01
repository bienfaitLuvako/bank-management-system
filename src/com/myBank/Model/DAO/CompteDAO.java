package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myBank.Model.Entities.Compte;

public class CompteDAO implements ImyBankDAO<Compte>{

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
	public boolean exists(Compte p) {
			try {
				conn = DBConnexion.getConnection();
				stm = conn.createStatement();
				rs = stm.executeQuery("SELECT * FROM compte");
			
				if(rs.next()) {
					
				 if(rs.getString(1).equals(p.getClass().getSimpleName()) && p.getClient().getId()==rs.getLong(9)) {
					return true; 
				 }
				}
				
				stm.close();
				rs.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
	}
	
	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Compte t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveAll(List<Compte> ts) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Compte t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Compte t) {
		// TODO Auto-generated method stub
		return false;
	}

}
