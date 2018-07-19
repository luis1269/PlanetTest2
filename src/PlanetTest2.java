import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PlanetTest2 {

	private JFrame frame;

	//Add Circles for planet sizes
	MakeCircle planetOne = new MakeCircle();
	triangle trianglePane = new triangle();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanetTest2 window = new PlanetTest2();
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}//End of Main

	/**
	 * Create the application.
	 */
	public PlanetTest2() {
		initialize();
	}//End of Constructor PlanetTest2

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 886, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		planettest newplanet = new planettest();
		frame.getContentPane().setLayout(null);
		
		JPanel mainPane = new JPanel();
		mainPane.setBounds(0, 0, 870, 645);
		frame.getContentPane().add(mainPane);
		mainPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 862, 22);
		mainPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Navigate");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmTriangle = new JMenuItem("Triangle");
		
		
		JMenuItem mntmCalculateCenterOf = new JMenuItem("Calculate Center of Gravity");
		
		mnNewMenu.add(mntmCalculateCenterOf);
		mnNewMenu.add(mntmTriangle);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmClose);
		
		JPanel gravity_Panel = new JPanel();
		gravity_Panel.setBounds(0, 21, 862, 624);
		mainPane.add(gravity_Panel);
		gravity_Panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		gravity_Panel.add(panel, BorderLayout.WEST);
		panel.setPreferredSize(new Dimension(100, 1000));
		panel.setLayout(null);
		
		
		mainPane.add(trianglePane);
		trianglePane.setVisible(false);
		
		JButton btnStartHere = new JButton("Start Here!");
		btnStartHere.setBounds(0, 75, 100, 63);
		panel.add(btnStartHere);
		btnStartHere.setPreferredSize(new Dimension(35, 20));
		btnStartHere.setMinimumSize(new Dimension(35, 20));
		btnStartHere.setMaximumSize(new Dimension(35,20));
		
		JPanel panel_1 = new JPanel();
		gravity_Panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setPreferredSize(new Dimension(10000, 100));
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		gravity_Panel.add(panel_2, BorderLayout.NORTH);
		panel_2.setMinimumSize(new Dimension(230, 120));
		panel_2.setPreferredSize(new Dimension(230, 120));
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 32, 653, 33);
		panel_2.add(panel_3);
		
		ButtonGroup group1 = new ButtonGroup();
		ButtonGroup group2 = new ButtonGroup();
		
		JRadioButton rdbtnMercury = new JRadioButton("Mercury");
		panel_3.add(rdbtnMercury);
		group1.add(rdbtnMercury);
		
		
		JRadioButton rdbtnVenus = new JRadioButton("Venus");
		panel_3.add(rdbtnVenus);
		group1.add(rdbtnVenus);
		
		JRadioButton rdbtnEarth = new JRadioButton("Earth");
		panel_3.add(rdbtnEarth);
		group1.add(rdbtnEarth);
		
		JRadioButton rdbtnMars = new JRadioButton("Mars");
		panel_3.add(rdbtnMars);
		group1.add(rdbtnMars);
		
		JRadioButton rdbtnJupiter = new JRadioButton("Jupiter");
		panel_3.add(rdbtnJupiter);
		group1.add(rdbtnJupiter);
		
		JRadioButton rdbtnSaturn = new JRadioButton("Saturn");
		panel_3.add(rdbtnSaturn);
		group1.add(rdbtnSaturn);
		
		JRadioButton rdbtnUranus = new JRadioButton("Uranus");
		panel_3.add(rdbtnUranus);
		group1.add(rdbtnUranus);
		
		JRadioButton rdbtnNeptune = new JRadioButton("Neptune");
		panel_3.add(rdbtnNeptune);
		group1.add(rdbtnNeptune);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 76, 653, 33);
		panel_2.add(panel_4);
		
		JRadioButton rdbtn2Mercury = new JRadioButton("Mercury");
		panel_4.add(rdbtn2Mercury);
		group2.add(rdbtn2Mercury);
		
		JRadioButton rdbtn2Venus = new JRadioButton("Venus");
		panel_4.add(rdbtn2Venus);
		group2.add(rdbtn2Venus);
		
		
		JRadioButton rdbtn2Earth = new JRadioButton("Earth");
		panel_4.add(rdbtn2Earth);
		group2.add(rdbtn2Earth);
		
		JRadioButton rdbtn2Mars = new JRadioButton("Mars");
		panel_4.add(rdbtn2Mars);
		group2.add(rdbtn2Mars);
		
		JRadioButton rdbtn2Jupiter = new JRadioButton("Jupiter");
		panel_4.add(rdbtn2Jupiter);
		group2.add(rdbtn2Jupiter);
		
		JRadioButton rdbtn2Saturn = new JRadioButton("Saturn");
		panel_4.add(rdbtn2Saturn);
		group2.add(rdbtn2Saturn);
		
		JRadioButton rdbtn2Uranus = new JRadioButton("Uranus");
		panel_4.add(rdbtn2Uranus);
		group2.add(rdbtn2Uranus);
		
		JRadioButton rdbtn2Neptune = new JRadioButton("Neptune");
		panel_4.add(rdbtn2Neptune);
		group2.add(rdbtn2Neptune);
		
		JScrollPane scrollPane_1 = new JScrollPane(planetOne);
		gravity_Panel.add(scrollPane_1, BorderLayout.CENTER);
		planetOne.setPreferredSize(new Dimension(2100,200));
		scrollPane_1.setPreferredSize(new Dimension(500, 200));
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JTextArea textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(6, 62));
		gravity_Panel.add(textArea, BorderLayout.SOUTH);
		gravity_Panel.setVisible(false);
		
		btnStartHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				int planetNumberOne = getButtonNumber(group1);
				int planetNumberTwo = getButtonNumber(group2);
				
				//Get closest planet to sun
				if(newplanet.getDistanceFromSun(planetNumberOne) > newplanet.getDistanceFromSun(planetNumberTwo)){
					int tempPlanet = planetNumberOne;
					planetNumberOne = planetNumberTwo;
					planetNumberTwo = tempPlanet;
				}
				
				double distanceFromSun[] = {newplanet.getDistanceFromSun(planetNumberOne), newplanet.getDistanceFromSun(planetNumberTwo)};				
				double radius[] = {newplanet.getRadius(planetNumberOne), newplanet.getRadius(planetNumberTwo)};
				
				textArea.setText(newplanet.getSolarSystem(planetNumberOne, planetNumberTwo));

				planetOne.distanceFromSun[0] = distanceFromSun[0];
				planetOne.distanceFromSun[1] = distanceFromSun[1];
				planetOne.radius[0] = radius[0];
				planetOne.radius[1] = radius[1];
				planetOne.diameter[0] = (int)radius[0]/2;
				planetOne.diameter[1] = (int)radius[1]/2;
				planetOne.centerOfGravity = newplanet.calculateCenterOfMassTwoPlanets(newplanet.getPlanetMass(planetNumberOne), 
				newplanet.getPlanetMass(planetNumberTwo), (planetOne.distanceFromSun[0]/planetOne.div2 + planetOne.diameter[0])/planetOne.div3, 
				(newplanet.getDistanceFromSun(planetNumberTwo)/planetOne.div2 + newplanet.getDiameter(planetNumberTwo)/planetOne.div3) - 
				(newplanet.getDistanceFromSun(planetNumberOne)/planetOne.div2 + newplanet.getDiameter(planetNumberOne)/planetOne.div3));
		
				planetOne.setVisible(true);
				planetOne.repaint();
				
				
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		
		
		mntmTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trianglePane.setVisible(true);
				gravity_Panel.setVisible(false);
				trianglePane.repaint();
			}
		});
		
		mntmCalculateCenterOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trianglePane.setVisible(false);
				gravity_Panel.setVisible(true);
				
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//End of Method initialize
	
	public int getButtonNumber(ButtonGroup group1) {
		int i = 0;
		Enumeration<?> elements = group1.getElements();
		while (elements.hasMoreElements()) {
		      AbstractButton button = (AbstractButton)elements.nextElement();
		      if (button.isSelected()) {
		        break;
		      }
		      i++;
		    }//End of while loop
		return i;
	}//End of method PerformCalculation
}
