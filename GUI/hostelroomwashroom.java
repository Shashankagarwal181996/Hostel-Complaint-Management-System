import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hostelroomwashroom extends JFrame{
	
	public hostelroomwashroom(){
		
		JTabbedPane jtp = new JTabbedPane();
		//jtp.setPreferredSize(new Dimension(709,150));
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//setLayout(new BorderLayout());
		setSize(800,500);
	//	setResizable(false);
		setTitle("Hostel Compalaint Management System");
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		jtp.setSize(400,400);
		jtp.addTab("Hostel",new Hostel_panel());
		jtp.addTab("Room",new Room_panel());
		jtp.addTab("Washroom",new Washroom_panel());
		
		add(jtp);
		//add(new JLabel("sasasa"));
		//add(new JLabel("ssasa"));
		
		setVisible(true);				
	}
	
	public static void main(String args[]){
		
		new hostelroomwashroom();
	}
}	