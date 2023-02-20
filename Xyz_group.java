package OMKAR_WHATSUP_PROJECT;
import java.sql.*;
import java.io.*;
//import java.util.Scanner;

public class Xyz_group {

	//public static void main(String args[]) throws Exception{
	public Xyz_group()throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String username="omkar";
	    String message;
	    //int id=0;
		
		
		/*int Id;
		String username,message;
		
		System.out.println("Enter id:");
		Id=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Username:");
		username=br.readLine();*/
        
		System.out.println("Enter message:");
		message=br.readLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		
		String q="insert into xyz_group(user,msg) values('"+username+"','"+message+"')";
		
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		int row=pstmt.executeUpdate();
		//System.out.println(row);
		
		if(row>0)
		{
			//System.out.println("Group Created Successfully");
		}
		else
		{
			System.out.println("Something went wrong......");
		}
		//System.out.println(username);
		
		new Show_xyz_records();
	}

}


