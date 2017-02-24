package zahid;

import java.awt.Color;

import hsa_new.Console;

public class Hello2 {

	public static void main(String[] args) {
		int x = 0, y = 25;
		
		Console c = new Console();
		c.println("Yer a WIZARD, Harry!!");
		c.drawOval(x, y, 200, 200);
		c.drawOval(201, 25, 200, 200);
		c.setColor(Color.BLACK);
		c.fillOval(35, 45, 100, 100);
		c.fillOval(235, 45, 100, 100);
		c.drawLine(100, 250, 300, 250);
		c.drawRect(235, 250, 30, 30);
		
		

	}

}
