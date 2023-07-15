package org.jsp.jdbcFirst;
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Jdbc
{
	public static void main(String[] args) 
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}

}
