//***************************************************
//	OlympicRings.java		Author: Brian Kragh
//
//	Show the drawing of Olympic Rings with Java
//***************************************************

import javax.swing.JApplet;
import java.awt.*;

public class OlympicRings extends JApplet
{
		public void paint (Graphics page){
		
		// How do you find the coordinates?
		
		
		page.setColor(Color.blue);
		page.fillOval(75, 65, 100, 100);
		
		page.setColor(Color.yellow);
		page.fillOval(125, 115, 100, 100);
		
		page.setColor(Color.black);
		page.fillOval(175, 65, 100, 100);
		
		page.setColor(Color.green);
		page.fillOval(225, 115, 100, 100);
		
		page.setColor(Color.red);
		page.fillOval(275, 65, 100, 100);
		
		}
	}