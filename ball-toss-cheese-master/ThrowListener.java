/**
 * An ActionListener that calls a method (which creates the Tosser) 
 * in TossViewer when a button is clicked
 * @author Ram Krishna, Jyotishka Sen, Zayd Moosajee
 * Teacher: Ishman
 * Period: 2
 * Due Date: 05-16-19
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThrowListener implements ActionListener
{
   public void actionPerformed(ActionEvent event)
   {
      TossViewer.makeThrow(event.getActionCommand());
   }            
}

