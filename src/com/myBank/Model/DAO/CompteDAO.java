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
			
				while(rs.next()) {
					
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
	public boolean save(Compte cmpt) {
		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO compte(type_compte, numCompte, dateCreation, client_id) VALUES(?,?,?,?)";
			pr = conn.prepareStatement(requete);
			
			pr.setString(1, cmpt.getClass().getSimpleName());
			pr.setString(2, cmpt.getNumCompte());
			pr.setString(3, cmpt.getDateCreation());
			pr.setLong(4, cmpt.getClient().getId());
			
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
	
//	private boolean accountNumbercodeExists(String accountNumberCode) {
//		try {
//			conn = DBConnexion.getConnection();
//			stm = conn.createStatement();
//			rs = stm.executeQuery("SELECT numCompte FROM compte");
//		
//			while(rs.next()) {	
//				if(rs.getString(1).equals(accountNumberCode)) {
//					
//				}
//			}
//			
//			stm.close();
//			rs.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
	

}
