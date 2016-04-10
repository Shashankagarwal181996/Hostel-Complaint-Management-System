import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;
public class Hostel_panel extends JPanel implements ActionListener{
	public Hostel_panel(){
		JButton Water_Cooler = new JButton("Water Cooler");
		JButton Hostel_Light = new JButton("Hostel Light");
		JButton Cleaning_hostel = new JButton("Cleaning");
		JButton others_hostel = new JButton("Others");
		add(Water_Cooler);
		add(Hostel_Light);
		add(Cleaning_hostel);
		add(others_hostel);
		Water_Cooler.addActionListener(this);
		Water_Cooler.setActionCommand("water cooler");
		
		Hostel_Light.addActionListener(this);
		Hostel_Light.setActionCommand("hostel light");
		
		Cleaning_hostel.addActionListener(this);
		Cleaning_hostel.setActionCommand("cleaning");
		
		others_hostel.addActionListener(this);
		others_hostel.setActionCommand("Others");
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("water cooler")){
			JPanel Water_Cooler_panel = new JPanel();
			Water_Cooler_panel.setLayout(new GridLayout(1,1));
			JCheckBox Water_Cooler = new JCheckBox("Water Cooler");
			Water_Cooler_panel.add(Water_Cooler);
			add("South",Water_Cooler_panel);
		}
		else if(ae.getActionCommand().equals("hostel light")){
			JPanel Hostel_Light_panel = new JPanel();
			Hostel_Light_panel.setLayout(new GridLayout(2,1));
			JCheckBox light = new JCheckBox("Hostel lights");
			JCheckBox wing_light = new JCheckBox("Wing lights");
			Hostel_Light_panel.add(light);
			Hostel_Light_panel.add(wing_light);
			add("South",Hostel_Light_panel);
		}
		else if(ae.getActionCommand().equals("cleaning")){
			JPanel Cleaning_Hostel_panel = new JPanel();
			Cleaning_Hostel_panel.setLayout(new GridLayout(2,1));
			JCheckBox wing_cleaning = new JCheckBox(" Wing is not Clean");
			JCheckBox cleaning = new JCheckBox(" hostel is not Clean");
			Cleaning_Hostel_panel.add(cleaning);
			Cleaning_Hostel_panel.add(wing_cleaning);
			add("South",Cleaning_Hostel_panel);
		}
		else{
			JPanel Other_panel = new JPanel();
			Other_panel.setLayout(new GridLayout(2,1));
			JLabel other_prob = new JLabel("Any Other Problem");
			JTextField Other_Hostel = new JTextField();
			Other_panel.add(other_prob);
			Other_panel.add(Other_Hostel);
			add("South",Other_panel);
		}
	}
}
