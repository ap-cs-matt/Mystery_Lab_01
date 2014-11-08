import java.awt.*;
import java.applet.*;


public class Mystery_lab_01 extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		g.setColor(Color.blue);
		g.drawRect(100,100,200,200);
		g.drawRect(175,175,200,200);
		
		g.drawLine(100,100,175,175);
		g.drawLine(300,300,375,375);
		
		g.drawLine(100,300,175,375);
		g.drawLine(300,100,375,175);

		
//github is awesome!


		// DRAW SPHERE
		g.setColor(Color.red);
		int i=0;
		int hieght=200;
		int width=200;
		int stx =150;
		int sty=140;
		while (i<5)
		{
			g.drawOval(stx,sty,width,hieght);
			hieght = hieght -40;
			sty= sty+20;
			
			
			i++;
		}
		i=0;
		hieght=200;
		width=200;
		 stx =140;
		 sty=150;
		while(i<5)
		{
			
			g.drawOval(sty,stx,hieght,width);
			hieght = hieght -40;
			sty= sty+20;
			i++;
		}



		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

		g.drawOval(600,400,200,200);
		g.drawLine(600, 500, 775, 435);
		g.drawLine(775,435,775,565);
		g.drawLine(775,565,600,500);
		g.drawOval(685,456,89,89);


		// DRAW APCS
   //g.setFont(new Font(
		//g.drawString("APCS", 50, 400);
     // g.drawSt
      
      g.setColor(Color.blue);
      g.fillRect(50,400,50,15);
      g.fillRect(50,430,50,15);
      g.fillRect(50,400,15,80);
      g.fillRect(100,400,15,80);
      
      g.fillRect(150,400,50,15);
      g.fillRect(150,400,15,80);
      g.fillRect(190,400,15,45);
      g.fillRect(150,430,50,15);
      
      g.fillRect(220,400,50,15);
      g.fillRect(220,465,50,15);
      g.fillRect(220,400,15,80);
      
      g.fillRect(280,400,50,15);
      g.fillRect(280,435,50,15);
       g.fillRect(280,470,50,15);
       g.fillRect(280,400,15,50);
       g.fillRect(315,435,15,50);
      


		// DRAW PACMEN FLOWER
		g.setColor(Color.green);
		
		g.fillArc(300, 500, 100, 100, -135, 270);
		g.fillArc(365,435,100,100,-225,270);
		g.fillArc(430, 500, 100, 100, 45, 270);
		g.fillArc(365,565,100,100,-45,270);



	}

}