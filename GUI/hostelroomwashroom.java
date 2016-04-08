import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class hostelroomwashroom extends JFrame{
	public hostelroomwashroom(){
		JTabbedPane jtp = new JTabbedPane();
		jtp.setSize(400,400);
		jtp.setVisible(true);
		jtp.addTab("Hostel",new Hostel_panel());
		jtp.addTab("Room",new Room_panel());
		jtp.addTab("Washroom",new Washroom_panel());
		add(jtp);
		setTitle("Hostel Compalaint Management System");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		
	}
	
	public static void main(String args[]){
		new hostelroomwashroom();

	}
}
