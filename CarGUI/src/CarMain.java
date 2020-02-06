import javax.swing.JFrame;

public class CarMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Car Animation");
	    frame.getContentPane().add(new CarModel());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(700,400);
	    frame.setVisible(true);

	}

}
