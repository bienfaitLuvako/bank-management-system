package com.myBank.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import rawbank.utils.Configuration;

public class DBConnexion {
	
static Connection conn = null;
    
    private static  Properties prop = new Configuration().get();
    private static String 
    host= prop.getProperty("host"),
    port=prop.getProperty("port"),
    dbname=prop.getProperty("db"),
    user=prop.getProperty("user"),
    password=prop.getProperty("password");
    
    static {
        try {
            // db parameters
            String db = "jdbc:mysql://"+host+":"+port+"/"+dbname;
            // create a connection to the database
            conn = DriverManager.getConnection(db,user,password);
            System.out.println("Successfuly connected to the database!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
	}
    
    public static Connection getConnection() throws SQLException{
        return conn;
    }	

}
