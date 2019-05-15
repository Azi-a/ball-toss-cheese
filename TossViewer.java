import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * 
 * @author Zayd Moosajee, Jyotishka Sen, Ram Krishna
 * 
 */
public class TossViewer 
{
	
	private static final double BASE_T = 0.15;
	private static final int MS_S = 1000;
	private static final int NUM_THROW_SPRITES = 4;

	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Ball_Toss");
		
		frame.setLayout(new FlowLayout());
		
		JButton pickle = new JButton("Pickle Man");
		JButton turtle = new JButton("Turtonne");
		JButton moon = new JButton("C-Moon");
		JButton king = new JButton("Waffle King");
		
		Thrower throwr;
		class ThrowListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				throwr = new Thrower(event.getActionCommand());
			}	
		}	
		JButton starter = new JButton("Start Throw");
		JButton throwbutton = new JButton("Throw Ball");
		long startT = 0;
		long endT = 0;
		class StartListener implements ActionListener
		{
			@Override
				public void actionPerformed(ActionEvent event)
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
		double changeT = (Math.abs(endT - startT)) / MS_S + Math.random() * BASE_T;
		throwr.setT(changeT);
		
		frame.setBounds(400, 400, 800, 600);
		
		JOptionPane pane = new JOptionPane("Choose a character");
		
		frame.add(pane);
		
		frame.add(pickle,0);
		frame.add(turtle,1);
		frame.add(moon,2);
		frame.add(king,3);
		
		frame.add(starter, 4);
	//	frame.add(throwr, 5);
		
		
	
		
		frame.setVisible(true);
	}
		
		
		
		
		
		
		
	
/*		JFrame frame = new JFrame("Ball_Toss");
		frame.setLayout(new FlowLayout());
		frame.setBounds(400, 400, 800, 600);
	
		JButton pickle = new JButton("Pickle Man");
		JButton turtle = new JButton("Turtonne");
		JButton moon = new JButton("C-Moon");
		JButton king = new JButton("Waffle King");
		
		JLabel text = new JLabel("Choose a character:");
		JPanel textpanel = new JPanel();
		textpanel.add(text);
		
		
		
		JOptionPane pane = new JOptionPane();
		
		JPanel panel = new JPanel(new FlowLayout());
		
		
		
		turtle.setEnabled(false);
		moon.setEnabled(false);
		king.setEnabled(false);
		
		panel.add(pickle);
		panel.add(turtle);
		panel.add(moon);
		panel.add(king);
	
		frame.add(textpanel,0);
		frame.add(panel,1);
		
		frame.setVisible(true);
		
		
		
		Picture pickleman = new Picture("pm");
		
		JFrame frame2 = new JFrame("Ball_Toss");
		
		frame.setLayout(new FlowLayout());
		

		*/
		
	
	
	
	
	
	
	public void throwBall(Thrower player,Ball baseball)
	{
		Picture sprite0 = new Picture("throw0");
		double airTime = baseball.getTimeBallInAir();
		double displayTime = airTime / NUM_THROW_SPRITES;
		Picture sprite1 = new Picture("throw1");
		Picture sprite2 = new Picture("throw2");
		Picture sprite3 = new Picture("throw3");
		Picture sprite4 = new Picture("throw4");
			
	}
	
	
}
