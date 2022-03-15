package com.demojava.JDBC;


import java.sql.*;


public class fetch 
{
    private static boolean b;

	public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
      
    		Class.forName("com.mysql.cj.jdbc.Driver");
      
    		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","rootpassword");
        	Statement st=c1.createStatement();
        	
        	ResultSet rs= st.executeQuery("select name from info");
//        	
        	rs.next();
        	String name=rs.getString(1);
        	System.out.println(name);
        	
        	
        	
        
        	
        	st.close();
        	
    		
    }
}
