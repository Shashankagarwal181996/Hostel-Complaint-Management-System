import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
public class Washroom_panel extends JPanel implements ActionListener{
	JButton Carpenter;
	JButton Electrician;
	JButton Plumber ;
	JButton Cleaning ;
	JButton others;
	JPanel carp_panel_wash;
	JPanel elec_panel_wash;
	JPanel plumber_panel_wash;
	JPanel Cleaning_panel_wash;
	JPanel other_panel;
	
	
	public Washroom_panel(){
		Carpenter = new JButton("Carpenter");
		Electrician = new JButton("Electrician");
		Plumber = new JButton("Plumber");
		Cleaning = new JButton("Cleaning");
		others = new JButton("Others");
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
	
		carp_panel_wash = new JPanel();
		elec_panel_wash = new JPanel();
		plumber_panel_wash = new JPanel();
		Cleaning_panel_wash = new JPanel();
		other_panel = new JPanel();		
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("carpenter")){
			elec_panel_wash.setVisible(false);
			plumber_panel_wash.setVisible(false);
			Cleaning_panel_wash.setVisible(false);
			other_panel.setVisible(false);
			
			carp_panel_wash.setVisible(true);
			
			
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
			
			carp_panel_wash.setVisible(false);
			plumber_panel_wash.setVisible(false);
			Cleaning_panel_wash.setVisible(false);
			other_panel.setVisible(false);
			
			elec_panel_wash.setVisible(true);
			
			
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
			carp_panel_wash.setVisible(false);
			elec_panel_wash.setVisible(false);
			Cleaning_panel_wash.setVisible(false);
			other_panel.setVisible(false);
			
			plumber_panel_wash.setVisible(true);
			
			
			plumber_panel_wash.setLayout(new GridLayout(2,1));
			JCheckBox Taps = new JCheckBox(" Taps are not working ");
			JCheckBox Shower = new JCheckBox("Shower is not functioning properly");
			JCheckBox Water_Leakage = new JCheckBox("Facing water leakage in the toilet");
			plumber_panel_wash.add(Taps);
			plumber_panel_wash.add(Shower);
			add("South",plumber_panel_wash);
			
		}
		else if(ae.getActionCommand().equals("cleaning")){
			carp_panel_wash.setVisible(false);
			elec_panel_wash.setVisible(false);
			plumber_panel_wash.setVisible(false);
			other_panel.setVisible(false);
			
			Cleaning_panel_wash.setVisible(true);
			
			Cleaning_panel_wash.setLayout(new GridLayout(1,1));
			JCheckBox Clean = new JCheckBox("Washroom is not clean");
			Cleaning_panel_wash.add(Clean);
			add("South",Cleaning_panel_wash);
		}
		else{
			carp_panel_wash.setVisible(false);
			elec_panel_wash.setVisible(false);
			Cleaning_panel_wash.setVisible(false);
			plumber_panel_wash.setVisible(false);
			
			other_panel.setVisible(true);
			

			other_panel.setLayout(new GridLayout(1,1));
			JCheckBox others = new JCheckBox("others");
			other_panel.add(others);
			add("South",other_panel);
		}
	}
}

