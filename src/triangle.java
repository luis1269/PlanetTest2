<<<<<<< HEAD
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;

@SuppressWarnings("serial")
public class triangle extends JPanel {
	public triangle() {
		setPreferredSize(new Dimension(500, 500));
		setMinimumSize(new Dimension(500, 500));
		setSize(new Dimension(500, 500));
	}
	BufferedImage img1 = null;
	

	@Override 
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		try {
			img1 = ImageIO.read(new File("images/Rtriangle.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.drawImage(img1, 0, 0, null);
		
		
		
	}

}
=======
import javax.swing.JPanel;

public class triangle extends JPanel {

	/**
	 * Create the panel.
	 */
	public triangle() {
		setLayout(null);

	}

}
>>>>>>> refs/remotes/origin/master
