import javax.swing.JButton;
import javax.swing.JPanel;
public class Washroom_panel extends JPanel{
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
	}
}

