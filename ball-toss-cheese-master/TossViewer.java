import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.io.*;

/**
 * GUI for the ball game, excecutes the game with the players inputs.
 * @author Zayd Moosajee, Jyotishka Sen, Ram Krishna
 * Due date- 5/16/19
 * Teacher- Ishman
 */
public class TossViewer
{

	public static final double BASE_T_MAX = 0.65;
	public static final double BASE_T_MIN = 0.05;
	public static final int MS_S = 1000;
	public static final int TIMEOUT = 5;
	

	private static Thrower tosser;
	private static long startT;
	private static long endT;

	public static void main(String[] args)
	{

		JFrame frame = new JFrame("Ball_Toss");
		frame.setLayout(new FlowLayout());

		JButton pickle = new JButton("Pickle Man");
		JButton turtle = new JButton("Turtonne");
		JButton moon = new JButton("C-Moon");
		JButton king = new JButton("Waffle King");

		ActionListener listener = new ThrowListener();
		pickle.addActionListener(listener);
		turtle.addActionListener(listener);
		moon.addActionListener(listener);
		king.addActionListener(listener);

		JButton starter = new JButton("Start Throw");
		JButton throwbutton = new JButton("Throw Ball");
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
					int dt = (int) Math.abs(endT - startT) / MS_S;
					if (dt >= TIMEOUT)
					{
						dt = TIMEOUT;
					}
					double changeT = dt + Math.random() * (BASE_T_MAX - BASE_T_MIN) + BASE_T_MIN;
					tosser.setT(changeT);
				}
		}


		frame.setBounds(400, 400, 800, 600);

		JOptionPane pane = new JOptionPane("Choose a character");

		frame.add(pane);

		frame.add(pickle,0);
		frame.add(turtle,1);
		frame.add(moon,2);
		frame.add(king,3);

		frame.add(starter, 4);
	//	frame.add(throwr, 5);

		ImageIcon start = new ImageIcon("throw0.png");
		ImageIcon airUp = new ImageIcon("throw1.png");
		ImageIcon air = new ImageIcon("throw2.png");
		ImageIcon airDown = new ImageIcon("throw3.png");
		ImageIcon land = new ImageIcon("throw4.png");
		JLabel tossing = new JLabel();
		tossing.setIcon(start);
		frame.getContentPane().add(tossing);
		frame.pack();
		frame.setVisible(true);
		tossing.setIcon(airUp);
		frame.update(frame.getGraphics());
		tossing.setIcon(air);
		frame.update(frame.getGraphics());
		tossing.setIcon(airDown);
		frame.update(frame.getGraphics());
		tossing.setIcon(land);
		frame.update(frame.getGraphics());	
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





	/**
	* Instantiates the thrower selected, making the throw.
	* @param name the name of the thrower.
	*/
	public static void makeThrow(String name)
	{
		tosser = new Thrower(name);

	}




}
