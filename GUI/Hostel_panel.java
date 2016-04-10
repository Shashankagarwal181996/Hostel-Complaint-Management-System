import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;

public class Hostel_panel extends JPanel implements ActionListener{
	
	//private static final Container Hostel_panel = null;
	JPanel Water_Cooler_panel;
	JPanel Other_panel;
	JPanel Hostel_Light_panel;
	JPanel Cleaning_Hostel_panel;
	boolean chk[] = new boolean[5];
	
	public Hostel_panel(){
		
		JPanel neww = new JPanel();
		neww.setSize(400,400);
		neww.setPreferredSize(new Dimension(300,75));
		neww.setLayout(new FlowLayout());
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton Water_Cooler = new JButton("Water Cooler");
		//Water_Cooler.setSize(2,3000 );
        Water_Cooler.setPreferredSize(new Dimension(109,60));
		neww.add(Water_Cooler);
		
		JButton Hostel_Light = new JButton("Hostel Light");
		Hostel_Light.setPreferredSize(new Dimension(109,60));
		neww.add(Hostel_Light);
		
		JButton Cleaning_hostel = new JButton("Cleaning");
		neww.add(Cleaning_hostel);
		Cleaning_hostel.setPreferredSize(new Dimension(109,60));
		
		JButton others_hostel = new JButton("Others");
		others_hostel.setPreferredSize(new Dimension(109,60));
		neww.add(others_hostel);
		add(neww);
		
		Water_Cooler.addActionListener(this);
		Water_Cooler.setActionCommand("water cooler");
		
		Hostel_Light.addActionListener(this);
		Hostel_Light.setActionCommand("hostel light");
		
		Cleaning_hostel.addActionListener(this);
		Cleaning_hostel.setActionCommand("cleaning");
		
		others_hostel.addActionListener(this);
		others_hostel.setActionCommand("Others");
		
		Water_Cooler_panel = new JPanel();
		Hostel_Light_panel = new JPanel();
		Cleaning_Hostel_panel = new JPanel();
		Other_panel = new JPanel();		
	}
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getActionCommand().equals("water cooler")){
			
			if(!chk[1]){
				
				Water_Cooler_panel.setLayout(new FlowLayout());
				
				JCheckBox Water_Cooler = new JCheckBox("Water Cooler");
				Water_Cooler_panel.add(Water_Cooler);
				add(Water_Cooler_panel);
				chk[1] = true;
			}
			Hostel_Light_panel.setVisible(false);
			Cleaning_Hostel_panel.setVisible(false);
			Other_panel.setVisible(false);			
			Water_Cooler_panel.setVisible(true);
		}
		
		else if(ae.getActionCommand().equals("hostel light")){
		
			if(!chk[2]){
				Hostel_Light_panel.setLayout(new FlowLayout());
				
				JCheckBox light = new JCheckBox("Hostel lights");
				JCheckBox wing_light = new JCheckBox("Wing lights");
				Hostel_Light_panel.add(light);
				Hostel_Light_panel.add(wing_light);
				add(Hostel_Light_panel);
				chk[2] = true;
			}
			Water_Cooler_panel.setVisible(false);
			Cleaning_Hostel_panel.setVisible(false);
			Other_panel.setVisible(false);
			Hostel_Light_panel.setVisible(true);
		}
		
		else if(ae.getActionCommand().equals("cleaning")){
			
			if(!chk[3]){
				Cleaning_Hostel_panel.setLayout(new FlowLayout());
				
				JCheckBox wing_cleaning = new JCheckBox(" Wing is not Clean");
				JCheckBox cleaning = new JCheckBox(" hostel is not Clean");
				Cleaning_Hostel_panel.add(cleaning);
				Cleaning_Hostel_panel.add(wing_cleaning);
				add(Cleaning_Hostel_panel);
				chk[3] = true;
			}
			Water_Cooler_panel.setVisible(false);
			Hostel_Light_panel.setVisible(false);
			Other_panel.setVisible(false);			
			Cleaning_Hostel_panel.setVisible(true);		
		}
		
		else{
			
			if(!chk[4]){
				Other_panel.setLayout(new FlowLayout());
				
				JTextField Other_Hostel = new JTextField(10);
				Other_panel.add(new JLabel("Any Other Problem"));
				Other_panel.add(Other_Hostel);
				add(Other_panel);
				chk[4] = true;
			}
			Water_Cooler_panel.setVisible(false);
			Hostel_Light_panel.setVisible(false);
			Cleaning_Hostel_panel.setVisible(false);
			Other_panel.setVisible(true);
		}
	}
}
