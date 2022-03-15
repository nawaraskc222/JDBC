package com.demojava.JDBC;

import java.sql.*;


public class App 
{
    private static boolean b;

	public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
//       
    		Class.forName("com.mysql.cj.jdbc.Driver");
//        	Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=rootpassword");
    		
    		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","rootpassword");
        	Statement stmt=c1.createStatement();
        	
        	b = stmt.execute("create table info1 (id int,name varchar(22) )");
        	c1.close();
        	
        	
    	
    		
    }
}
