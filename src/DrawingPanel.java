import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	public DrawingPanel() {
		setBorder(BorderFactory.createLineBorder(Color.black, 5));
		
}
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(250, 200);
	}
	
	DrawingPanel dp = new DrawingPanel();
	add(dp, BorderLayout.PAGE_END);


	
}


