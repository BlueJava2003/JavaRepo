package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

public class DrawGraphics extends Panel{
	
	public DrawGraphics()
	{
		this.setBackground(Color.white);
	}

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawOval(50, 50, 50, 50);
	}
	
}
