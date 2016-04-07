/*
 * created an instance of interface worker and called electrician and carpenter with it
 * 
 */
import java.util.Scanner;
public class Washroom extends Complaint implements worker{
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
			worker w = new Washroom(toilet);
			w.electrician(toilet);
			break;
		case 3:
			worker wr = new Washroom(toilet);
			wr.carpenter(toilet);
			break;
		case 4:
			Caretaker c = new Caretaker(toilet);
			c.Cleaning();
			break;
		case 5:
			Complaint com = new Complaint(toilet);
			com.Others();
			break;
		}
	}
		
		public void carpenter(String user) {
			System.out.println("Enter your problem out of the following");
			System.out.println("1.Door\n 2. Latches 3. Mirror \n 4.Others");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			switch(select){
				case 1:
					System.out.println("Door in washroom" + user + "is broken");
					break;
				case 2:
					System.out.println("latches in washroom" + user + "is broken");
					break;
				case 3:
					System.out.println("mirror in washroom " + user + "is broken");
					break;
				case 4:
					String problem;
					System.out.println("Enter your problem associated with the room");
					problem = sc.next();
					break;
			}
		}
		
		public void electrician(String user) {
			// TODO Auto-generated method stub
			System.out.println("Enter your problem out of the following");
			System.out.println("1.tubelight 2.switch \n3. Others");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			switch(select){
			case 1:
				System.out.println("tubelight in washroom" + user + "is broken");
				break;
			case 2:
				System.out.println("switch in washroom " + user + "is broken");
				break;
			case 3:
				String problem;
				System.out.println("Enter your problem associated with the room");
				problem = sc.next();
				break;
		}
				
		}
/*
		@Override
		public void carpenter() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void electrician() {
			// TODO Auto-generated method stub
			
		}*/
	
}
