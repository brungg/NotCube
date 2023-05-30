import java.awt.*;

import javax.swing.*;

public class Cube extends JPanel {
	double a = 0;
	
	public Cube() {
		this.setPreferredSize(new Dimension(500, 500));
		this.setBackground(Color.black);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < 100; i++) {
			a += 10;
			double[][] f = {
					{Math.cos(a), -Math.sin(a)}, 
					{Math.sin(a), Math.cos(a)}
				};
			drawCube(g, 100, f);
			
			repaint();
		}
		
		//try { Thread.sleep(10); } catch (InterruptedException e) {}
	}
	
	private void drawCube(Graphics g, int d, double[][] m) {
		g.setColor(Color.white);

		int x = (int) (110 * m[0][0] + 100 * m[0][1]);
		int y = (int) (10 * m[1][0] + 50 * m[1][1]);
		
		g.drawLine(x + 250, y + 250, x + d + 250, y + 250);
		g.drawLine(x + 250, y + 250, x + 250, y + d + 250);
		g.drawLine(x + d + 250, y + d + 250, x + d + 250, y + 250);
		g.drawLine(x + d + 250, y + d + 250, x + 250, y + d + 250);
//		g.drawRect(x, y, d, d);
		
//		g.drawRect(x + d/2, y - d/2, d, d);
//		
//		g.drawLine(x, y, x + d/2, y - d/2);
//		g.drawLine(x + d, y, x + d + d/2, y - d/2);
//		
//		g.drawLine(x, y + d, x + d/2, y + d/2);
//		g.drawLine(x + d, y + d, x + d + d/2, y + d/2);
		
		
	}
}
