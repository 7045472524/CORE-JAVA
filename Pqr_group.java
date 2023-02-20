package OMKAR_WHATSUP_PROJECT;
import java.sql.*;
import java.io.*;

public class Pqr_group {
	
	//public static void main(String args[]) throws Exception{
		public Pqr_group()throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			int id;
			String username,phone_no;
			
			System.out.println("Enter id:");
			id=Integer.parseInt(br.readLine());
			
			System.out.println("Enter username:");
			username=br.readLine();
	        
			System.out.println("Enter phone_no:");
			phone_no=br.readLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/omkar","root","");
			
			
			String q="insert into pqr_group(id,username,phone_no) values('"+id+"','"+username+"','"+phone_no+"')";
			
			PreparedStatement pstmt=conn.prepareStatement(q);
			
			int row=pstmt.executeUpdate();
			
			if(row>0)
			{
				System.out.println("Added Successfully");
			}
			else
			{
				System.out.println("Something went wrong......");
			}
			new Show_pqr_records();
			
		}
}
