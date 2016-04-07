import java.util.Scanner;
public class Washroom extends Complaint{
	Washroom(String user) {
		super(user);
		// TODO Auto-generated constructor stub
	}
	int prob;
	String toilet;
	void getproblem(){
		System.out.println("Enter the toilet number");
		toilet = sc.nextLine();
		System.out.println("What is your problem among the following");
		System.out.println("1.Plumber \n 2.Electrician \n 3.Carpenter \n 4.Cleaning \n 5.Others");
		Scanner sc = new Scanner(System.in);
		prob = sc.nextInt();
		switch(prob){
		case 1:
			int prob;
			Plumber p = new Plumber(user1,toilet);
			System.out.println("Enter the problem from the Following");
			System.out.println("1. leakage");
			System.out.println("2. malfunctioning");
			System.out.println("3. flush");	
			System.out.println("4. taps");
			prob = sc.nextInt();
			switch(prob){
			  case 1:
				  p.leakage();
				  break;
			  case 2:
				  p.malfunctioning();
				  break;
			  case 3:
				  p.flush();
				  break;
			  case 4:
				  p.taps();
				  break;
			}
			 break;
		case 2:
			
		case 3:
	
		case 4:
			Caretaker c = new Caretaker(user1);
			c.Cleaning();
			break;
		case 5:
			Complaint com = new Complaint(user1);
			com.Others();
			break;
		}
	}
}
