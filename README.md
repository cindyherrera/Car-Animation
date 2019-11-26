# CarAnimation
//car moves left to right 

import javax.swing.JFrame;

public class CarExClient {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
	    frame.getContentPane().add(new CarModel());

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(600,600);
	    frame.setVisible(true);
	  

	}
  
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CarModel extends JPanel  implements ActionListener {
	Timer timer = new Timer(20, this);
	
	int x = 0, moveX = 5;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(x, 140, 120, 90);
		g.fillOval(x, 200, 60, 60);
		g.fillOval((x+100), 200, 60, 60);
		timer.start();
		
	}

	public void actionPerformed(ActionEvent event) {
		if(x < 0 || x > 460)
			moveX = -moveX;
	
		x = x+ moveX;
		repaint();
	}

}


}
