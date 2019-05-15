import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThrowListener implements ActionListener
{
   public void actionPerformed(ActionEvent event)
   {
      TossViewer.makeThrow(event.getActionCommand());
   }            
}

