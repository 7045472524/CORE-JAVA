package OMKAR_WHATSUP_PROJECT;
import java.util.Scanner;


public class WHATSUP_PROJECT_WORKING {
	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		int choice;
		int p=0,d=0;
		while(true) {
			System.out.println("Enter Your Choice:\n1:SIGN UP\n2:LOGIN \n3:EXIT\n");
			choice=sc.nextInt();
			
			if(choice==1) {
				SignUp b=new SignUp();
			}
			
			if(choice==2) {
			 Login l=new Login();
			}
			
			
			if(choice==3) {
				
				break;
			}
			
		}
		
   }

}
