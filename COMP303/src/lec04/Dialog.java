package lec04;

import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.*;

public class Dialog {
	
	//avoid duplicate code
	public static void main(String[] args) {
		
//		CardSource deck = new Deck();
//		showWarning(new ImageIcon("warning.png"),deck);
		
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		Deck deck3 = new Deck();
		Deck deck4 = new Deck();
		Deck deck5 = new Deck();
		Deck deck6 = new Deck();
		
		deck1.sort1();//sortBySuit
		deck2.sort2();//sortBySuit
		deck3.sort3();//sortBySuit
		deck4.sort4();//sortByRank
		deck5.sort5();//sortByRank
		deck6.sort6();//sortBySuit
		System.out.println(deck1.toString());
		System.out.println(deck2.toString());
		System.out.println(deck3.toString());
		System.out.println(deck4.toString());
		System.out.println(deck5.toString());
		System.out.println(deck6.toString());
		
		
//		Icon icon = new ImageIcon("warning.png");
//		Icon icon2 = new CircleIcon(10);
//		//Icon is a super-type of ImageIcon
//		//interface tells you you need to have the 3 methods
		
	}
	//how can we do to make the code more reusable
	
	//extracting an interface draw() and isEmpty()
	//re-factor-> extract interface
	
//	/*Not sure this code can work*/
//	public static void showWarning(ImageIcon pIcon, CardSource pCardSource) {
//		JFrame frame= new JFrame();
//		frame.setLayout(new FlowLayout());
//		if(pCardSource.isEmpty()) {
//			frame.add(new JLabel(pIcon));
//			frame.add(new JLabel("Deck empty!"));
//		}else {
//			frame.add(new JLabel(pCardSource.draw().toString()));
//		}
//		frame.pack();
//		frame.setVisible(true);
//	}

}
