package OMKAR_WHATSUP_PROJECT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;



public class Login {
	
	//public static void main(String args[]) throws Exception{
	
	public Login() throws Exception{
		String username,phone_no,email;
		Scanner sc=new Scanner(System.in);

		
		
		System.out.println("Enter Username:");
		username=sc.next();
		
		System.out.println("Enter Phone_no:");
		phone_no=sc.next();
		
		System.out.println("Enter email:");
		email=sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		String q="select * from whatsapp where (USERNAME='"+username+"'OR EMAIL='"+email+"') AND PHONE_NO='"+phone_no+"'";
		
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next())
		{
			System.out.println("Login Success:"+username);
			//Showchatrecords s=new Showchatrecords();
			Communication2 d=new Communication2();
			
			//Show_xyz_records r=new Show_xyz_records();
			//Show_abc_records t=new Show_abc_records();
			
		}
		else
		{
			System.out.println("Invalid USername or Password");
			
		}
	}
	
	

		
	}


