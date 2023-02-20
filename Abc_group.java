package OMKAR_WHATSUP_PROJECT;
import java.sql.*;
import java.io.*;
//import java.util.Scanner;

public class Abc_group {

	//public static void main(String args[]) throws Exception{
	public Abc_group()throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String username="omkar";
	    String message;
		
		/*System.out.println("Enter id:");
		Id=Integer.parseInt(br.readLine());*/
		
		/*System.out.println("Enter Username:");
		username=br.readLine();*/
        
		System.out.println("Enter message:");
		message=br.readLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		
		String q="insert into abc_group(user,msg) values('"+username+"','"+message+"')";
		
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		int row=pstmt.executeUpdate();
		
		if(row>0)
		{
			//System.out.println("Group Created Successfully");
		}
		else
		{
			System.out.println("Something went wrong......");
		}
		//System.out.println(Id+":"+username+":"+message);
		new Show_abc_records();
	}

}


