package com.clientes.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class UtilSql {
	public Connection getConnection(){
		Connection con = null;
		
		try{

			Class.forName("com.mysql.jdbc.Driver");
			
con = DriverManager.getConnection("jdbc:mysql://localhost"
		+ ":3306/sventas", "root", "12345678");

		} catch (Throwable e){
			e.printStackTrace();
		}
		
		return con;
	}

}	
