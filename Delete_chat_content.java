package OMKAR_WHATSUP_PROJECT;
import java.sql.*;
import java.util.*;

public class Delete_chat_content {
	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		public Delete_chat_content()throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		String q="DELETE FROM chat";
		
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		int row=pstmt.executeUpdate();
		
		if(row>0)
		{
			System.out.println("Delete Success");
		}
		else
		{
			System.out.println("Something went wrong......");
		}
		
	}
	
	

}
