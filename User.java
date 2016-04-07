import java.util.*;
public class User {
	 String username;
	 String password;
	 String roll_no;
	 String name;
	 String phone_no;
	 Boolean temp = false;
	 String login[][] = new String[4][2];
	 User(){
		 login[0][0] = "shashanka";
		 login[0][1] = "shashanka";
		 login[1][0] = "shashankg";
		 login[1][1] = "shashankg";
		 login[2][0] = "saana";
		 login[2][1] = "saana";
		 login[3][0] = "v";
		 login[3][1] = "v";
		 username = this.username;
	 }
	 Boolean login1(){

		 System.out.println("Enter your username , password , name , roll number and your phone number");
		 Scanner sc = new Scanner(System.in);
		 username = sc.nextLine();
		 password = sc.nextLine();
		 name = sc.nextLine();
		 roll_no = sc.nextLine();
		 phone_no = sc.nextLine();
		 for(int i=0;i<4;i++){
				 if(username.equals(login[i][0])){
					 if(password.equals(login[i][1])){
						 System.out.println("User Authenticated ");
						  temp = true;
						  break;
					 }
				 }
				 else{
					
					 temp = false;
				 }
		 }
		 return temp;
	}
}
