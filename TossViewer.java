import java.awt.JButton;
import java.awt.FlowLayout;
import java.awt.JPanel;

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
		
		JButton pickle = new JButton("Pickle Man");
		JButton turtle = new JButton("Turtonne");
		JButton moon = new JButton("C-Moon");
		JButton king = new JButton("Waffle King");
		
		class ThrowListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Thrower throw = new Thrower(event.getActionCommand());
			}	
		}	
		
		
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
