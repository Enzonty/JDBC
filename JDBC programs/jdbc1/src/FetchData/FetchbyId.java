package FetchData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchbyId 
{public static void main(String[] args)
{
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String qry="select * from student.details where id =?";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=****");
		pstmt=con.prepareStatement(qry);
		pstmt.setInt(1, 2);
		rs=pstmt.executeQuery();
		if (rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString("name");
			String gender=rs.getString("gender");
			System.out.println("id="+id);
			System.out.println("name="+name);
			System.out.println("gender="+gender);
		}
	} 
	catch (ClassNotFoundException | SQLException e) 
	{
		e.printStackTrace();
	}
	finally
	{
		if (pstmt!=null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

}
