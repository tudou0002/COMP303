package guiStarter;

import javax.swing.*;
public class FirstGUI {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,100);
		JButton button = new JButton("Press");
		frame.getContentPane().add(button);
		frame.setVisible(true);
	}
	
	public void chatFrame() {
		JFrame frame = new JFrame("Let's chat!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
	}

}
