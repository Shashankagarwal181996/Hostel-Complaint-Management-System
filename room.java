import java.util.*;
public class room extends Complaint {
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
			
		case 4:
			
		case 5:
			Complaint c = new Complaint(user1);
			c.Others();
			break;
		}
	}
	//@Override
	/*public static void carpenter() {
		// TODO Auto-generated method stub
		System.out.println("Enter your problem out of the following");
		System.out.println("1.table\n 2. chair 3. almirah \n 4. latches");
		
	}
	@Override
	public void electrician() {
		// TODO Auto-generated method stub
		
	}*/
	
	
	
}