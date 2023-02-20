package OMKAR_WHATSUP_PROJECT;
import java.sql.*;
import java.io.*;
//import java.util.Scanner;

public class Chat2 {

	//public static void main(String args[]) throws Exception{
	public Chat2()throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//int Id;
		String username="omkar";
	    String message;
	    //String username;
		
		/*System.out.println("Enter id:");
		Id=Integer.parseInt(br.readLine());*/
		
		/*System.out.println("Enter Username:");
		username=br.readLine();*/
        
		System.out.println("Enter message:");
		message=br.readLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
		
		
		String q="insert into chat(user,msg) values('"+username+"','"+message+"')";
		
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		int row=pstmt.executeUpdate();
		
		if(row>0)
		{
			//System.out.println("chat Success");
		}
		else
		{
			System.out.println("Something went wrong......");
		}
		new Showchatrecords();
	}

}


