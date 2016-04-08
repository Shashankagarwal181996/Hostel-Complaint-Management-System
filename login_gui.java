import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class login_gui extends JFrame implements ActionListener{

	JFrame pan;
	JLabel user_lab,pass_lab,name_lab,roll_lab,phone_lab;
	JTextField user_text,pass_text,name_text,roll_text,phone_text;
	JButton submit_but; 
	 login_gui() {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout());
		user_lab = new JLabel();
		user_lab.setText("username");
		user_text = new JTextField();
		
		pass_lab = new JLabel();
		pass_lab.setText("Password");
		pass_text = new JTextField();
		
		name_lab = new JLabel();
		name_lab.setText("Name");
		name_text = new JTextField();
		
		roll_lab = new JLabel();
		roll_lab.setText("Roll Number");
		roll_text = new JTextField();
		
		phone_lab = new JLabel();
		phone_lab.setText("Phone Number");
		phone_text = new JTextField();
		
		submit_but = new JButton("Submit");
		submit_but.addActionListener(this);
		
		pan = new JFrame();
		pan.add(user_lab);
		pan.add(user_text);
		
		pan.add(pass_lab);
		pan.add(pass_text);
		/*
		pan.add(name_lab);
		pan.add(name_text);
		
		pan.add(roll_lab);
		pan.add(roll_text);
		
		pan.add(phone_lab);
		pan.add(phone_text);
		*/
		pan.add(submit_but);
		
		pan.setLayout(new GridLayout(3,1));
		pan.setTitle("Login into System");
		pan.setVisible(true);
		pan.setSize(500, 500);
		
	}
	public void actionPerformed(ActionEvent ae){
		String user = user_lab.getText();
		String pass = pass_lab.getText();
		JTextField u = new JTextField();
		JTextField t = new JTextField();
		u.setText(user);
		t.setText(pass);
		System.out.println(user + pass);
		if(user.equals("s") && pass.equals("s")){
			Next_Page page = new Next_Page();
			JLabel lab = new JLabel("Welcome");
			page.add(lab);
		}
		else{
			Next_Page page = new Next_Page();
			JLabel lab = new JLabel("Check your username and password");
			page.setLayout(new GridLayout(3,1));
			page.add(lab);
			page.add(u);
			page.add(t);
		}
	}
	/*
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}*/
}
