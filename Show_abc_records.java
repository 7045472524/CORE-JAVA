package OMKAR_WHATSUP_PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Show_abc_records {
     //public static void main(String args[])throws Exception  {

		public Show_abc_records()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		String q="select * from abc_group";
		
		PreparedStatement ps=conn.prepareStatement(q);
		
		ResultSet rs = ps.executeQuery();
		
	while(rs.next()) {
			
		    
		    System.out.println(rs.getString("user"));
			System.out.println("message: " + rs.getString("msg"));
			
		}
	
	
	}

}
