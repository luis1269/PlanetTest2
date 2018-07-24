//This is a test
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class triangle extends JPanel {
	
	BufferedImage img1 = null;
	JPanel panel = new JPanel();
	private JTextField textFieldA;
	private JTextField textFieldB;
	private JTextField textFieldC;
	private JTextField textFielda;
	private JTextField textFieldb;
	private JTextField textFieldc;
	
	
	
	public triangle() {
		setSize(new Dimension(1000, 632));
		setPreferredSize(new Dimension(1000, 632));
		setMinimumSize(new Dimension(500, 500));
		setLayout(new BorderLayout(1, 1));
		
		try {
			img1 = ImageIO.read(new File("images/Rtriangle.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon img2 = new ImageIcon(img1);
		panel.setSize(new Dimension(100, 900));
		panel.setPreferredSize(new Dimension(100, 900));
		
		add(panel, BorderLayout.WEST);
		panel.setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setActionCommand("Calculate");
		btnCalculate.setBounds(0, 451, 99, 44);
		panel.add(btnCalculate);
		
		JLabel labelA = new JLabel("A");
		labelA.setHorizontalTextPosition(SwingConstants.CENTER);
		labelA.setBounds(13, 27, 86, 20);
		panel.add(labelA);
		
		textFieldA = new JTextField();
		textFieldA.setBounds(13, 61, 86, 20);
		panel.add(textFieldA);
		textFieldA.setColumns(10);
		
		JLabel labelB = new JLabel("B");
		labelB.setHorizontalTextPosition(SwingConstants.CENTER);
		labelB.setBounds(13, 95, 86, 20);
		panel.add(labelB);
		
		textFieldB = new JTextField();
		textFieldB.setColumns(10);
		textFieldB.setBounds(13, 129, 86, 20);
		panel.add(textFieldB);
		
		JLabel labelC = new JLabel("C");
		labelC.setHorizontalTextPosition(SwingConstants.CENTER);
		labelC.setBounds(13, 163, 86, 20);
		panel.add(labelC);
		
		textFieldC = new JTextField();
		textFieldC.setColumns(10);
		textFieldC.setBounds(13, 197, 86, 20);
		panel.add(textFieldC);
		
		JLabel labela = new JLabel("a");
		labela.setHorizontalTextPosition(SwingConstants.CENTER);
		labela.setBounds(13, 231, 86, 20);
		panel.add(labela);
		
		textFielda = new JTextField();
		textFielda.setColumns(10);
		textFielda.setBounds(13, 265, 86, 20);
		panel.add(textFielda);
		
		JLabel labelb = new JLabel("b");
		labelb.setHorizontalTextPosition(SwingConstants.CENTER);
		labelb.setBounds(13, 299, 86, 20);
		panel.add(labelb);
		
		textFieldb = new JTextField();
		textFieldb.setColumns(10);
		textFieldb.setBounds(13, 333, 86, 20);
		panel.add(textFieldb);
		
		JLabel labelc = new JLabel("c");
		labelc.setHorizontalTextPosition(SwingConstants.CENTER);
		labelc.setBounds(13, 367, 86, 20);
		panel.add(labelc);
		
		textFieldc = new JTextField();
		textFieldc.setColumns(10);
		textFieldc.setBounds(13, 401, 86, 20);
		panel.add(textFieldc);
		JLabel lblTriangle = new JLabel("", img2, 0);
		add(lblTriangle, BorderLayout.CENTER);
		lblTriangle.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(1, 10));
		add(panel_1, BorderLayout.EAST);
		
		JTextArea textArea = new JTextArea();
		textArea.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		add(textArea, BorderLayout.SOUTH);
		textArea.setPreferredSize(new Dimension(600, 50));
		textArea.setText("This is a test!");
		
		
		//Action Handlers
		
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Check which fields have data and perform calculation
				
				
				textArea.setText( performCalculation( checkDataFields() ) );
				
				
				
				
			}
		});

	}
	
	public int checkDataFields() {
		
		
		return 0;
	}//End of method checkDataFields
	
	
	public String performCalculation(int input) {
		return Integer.toString(input);
	}//End of method performCalculation
	
	
}



