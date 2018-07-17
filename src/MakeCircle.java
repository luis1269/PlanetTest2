

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MakeCircle extends JPanel{
	double distanceFromSun[] = new double[2];
	double radius[] = new double[2];
	double centerOfGravity = 0;
	int diameter[] = new int[2];
	int div1 = 6, div2 = 3000000, div3 =900;
	
	@Override 
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		diameter[0] = (int)radius[0]/2;
		diameter[1] = (int)radius[1]/2;
		g.setColor(Color.YELLOW);
		g.fillOval(-995, -400, 1000, 1000);
		
		g.setColor(Color.lightGray);
		//g.fillOval(0, 100, 100, 100);
		g.fillOval((int)(distanceFromSun[0]/div2), 100, (int)radius[0]/div3, (int)radius[0]/div3);
		g.fillOval((int)(distanceFromSun[1]/div2), 100, (int)radius[1]/div3, (int)radius[1]/div3);

		//Draw line in middle of planets
		g.setColor(Color.BLUE);
		g.drawLine((int)(distanceFromSun[0]/div2)+(diameter[0]/div3), 100, (int)(distanceFromSun[0]/div2)+(diameter[0]/div3), 400);
		g.drawLine((int)(distanceFromSun[1]/div2)+(diameter[1]/div3), 100, (int)(distanceFromSun[1]/div2)+(diameter[1]/div3), 400);
		
		//Draw center of gravity between two planets
		g.setColor(Color.RED);
		g.drawLine((int)centerOfGravity , 100, (int)centerOfGravity, 400);
		//System.out.println((int)distanceFromSun[1]*div1+(int)radius[0]/div2);
		
		
	}


	
		
	
	
}
