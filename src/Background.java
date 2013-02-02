import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Background {
	private Animator bg;
	private Animator tr_colors;
	private Animator tr_elem;
	private Animator hummer;
	private int width;
	private int height;
	private long timer=0;
	private int min=0;
	private int sec=0;
	public Graphics g;
	

	private int infoband = 30; //если придётся менять, и чтобы не было вопросов откуда 30...
	
	public void SetG(Graphics g)
	{
		this.g = g;
	}
	
	public Background()
	{
		Init init_png = new Init();		
		width = 190;
		height = 126;
		bg = new Animator(init_png.getArrayList("grass.png", width, height, 1, 1));
		tr_colors = new Animator(init_png.getArrayList("tr_colors.png", 1, 1, 1, 3));
		tr_elem = new Animator(init_png.getArrayList("tr_elem.png", 20, 20, 1, 1));
		hummer = new Animator(init_png.getArrayList("hummer2.png", 40, 40, 1, 1));
	}
		
	public void drawBG(int w,int h, long time)
	{
		bg.chFrame(0);		
		for(int i=infoband;i<h;i+=height/2)
		{
			for(int j=0;j<w;j+=width/2)
			{
				g.drawImage(bg.sprite, j, i, width/2, height/2, null);
			}
		}
		g.setColor(Color.black);
		
		//Поля (красное(2) - база, зеленое(0) - спавн, желтое(1) - поле боя)
		tr_colors.chFrame(0);
		g.drawImage(tr_colors.sprite,100,240,80,240,null);
		g.drawImage(tr_colors.sprite,820,240,80,240,null);		
		tr_colors.chFrame(1);
		g.drawImage(tr_colors.sprite,180,240,640,240,null);		
		tr_colors.chFrame(2);
		g.drawImage(tr_colors.sprite,0,230,100,260,null);	
		g.drawImage(tr_colors.sprite,900,230,1000,260,null);	
		
		//Надписи
		g.setColor(Color.white);
		Font font = new Font("Verdana", Font.BOLD,14);
		g.setFont(font);
		g.drawString("Поле боя", 440, 240);
		g.drawString("База", 20, 260);
				
		g.drawRect(0, 0, w, 29);
		g.setColor(Color.black);
		g.drawString("gold = "+ String.valueOf(Game.gold), 50, 20);
		
		g.drawString(Game.ServerStatus, 180, 20);
		
		g.drawString(String.valueOf(CustomMotionListener.X), 600, 20);
		g.drawString(String.valueOf(CustomMotionListener.Y), 650, 20);
		
		//Время
		if(timer+1000 <= time)
		{
			timer=time;
			sec++;
			if(sec>=60)
			{
				sec=0;
				min++;
			}
		}
		g.drawString(String.valueOf(min) + " : " + String.valueOf(sec), 400, 20);
		
		g.setColor(Color.white);
		
		font = new Font("Verdana", Font.BOLD,9);
		g.setFont(font);
		g.drawString("SPAWN", 120, 240);
		
		
				
		g.setColor(Color.black);
		// Надписи координат
		font = new Font("Verdana", 0,8);
		g.setFont(font);
		for(int i=0;i<w;i+=20)
			g.drawString(String.valueOf(i), i, 20+ infoband);
		for(int i=40;i<h;i+=20)
			g.drawString(String.valueOf(i), 0, i+ infoband);
		

		hummer.chFrame(0);
		if(CustomMotionListener.Place1)
			g.drawImage(hummer.sprite,100,240,40,40,null);
		if(CustomMotionListener.Place2)
			g.drawImage(hummer.sprite,100,280,40,40,null);
		if(CustomMotionListener.Place3)
			g.drawImage(hummer.sprite,100,320,40,40,null);
		if(CustomMotionListener.Place4)
			g.drawImage(hummer.sprite,100,360,40,40,null);
		if(CustomMotionListener.Place5)
			g.drawImage(hummer.sprite,100,400,40,40,null);
		if(CustomMotionListener.Place6)
			g.drawImage(hummer.sprite,100,440,40,40,null);
		if(CustomMotionListener.Place7)
			g.drawImage(hummer.sprite,140,240,40,40,null);
		if(CustomMotionListener.Place8)
			g.drawImage(hummer.sprite,140,280,40,40,null);
		if(CustomMotionListener.Place9)
			g.drawImage(hummer.sprite,140,320,40,40,null);
		if(CustomMotionListener.Place10)
			g.drawImage(hummer.sprite,140,360,40,40,null);
		if(CustomMotionListener.Place11)
			g.drawImage(hummer.sprite,140,400,40,40,null);
		if(CustomMotionListener.Place12)
			g.drawImage(hummer.sprite,140,440,40,40,null);
		
		for(int j=0;j<3;j++)
			for(int i=240;i<480;i+=4)
			{				
				g.drawLine(100+40*j, i, 100+40*j, i+2);	
			}	
		for(int j=0;j<7;j++)
		{
			for(int i=100;i<180;i+=4)
			{
				g.drawLine(i,240+40*j,i+2,240+40*j);
			}
		}
		
	}	
}
