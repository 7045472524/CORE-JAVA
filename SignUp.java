package OMKAR_WHATSUP_PROJECT;
import java.sql.*;
import java.util.Scanner;

public class SignUp {

	//public static void main(String args[]) throws Exception{
	public SignUp()throws Exception{
		Scanner sc=new Scanner(System.in);
		
		String username,phone_no,email;
		
		System.out.println("Enter Username:");
		username=sc.next();

		System.out.println("Enter Phone_no:");
		phone_no=sc.next();
		
		System.out.println("Enter Email:");
		email=sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		String q="insert into whatsapp(USERNAME,PHONE_NO,EMAIL) values('"+username+"','"+phone_no+"','"+email+"')";
		
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		int row=pstmt.executeUpdate();
		
		if(row>0)
		{
			System.out.println("SignUp Success");
		}
		else
		{
			System.out.println("Something went wrong......");
		}

	}

}

