package com.deep.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Launcher {

	public static void main(String args[]){
		
		Connection con=null;
		 ResultSet rs=null;
		 String name="Deep";
		try {
			 con=DriverManager.getConnection("jdbc:derby://localhost:1527/deepdb");
		    String query= "select * from student where name=" + "'" +name + "'" ;
		    
		    
		    String query1= "select * from student where name=?";
		    String query2= "select * from student where name=? and age = ?";
		    Statement stmt= con.createStatement();
		    
		  //prepare statement
		    PreparedStatement ps= con.prepareStatement(query2);
		    ps.setString(1,"Deep");
		    ps.setInt(2,10);
		   // rs= stmt.executeQuery(query1);
		    rs= ps.executeQuery();
		    
		   while(rs.next()){
		    System.out.println(rs.getString(1) + "--" + rs.getInt(2));
		   }
		    
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
