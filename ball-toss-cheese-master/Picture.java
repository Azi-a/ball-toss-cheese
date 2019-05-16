import javax.imageio.ImageIO;

import java.awt.Image;
import java.awt.image.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
public class Picture 
{
	private final String[] codenames = {"pm","ttn","cm","wk"};
	private final String[] backgrounds = {"throw0","throw1","throw2","throw3","throw4"};
	
	
	
	public Picture(String codename)
	{
		
		
	}
	
	
	
	
	
	

	
	
	
	
	

	/**
	 * Generate an Image with the given codename. All sprites are located in the Main Sprites folder and are PNG format.
	 * @param codename the codename of the picture.
	 * @return
	 */
	public static Image loadPicture(String codename)
	{
		File target = new File(codename + ".png");
		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
}
