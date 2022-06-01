package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.myBank.Model.Entities.Client;

public class ClientDAO extends PersonneDAO {
	
	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;
	PreparedStatement pr = null;

	public boolean save(Client cl) {
		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO personne(type_personne, age, firstname, genre, id_nat, lastname, phone, photo) VALUES(?,?,?,?,?,?,?,?)";
			pr = conn.prepareStatement(requete);
			
			pr.setString(1, cl.getClass().getSimpleName());
			pr.setDouble(2, cl.getAge());
			pr.setString(3, cl.getFirstname());
			pr.setString(4, cl.getGenre());
			pr.setString(5, cl.getIdNat());
			pr.setString(6, cl.getLastname());
			pr.setString(7, cl.getPhone());
			pr.setString(8, cl.getPhoto());
			
			pr.executeUpdate();
		
			pr.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public boolean exists(Client p) {
		try {
			conn = DBConnexion.getConnection();
			stm = conn.createStatement();
			rs = stm.executeQuery("SELECT * FROM personne");
		
			if(rs.next()) {
				
			 if(rs.getString(1).equals(p.getClass().getSimpleName()) && p.getAge()==rs.getDouble(3) && p.getFirstname().equals(rs.getString(4)) && p.getGenre().equals(rs.getString(5)) &&  p.getIdNat().equals(rs.getString(6)) && p.getLastname().equals(rs.getString(7)) && p.getPhone().equals(rs.getString(8))) {
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
	
	
	
}


		
	


