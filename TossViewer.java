import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 * 
 * @author Zayd Moosajee, Jyotishka Sen, Ram Krishna
 *
 */
public class TossViewer 
{

	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Ball_Toss");
		
		frame.setLayout(new FlowLayout());
		
		Button pickle = new Button("Pickle Man");
		Button turtle = new Button("Turtonne");
		Button moon = new Button("C-Moon");
		Button king = new Button("Waffle King");
		
		frame.setBounds(400, 400, 800, 600);
		
		JOptionPane pane = new JOptionPane("Choose a character");
		
		frame.add(pane);
		
		frame.add(pickle,0);
		frame.add(turtle,1);
		frame.add(moon,2);
		frame.add(king,3);
		
		
	
		
		frame.setVisible(true);
	}
	
	
	
	
	
}
