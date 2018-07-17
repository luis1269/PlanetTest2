import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class triangle extends JPanel {


	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		BufferedImage img1 = null;
		
		setLayout(null);
		
		try {
			img1 = ImageIO.read(new File("images/Rtriangle.png"));
			
		}
		catch (IOException e) {
		}
		BufferedImage bi = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		g = bi.getGraphics();
		
		g.drawImage(img1, 0, 0, null);

	}

}
