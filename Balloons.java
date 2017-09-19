// **************************************************
// Balloons.java 				Author: Maricel
// **************************************************

import javax.swing.JApplet;
import java.awt.*;

public class Balloons extends JApplet
{
	//-----------------------
	// Draws balloons
	//-----------------------

	public void paint(Graphics page)
	{

		setBackground(Color.cyan);

		
		page.setColor(Color.yellow);
		page.fillOval(150, 40, 45, 60); 	// yellow balloon
		page.drawLine(50,50,50,175);	// string

		page.setColor(Color.red);
		page.fillOval(25, 40, 45, 60); 	// red balloon
		page.drawLine(50,50,50,175);	// string
		
		page.setColor(Color.blue);
		page.fillOval(260, 40, 45, 60); 	// blue one
		page.drawLine(50,50,50,175);	// string
		
	
		





	}
}
