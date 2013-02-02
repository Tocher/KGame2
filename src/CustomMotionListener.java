import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class CustomMotionListener implements MouseMotionListener {
		public static int X;
		public static int Y;
		public static boolean Place1 = false;
		public static boolean Place2 = false;
		public static boolean Place3 = false;
		public static boolean Place4 = false;
		public static boolean Place5 = false;
		public static boolean Place6 = false;
		public static boolean Place7 = false;
		public static boolean Place8 = false;
		public static boolean Place9 = false;
		public static boolean Place10 = false;
		public static boolean Place11 = false;
		public static boolean Place12 = false;
		public void mouseMoved(MouseEvent e) {
			X = e.getX();
			Y = e.getY();	
			Place1 = Place2 = Place3 = Place4 = Place5 = Place6 = Place7 = Place8 = Place9 = Place10 = Place11 = Place12 = false;
			if((X > 100)&&(X < 140)&&(Y > 240)&&(Y < 280))
				Place1 = true;
			if((X > 100)&&(X < 140)&&(Y > 280)&&(Y < 320))
				Place2 = true;
			if((X > 100)&&(X < 140)&&(Y > 320)&&(Y < 360))
				Place3 = true;
			if((X > 100)&&(X < 140)&&(Y > 360)&&(Y < 400))
				Place4 = true;
			if((X > 100)&&(X < 140)&&(Y > 400)&&(Y < 440))
				Place5 = true;
			if((X > 100)&&(X < 140)&&(Y > 440)&&(Y < 480))
				Place6 = true;
			if((X > 140)&&(X < 180)&&(Y > 240)&&(Y < 280))
				Place7 = true;
			if((X > 140)&&(X < 180)&&(Y > 280)&&(Y < 320))
				Place8 = true;
			if((X > 140)&&(X < 180)&&(Y > 320)&&(Y < 360))
				Place9 = true;
			if((X > 140)&&(X < 180)&&(Y > 360)&&(Y < 400))
				Place10 = true;
			if((X > 140)&&(X < 180)&&(Y > 400)&&(Y < 440))
				Place11 = true;
			if((X > 140)&&(X < 180)&&(Y > 440)&&(Y < 480))
				Place12 = true;
				
		}

		public void mouseDragged(MouseEvent e) {
			
		}
	}