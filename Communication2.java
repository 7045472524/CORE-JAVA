package OMKAR_WHATSUP_PROJECT;
import java.util.Scanner;

public class Communication2 {
	//public static void main(String args[]) throws Exception{
	    public Communication2()throws Exception{
		Scanner sc=new Scanner(System.in);
		int choice;
		int p=0,d=0;
		while(true) {
			System.out.println("Enter Your Choice:\n1:DO YOU WANT CREATE THE NEW GROUP\n2:DELETE GROUP\n3:ADD MEMBER\n4:Exit\n");
			choice=sc.nextInt();
			
			if(choice==1)
			{
				
				System.out.println("Enter Your Choice:\n1:xyz_group\n2:abc_group\n3:chat_group\n4:Exit\n");
				p=sc.nextInt();
				if(p==1) {
					Xyz_Table_Create b=new Xyz_Table_Create();
					System.out.println("you have created xyz_group successfully:");
					
					while(true) {
					System.out.println("Enter Your Choice:\n1:do you want chat here\n2:delete content\n3:Exit\n");
					d=sc.nextInt();
					if(d==1) {
						Xyz_group y=new Xyz_group();
						
						}
					
					if(d==2) {
						Delete_xyz_content a=new Delete_xyz_content();
					}
					
					if(d==3) {
						break;
					}
				
					
				}
			}	
				
				if(p==2) {
					Abc_Table_Create b=new Abc_Table_Create();
					System.out.println("you have created abc_group successfully:");
					
					while(true) {
					System.out.println("Enter Your Choice:\n1:do you want chat here\n2:delete content\n3:Exit\n");
					d=sc.nextInt();
					if(d==1) {
						Abc_group z=new Abc_group();
						
						}
					
					if(d==2) {
						Delete_abc_content a=new Delete_abc_content();
					}
					
					
					if(d==3) {
						break;
					}
					
					
				}
				
				
			}
			
			
			if(p==3) {
				Chat_Table_Create b=new Chat_Table_Create();
				System.out.println("you have created chat_group successfully:");
				
				while(true) {
				System.out.println("Enter Your Choice:\n1:do you want chat here\n2:delete content\n3:Exit\n");
				d=sc.nextInt();
				if(d==1) {
					Chat2 c=new Chat2();
					
					}
				
				if(d==2) {
					Delete_chat_content a=new Delete_chat_content();
				}
				
				
				if(d==3) {
					break;
				}
				
				
			}
		
		}
		
			if(p==4) {
				break;
			}
		}	
			
			
			if(choice==2){
				while(true) {
					System.out.println("Enter Your Choice:\n1:xyz_group\n2:abc_group\n3:chat_group\n4:Exit\n");
					d=sc.nextInt();
					
					if(d==1) {
						Xyz_Table_Drop b=new Xyz_Table_Drop();
						System.out.println("you have deleted xyz_group successfully:");
					}
					
					if(d==2) {
						Abc_Table_Drop b=new Abc_Table_Drop();
						System.out.println("you have deleted abc_group successfully:");
					}
					
					if(d==3) {
						Chat_Table_Drop b=new Chat_Table_Drop();
						System.out.println("you have deleted chat_group successfully:");
					}
					
					if(d==4) {
						break;
					}
					
					
				}
				 
			}
			
			
			
			if(choice==3) {
				while(true) {
					System.out.println("Enter Your Choice:\n1:Group Creation\n2:Group Deletion\n3:Exit\n");
					p=sc.nextInt();
					
					if(p==1) {
						Pqr_Table_Create a=new Pqr_Table_Create();
						
				while(true) {
					System.out.println("Enter Your Choice:\n1:Add Member\n2:Exit\n");
					d=sc.nextInt();
					
					if(d==1) {
						Pqr_group b=new Pqr_group();	
					}
					
					if(d==2) {
						break;
					}
					
				}		
						
			}
					
					if(p==2) {
						Pqr_Table_Drop a=new Pqr_Table_Drop();
					}
					
					if(p==3) {
						break;
					}
					
					
				}
				
			}
			
			
		if(choice==4){
				 break;
			}
			
			
		}
		
		
	 }
	    
}
			
			

		
	    
		
		
		
			
			
		
		
	




