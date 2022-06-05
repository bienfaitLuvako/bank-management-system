package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myBank.Model.Entities.Client;
import com.myBank.Model.Entities.Personne;

public class ClientDAO extends PersonneDAO {
	
	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;
	PreparedStatement pr = null;

	public boolean save(Client cl) {
		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO personne(type_personne, firstname, lastname , idNat, birthday, genre, phone) VALUES(?,?,?,?,?,?,?)";
			pr = conn.prepareStatement(requete);
			
			pr.setString(1, cl.getClass().getSimpleName());
			pr.setString(2, cl.getFirstname());
			pr.setString(3, cl.getLastname());
			pr.setString(4, cl.getIdNat());
			pr.setString(5, cl.getBirthday());
			pr.setString(6, cl.getGenre());
			pr.setString(7, cl.getPhone());
			
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
				
			 if(rs.getString(1).equals(p.getClass().getSimpleName()) && p.getFirstname().equals(rs.getString(3)) && p.getLastname().equals(rs.getString(4)) &&  p.getIdNat().equals(rs.getString(5)) && p.getBirthday()==rs.getString(6) && p.getGenre().equals(rs.getString(7)) && p.getPhone().equals(rs.getString(9))) {
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
	
	public List<Personne> findAll(){
		ArrayList<Personne> clients = new ArrayList<>();
		
		try {
			conn = DBConnexion.getConnection();
			stm = conn.createStatement();
			rs = stm.executeQuery("SELECT * FROM personne WHERE type_personne='Client'");
		
			while(rs.next()){
				
			clients.add(new Client(rs.getLong(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)));
			
			}
			
			stm.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clients;
	}
	
	
	
}


		
	


