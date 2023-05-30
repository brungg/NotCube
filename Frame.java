import javax.swing.*;

public class Frame extends JFrame {
	public Frame() {
		this.add(new Cube());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Cube");
		this.setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
	}
}
