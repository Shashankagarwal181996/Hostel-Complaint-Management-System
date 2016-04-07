import java.util.Scanner;
public class Hostel extends User {
	int prob;
	String user2;
	Hostel(String user){
		this.user2 = user;
	}
	String usern = username;
	void getproblem(){
		System.out.println("What is your problem among the following");
		System.out.println("1.Water Cooler \n 2.Hostel Lights \n 3.Cleaning \n 4. others");
		Scanner sc = new Scanner(System.in);
		prob = sc.nextInt();
		Caretaker c = new Caretaker(this.user2);
		switch(prob){
		case 1:
			c.Water_Cooler();
			break;
		case 2:
			c.Hostel_Lights(user2);
			break;
		case 3:
			c.Cleaning();
			break;
		case 4:
			c.Others();
			break;
		}
	}
}
