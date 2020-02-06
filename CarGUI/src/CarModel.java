import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CarModel extends JPanel  implements ActionListener{
	Timer timer = new Timer(25, this);
	
	int x = 0, moveX = 5;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.RED);
		g.setColor(Color.PINK);
		g.fillRect(x-20, 140, 220, 90);
		g.fillRect(x, 120, 150, 120);
		g.setColor(Color.GRAY);
		g.fillRect(x + 80, 130, 50, 30);
		g.setColor(Color.WHITE);
		//left tire
		g.fillOval(x, 200, 60, 60);
		//right tire
		g.fillOval((x+100), 200, 60, 60);
		g.setColor(Color.ORANGE);
		g.fillOval(x+10, 210, 40, 40);
		g.fillOval(x + 110, 210, 40, 40);
		timer.start();
	
	}

	public void actionPerformed(ActionEvent event) {
		if(x < 0 || x > 500)
			moveX = -moveX;
		x = x+ moveX;
		//if(x< 0)
		//	x= 500;
		repaint();
	}

}
