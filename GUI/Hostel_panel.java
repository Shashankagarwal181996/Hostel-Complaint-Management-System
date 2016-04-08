import javax.swing.*;
import java.awt.event.*;
public class Hostel_panel extends JPanel implements ActionListener{
	public Hostel_panel(){
		JButton Water_Cooler = new JButton("Water Cooler");
		JButton Hostel_Light = new JButton("Hostel Light");
		JButton Cleaning = new JButton("Cleaning");
		JButton others = new JButton("Others");
		add(Water_Cooler);
		add(Hostel_Light);
		add(Cleaning);
		add(others);
		Water_Cooler.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		
	}
}
