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
	return false;
	}
}