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
	private static final double BASE_T = 0.15;
	private static final int MS_S = 1000;

	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Ball_Toss");
		
		frame.setLayout(new FlowLayout());
		
		JButton pickle = new JButton("Pickle Man");
		JButton turtle = new JButton("Turtonne");
		JButton moon = new JButton("C-Moon");
		JButton king = new JButton("Waffle King");
		
		Thrower throw;
		class ThrowListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				throw = new Thrower(event.getActionCommand());
			}	
		}	
		JButton starter = new JButton("Start Throw");
		JButton throw = new JButton("Throw Ball");
		long startT = 0;
		long endT = 0;
		class StartListener implements ActionListener
		{
			public void actionPerformend(ActionEvent event)
			{
				if (event.getActionCommand().equals("Start Throw"))
				{
					startT = System.currentTimeMillis();
				}
				else
				{
					endT = System.currentTimeMillis();
				}
			}
		}	
		double changeT = (Math.abs(endT - startT)) / MS_S + BASE_T;
		throw.setT(changeT);
		
		frame.setBounds(400, 400, 800, 600);
		
		JOptionPane pane = new JOptionPane("Choose a character");
		
		frame.add(pane);
		
		frame.add(pickle,0);
		frame.add(turtle,1);
		frame.add(moon,2);
		frame.add(king,3);
		
		frame.add(starter, 4);
		frame.add(throw, 5);
		
		
	
		
		frame.setVisible(true);
	}
	
	
	
	
	
}
