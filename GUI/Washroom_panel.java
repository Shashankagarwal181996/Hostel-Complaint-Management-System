import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
public class Washroom_panel extends JPanel implements ActionListener{
	public Washroom_panel(){
		JButton Carpenter = new JButton("Carpenter");
		JButton Electrician = new JButton("Electrician");
		JButton Plumber = new JButton("Plumber");
		JButton Cleaning = new JButton("Cleaning");
		JButton others = new JButton("Others");
		add(Carpenter);
		add(Electrician);
		add(Plumber);
		add(Cleaning);
		add(others);
		
		Carpenter.addActionListener(this);
		Carpenter.setActionCommand("carpenter");
		
		Electrician.addActionListener(this);
		Electrician.setActionCommand("electrician");
		
		Plumber.addActionListener(this);
		Plumber.setActionCommand("plumber");
		
		Cleaning.addActionListener(this);
		Cleaning.setActionCommand("cleaning");
		
		others.addActionListener(this);
		others.setActionCommand("others");
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("carpenter")){
			JPanel carp_panel_wash = new JPanel();
			carp_panel_wash.setLayout(new GridLayout(3,1));
			JCheckBox Door = new JCheckBox("Door");
			JCheckBox Latches = new JCheckBox("Latches");
			JCheckBox others = new JCheckBox("Others");
			carp_panel_wash.add(Door);
			carp_panel_wash.add(Latches);
			carp_panel_wash.add(others);
			add("South",carp_panel_wash);
		}
		else if(ae.getActionCommand().equals("electrician")){
			JPanel elec_panel_wash = new JPanel();
			elec_panel_wash.setLayout(new GridLayout(3,1));
			JCheckBox Tubelight = new JCheckBox("TubeLight");
			JCheckBox Switches_regulators = new JCheckBox("Switches and regulators");
			JCheckBox others = new JCheckBox("Others");
			elec_panel_wash.add(Tubelight);
			elec_panel_wash.add(Switches_regulators);
			elec_panel_wash.add(others);
			add("South",elec_panel_wash);
		}
		else if(ae.getActionCommand().equals("plumber")){
			JPanel plumber_panel_wash = new JPanel();
			plumber_panel_wash.setLayout(new GridLayout(2,1));
			JCheckBox Taps = new JCheckBox(" Taps are not working ");
			JCheckBox Shower = new JCheckBox("Shower is not functioning properly");
			JCheckBox Water_Leakage = new JCheckBox("Facing water leakage in the toilet");
			plumber_panel_wash.add(Taps);
			plumber_panel_wash.add(Shower);
			add("South",plumber_panel_wash);
			
		}
		else if(ae.getActionCommand().equals("cleaning")){
			JPanel Cleaning_panel_wash = new JPanel();
			Cleaning_panel_wash.setLayout(new GridLayout(1,1));
			JCheckBox Clean = new JCheckBox("Washroom is not clean");
			Cleaning_panel_wash.add(Clean);
			add("South",Cleaning_panel_wash);
		}
		else{
			JPanel other_panel = new JPanel();
			other_panel.setLayout(new GridLayout(1,1));
			JCheckBox others = new JCheckBox("others");
			other_panel.add(others);
			add("South",other_panel);
		}
	}
}

