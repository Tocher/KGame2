import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class CustomListenerWheel implements MouseWheelListener {
		public void mouseWheelMoved(MouseWheelEvent e) {
			for(int i=0;i<Game.BaseUnits.size();i++)
			{
				if(e.getWheelRotation() < 0)   
				{
         		   if(Game.BaseUnits.get(i).size < 500)
         			  Game.BaseUnits.get(i).size += 50;
				}
         		else
         		{
         			if(Game.BaseUnits.get(i).size > 50)
         				Game.BaseUnits.get(i).size -= 50;
         		}
			}
       }
			
   }