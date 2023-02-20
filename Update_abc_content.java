package OMKAR_WHATSUP_PROJECT;
import java.sql.*;
//import java.util.*;
import java.io.*;

public class Update_abc_content {
	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		public Update_abc_content() throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String username,message;
		
		
		
		
		System.out.println("Enter Username:");
		username=br.readLine();
        
		System.out.println("Enter message:");
		message=br.readLine();
		
		
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		String q="UPDATE abc_group SET msg='"+message+"'  WHERE user='"+username+"'";
		
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		int row=pstmt.executeUpdate();
		
		if(row>0)
		{
			System.out.println("Update Success");
		}
		else
		{
			System.out.println("Something went wrong......");
		}
		
	}

}
