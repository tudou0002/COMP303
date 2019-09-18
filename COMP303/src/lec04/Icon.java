package lec04;

import java.awt.Component;
import java.awt.Graphics;

public interface Icon {
	
	int getIconHeight();
	int getIconWidth();
	void paintIcon(Component c, Graphics g, int x, int y);
	

}
