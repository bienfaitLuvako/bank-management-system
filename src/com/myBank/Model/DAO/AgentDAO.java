package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.myBank.Model.Entities.Agent;

public class AgentDAO extends PersonneDAO{

	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;
	PreparedStatement pr = null;
	
	public boolean exists(Agent p) {
		try {
			conn = DBConnexion.getConnection();
			stm = conn.createStatement();
			rs = stm.executeQuery("SELECT * FROM personne");
		
			if(rs.next()) {
				
			 if(rs.getString(1).equals(p.getClass().getSimpleName()) && p.getId()==rs.getInt(2) && p.getAge()==rs.getDouble(3) && p.getFirstname().equals(rs.getString(4)) && p.getGenre().equals(rs.getString(5)) &&  p.getIdNat().equals(rs.getString(6)) && p.getLastname().equals(rs.getString(7)) && p.getPhone().equals(rs.getString(8)) && p.getNumMat().equals(rs.getString(10)) && p.getUsername().equals(rs.getString(11)) && p.getPassword().equals(rs.getString(12))) {
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
	
	public boolean authenticated(String username, String password) {
		try {
			conn = DBConnexion.getConnection();
			stm = conn.createStatement();
			
			rs = stm.executeQuery("SELECT * FROM personne");
		
			if(rs.next()) {
				
			 if(username.equals(rs.getString(11)) && password.equals(rs.getString(12))) {
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
	
	
	
	public boolean save(Agent ag) {
		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO personne(type_personne, age, firstname, genre, id_nat, lastname, phone, photo, num_mat, username, password) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			pr = conn.prepareStatement(requete);
			
			pr.setString(1, ag.getClass().getSimpleName());
			pr.setDouble(2, ag.getAge());
			pr.setString(3, ag.getFirstname());
			pr.setString(4, ag.getGenre());
			pr.setString(5, ag.getIdNat());
			pr.setString(6, ag.getLastname());
			pr.setString(7, ag.getPhone());
			pr.setString(8, ag.getPhoto());
			pr.setString(9, ag.getNumMat());
			pr.setString(10, ag.getUsername());
			pr.setString(11, ag.getPassword());
			
			pr.executeUpdate();
		
			pr.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
}