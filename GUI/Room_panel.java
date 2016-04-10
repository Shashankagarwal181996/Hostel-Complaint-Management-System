import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Room_panel extends JPanel implements ActionListener{
	JButton Carpenter;
	JButton Electrician;
	JButton Duct;
	JButton Lan_Port;
	JButton others_room;
	JPanel carp_panel;
	JPanel elec_panel;
	JPanel duct_panel;
	JPanel lan_panel;
	JPanel other_panel;
	
	public Room_panel(){
		Carpenter = new JButton("Carpenter");
		Electrician = new JButton("Electrician");
		Duct = new JButton("Duct");
		Lan_Port= new JButton("Lan Port");
		others_room = new JButton("Others");
		
		add(Carpenter);
		add(Electrician);
		add(Duct);
		add(Lan_Port);
		add(others_room);
	//	setLayout(new GridLayout(5,1));
		
		Carpenter.addActionListener(this);
		Carpenter.setActionCommand("carpenter");
		
		Electrician.addActionListener(this);
		Electrician.setActionCommand("electrician");
		
		Duct.addActionListener(this);
		Duct.setActionCommand("duct");
		
		Lan_Port.addActionListener(this);
		Lan_Port.setActionCommand("lan_port");
		
		others_room.addActionListener(this);
		others_room.setActionCommand("others");
		
		carp_panel = new JPanel();
		elec_panel = new JPanel();
		duct_panel = new JPanel();
		lan_panel = new JPanel();
		other_panel = new JPanel();
	}
	public void actionPerformed(ActionEvent ae){
	
		if(ae.getActionCommand().equals("carpenter")){
			elec_panel.setVisible(false);
			duct_panel.setVisible(false);
			lan_panel.setVisible(false);
			other_panel.setVisible(false);
			
			carp_panel.setVisible(true);
			
			carp_panel.setLayout(new GridLayout(7,1));
			JCheckBox Table = new JCheckBox("Table");
			JCheckBox Chair = new JCheckBox("Chair");
			JCheckBox Almirah = new JCheckBox("Almirah");
			JCheckBox Board = new JCheckBox("Board");
			JCheckBox curtain = new JCheckBox("curtain");
			JCheckBox Bed = new JCheckBox("Bed");
			JCheckBox others = new JCheckBox("Others");
			carp_panel.add(Table);
			carp_panel.add(Chair);
			carp_panel.add(Almirah);
			carp_panel.add(Board);
			carp_panel.add(curtain);
			carp_panel.add(Bed);
			carp_panel.add(others);
			add("South",carp_panel);
		}
		else if(ae.getActionCommand().equals("electrician")){
			carp_panel.setVisible(false);
			duct_panel.setVisible(false);
			lan_panel.setVisible(false);
			other_panel.setVisible(false);
		
			elec_panel.setVisible(true);
			
			elec_panel.setLayout(new GridLayout(6,1));
			JCheckBox Tubelight = new JCheckBox("TubeLight");
			JCheckBox Fan = new JCheckBox("Fan");
			JCheckBox Studylight = new JCheckBox("StudyLight");
			JCheckBox Charging_points = new JCheckBox("Charging_points");
			JCheckBox Switches_regulators = new JCheckBox("Switches and regulators");
			JCheckBox others = new JCheckBox("Others");
			elec_panel.add(Tubelight);
			elec_panel.add(Fan);
			elec_panel.add(Studylight);
			elec_panel.add(Charging_points);
			elec_panel.add(Switches_regulators);
			elec_panel.add(others);
			add("South",elec_panel);
		}
		else if(ae.getActionCommand().equals("duct")){
			carp_panel.setVisible(false);
			elec_panel.setVisible(false);
			lan_panel.setVisible(false);
			other_panel.setVisible(false);
			
			duct_panel.setVisible(true);
			
			duct_panel.setLayout(new GridLayout(2,1));
			JCheckBox Duct_power = new JCheckBox("Duct is unable to start ");
			JCheckBox Duct_room = new JCheckBox("Duct for a particular room is not starting for particulr room");
			duct_panel.add(Duct_power);
			duct_panel.add(Duct_room);
			add("South",duct_panel);
			
		}
		else if(ae.getActionCommand().equals("lan_port")){
			carp_panel.setVisible(false);
			duct_panel.setVisible(false);
			elec_panel.setVisible(false);
			other_panel.setVisible(false);
			
			lan_panel.setVisible(true);
			
			lan_panel.setLayout(new GridLayout(1,1));
			JCheckBox lan_port = new JCheckBox("lan port");
			lan_panel.add(lan_port);
			add("South",lan_panel);
		}
		else{
			carp_panel.setVisible(false);
			duct_panel.setVisible(false);
			lan_panel.setVisible(false);
			elec_panel.setVisible(false);
			
			other_panel.setVisible(true);
			
			other_panel.setLayout(new GridLayout(1,1));
			JCheckBox others = new JCheckBox("others");
			other_panel.add(others);
			add("South",other_panel);
		}
	}
}

