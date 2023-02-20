package OMKAR_WHATSUP_PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Abc_Table_Drop {

	//public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		public Abc_Table_Drop()throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		String q="DROP TABLE abc_group";
			   
	    PreparedStatement pstmt=conn.prepareStatement(q);
		
		int row=pstmt.executeUpdate();
		System.out.println(row);//0
		
		if(row==0)
		{
			System.out.println("drop table  successfully");
		}

	}

}
