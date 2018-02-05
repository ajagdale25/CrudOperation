package jdbcPracticals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConncetion {

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Connection con=null;
		//ResultSet rs=null;
		Statement st=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			st = con.createStatement();
			//rs=st.executeQuery("select *from student");
			int i= st.executeUpdate("update student set name='Amit jagdale' where id=2");
			System.out.println(i);
			/*while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));*/
			if(i!=0)
			{
				System.out.println("Update Succesfully");
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		con.close();
		st.close();
		//rs.close();
		
		}
		
	}

}
