package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.myBank.Model.Entities.Compte;

public class CompteCourantDAO extends CompteDAO{

	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;
	PreparedStatement pr = null;
	
	public boolean save(Compte cmpt) {
		try {
			conn = DBConnexion.getConnection();
			String requete  = "INSERT INTO compte(type_compte, numCompte, dateCreation, client_id) VALUES(?,?,?,?)";
			pr = conn.prepareStatement(requete);
			
			pr.setString(1, cmpt.getClass().getSimpleName());
			pr.setString(2, cmpt.getNumCompte());
			pr.setDate(3, (Date) cmpt.getDateCreation());
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
}