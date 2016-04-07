import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class login_gui extends JFrame implements ActionListener{

	JPanel pan;
	JLabel user_lab,pass_lab,name_lab,roll_lab,phone_lab;
	JTextField user_text,pass_text;
	JButton submit_but; 
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					makeGUI();
				}
			});
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	protected void makeGUI() {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout());
		user_lab = new JLabel();
		user_lab.setText("username");
		user_text = new JTextField();
		
		pass_lab = new JLabel();
		pass_lab.setText("Password");
		pass_text = new JTextField();
		
		name_lab = new JLabel();
		pass_lab.setText("Name");
		
		roll_lab = new JLabel();
		roll_lab.setText("Roll Number");
		
		phone_lab = new JLabel();
		pass_lab.setText("Phone Number");
		
		submit_but = new JButton("Submit");
		submit_but.addActionListener(this);
		
		pan = new JPanel(new GridLayout(3,1));
		pan.add(user_lab);
		pan.add(user_text);
		pan.add(pass_lab);
		pan.add(pass_text);
		pan.add(name_lab);
		pan.add(roll_lab);
		pan.add(phone_lab);
		pan.add(submit_but);
		
		add(pan,BorderLayout.CENTER);
		setTitle("Login into System");
		setVisible(true);
		setSize(500, 500);
		
	}
	public void actionPerformed(ActionEvent ae){
		String user = user_lab.getText();
		String pass = pass_lab.getText();
		if(user.equals("s") && user.equals("s")){
			Next_Page page = new Next_Page();
			JLabel lab = new JLabel("Welcome");
			page.add(lab);
		}
		else{
			Next_Page page = new Next_Page();
			JLabel lab = new JLabel("Check your username and password");
			page.add(lab);
		}
	}
	/*
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}*/
}
