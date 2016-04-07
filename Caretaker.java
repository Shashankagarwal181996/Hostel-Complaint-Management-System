import java.util.*;
public class Caretaker extends Complaint {
	String user3;
	Caretaker(String user7) {
		super(user7);
		// TODO Auto-generated constructor stub
	}
	Scanner sc = new Scanner(System.in);
	
	
	void Water_Cooler(){
		System.out.println("Enter the toilet Number");
		String toilet = sc.next();
		System.out.println(" Water Cooler near washroom number " + toilet + " is not working correctly");
		// now we got the toilet number where water cooler is and then we update toilet number 
		// problem name : water cooler ,username,name in caretaker table
	}
	void Hostel_Lights(String user){
		// update in table with wing name
		System.out.println("Lights in the wing  " + user1 + "are not working correctly");
	}
	void Cleaning(){
		System.out.println("The wing  "  + "is not being clean");
	}
	
}
