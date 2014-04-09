import javax.swing.JFrame;


public class Ventana {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setTitle("mi ventana");
		frame.setSize(1280, 720);
		JButton button = new JButton();
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(True);
	}

}
