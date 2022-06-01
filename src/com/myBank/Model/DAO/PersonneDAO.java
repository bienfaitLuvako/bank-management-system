package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myBank.Model.Entities.Personne;


public class PersonneDAO implements ImyBankDAO<Personne>{

	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;
	
	@Override
	public int count() {
		int nombrePersonnes=0;
		
		try {
			conn = DBConnexion.getConnection();
			stm = conn.createStatement();
			rs = stm.executeQuery("SELECT COUNT(*) FROM personne");
		
			if(rs.next())
			nombrePersonnes = rs.getInt(1);
			
			stm.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nombrePersonnes;
	}

	@Override
	public boolean deleteAll() {
		try {
			conn=DBConnexion.getConnection();
			stm=conn.createStatement();
			stm.execute("DELETE FROM personne");
			
			stm.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Personne p) {
		try {
			conn=DBConnexion.getConnection();
			stm=conn.createStatement();
			stm.execute("DELETE FROM personne WHERE id="+p.getId());
			
			stm.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean exists(Personne p) {
		return false;
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Personne t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveAll(List<Personne> prs) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Personne p) {
		// TODO Auto-generated method stub
		return false;
	}

}
