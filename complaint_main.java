import java.util.*;

import javax.swing.SwingUtilities;
public class complaint_main {
	public static void main(String args[]){
		/*System.out.println("Hello ");
		User us = new User();
		Boolean flag = us.login1();
		if(flag == true){
			Complaint c = new Complaint(us.username);
			c.get_Complaint();
		}
		else{
			 System.out.println("Check your username and password");
		}*/
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new login_gui();
			}
		});
	}
}
