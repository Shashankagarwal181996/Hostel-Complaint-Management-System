/*
 * created an instance of interface worker and called electrician and carpenter with it
 */

import java.util.*;
public class room extends Complaint implements worker{
	int prob;
	room(String user){
		super(user);
	}
	void getproblem(){
		System.out.println("What is your problem among the following");
		System.out.println("1.Lan_port \n 2.Duct \n 3.Electrician \n 4.carpenter \n 5.Others");
		Scanner sc = new Scanner(System.in);
		prob = sc.nextInt();
		switch(prob){
		case 1:
			IT_Dept guy = new IT_Dept(user1);
			guy.lan();
			break;
		case 2:
			Duct_Mechanic mech = new Duct_Mechanic(user1);
			mech.duct();
			break;
		case 3:
			worker w = new room(user1);
			w.electrician(user1);
			break;
		case 4:
			worker wr = new room(user1);
			wr.carpenter(user1);
			break;
		case 5:
			Complaint c = new Complaint(user1);
			c.Others();
			break;
		}
	}
	
	public void carpenter(String user) {
		// TODO Auto-generated method stub
		System.out.println("Enter your problem out of the following");
		System.out.println("1.table\n 2. chair 3. almirah \n 4. latches \n 5. Door \n 6.Bed \n 7.Curtain \n 8. Others");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch(select){
			case 1:
				System.out.println("Table in room " + user + "is broken");
				break;
			case 2:
				System.out.println("Chair in room " + user + "is broken");
				break;
			case 3:
				System.out.println("almirah in room " + user + "is broken");
				break;
			case 4:
				System.out.println("latches in room " + user + "is broken");
				break;
			case 5:
				System.out.println("door in room " + user + "is broken");
				break;
			case 6:
				System.out.println("Bed in room " + user + "is broken");
				break;
			case 7:
				System.out.println("curtain in room " + user + "is broken");
				break;
			case 8:
				String problem;
				System.out.println("Enter your problem associated with the room");
				problem = sc.next();
				break;
		}
		
	}
	public void electrician(String user) {
		// TODO Auto-generated method stub
		System.out.println("Enter your problem out of the following");
		System.out.println("1.fan\n 2. tubelight 3.studylight \n 4.switch \n 5. Others");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch(select){
		case 1:
			System.out.println("fan in room " + user + "is broken");
			break;
		case 2:
			System.out.println("tubelight in room " + user + "is broken");
			break;
		case 3:
			System.out.println("Studylight in room " + user + "is broken");
			break;
		case 4:
			System.out.println("latches in room " + user + "is broken");
			break;
		case 5:
			System.out.println("door in room " + user + "is broken");
			break;
	}
	
	
	}
}