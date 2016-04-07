import java.util.*;
public class Complaint extends User{
	String user1;
	Complaint(String user){
		 this.user1 = user;
	}
	Scanner sc = new Scanner(System.in);
	int complaint;
	int prob;
	void get_Complaint(){
		System.out.println("Choose a problem among the following");
		System.out.println("1.Hostel");
		System.out.println("2.Room");
		System.out.println("3.Washroom");
		prob = sc.nextInt();
		switch(prob){
			case 1:
				Hostel h = new Hostel(this.user1);
				h.getproblem();
				break;
			case 2:
				room r = new room(user1);
				r.getproblem();
				break;
			case 3:
				Washroom wr = new Washroom(user1);
				wr.getproblem();
				break;
		}
	}
	void Others(){
		String problem;
		System.out.println("Please enter the problem that you are facing in the hostel");
		problem = sc.nextLine();
		System.out.println("problem faced by" +  user1 + " is " + problem );
	}
	
}
