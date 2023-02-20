package OMKAR_WHATSUP_PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Abc_Table_Create {

	//public static void main(String[] args)throws Exception {
		public Abc_Table_Create()throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		String q="CREATE TABLE abc_group (  user varchar(255),  msg varchar(255))";
			   
	    PreparedStatement pstmt=conn.prepareStatement(q);
		
		int row=pstmt.executeUpdate();
		System.out.println(row);//0
		
		if(row==0)
		{
			System.out.println("table creation successfully");
		}
	
		

	}

}
