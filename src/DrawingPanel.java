import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private Color myPink = new Color(206,134,160);
	private Color myGreen = new Color(140,206,134);
	
	public DrawingPanel() {
		//setBackground(Color.GREEN);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("We have some JUICY games!!", 170, 200);
		

		g.setColor(myGreen);
		g.fillArc(100, 100, 300, 300, 180, 180);
		
		
		g.setColor(myPink);
		g.fillArc(120, 120, 260, 260, 180, 180);
		
		g.setColor(Color.BLACK);
		g.fillOval(200, 300, 20, 20);
		g.fillOval(190, 260, 20, 20);
		g.fillOval(290, 295, 20, 20);
		g.fillOval(250, 275, 20, 20);
		g.fillOval(240, 340, 20, 20);
		//g.drawOval(x, y, width, height);

		
	}
	
	
	public Dimension getPreferredSize() {
		return new Dimension(500, 500);
	}
}

	



