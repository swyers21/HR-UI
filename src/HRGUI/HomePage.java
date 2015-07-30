package HRGUI;
import javax.swing.*;

import java.awt.*;


public class HomePage {
/*
 * Defining the framework
 */
	private JFrame f;
	private JPanel p;
	private JButton terminate;
	private JButton sbln;
	private JButton newAssociate;
	private JButton exit;
	private JButton picture;
	private JLabel lab;
	private JComboBox dept;
	private static String[] department = {"IT", "HR", "Whatever"};
	
	
	/*
	 * HomePage Constructor
	 */
	public HomePage()
	{
		gui();
		
	}
	
	/*
	 * Gui Method
	 */
	public void gui()
	{
		/*
		 * Creating new frame object
		 */
		f = new JFrame("HR Application");
		f.setVisible(true);
		f.setSize(1100, 900);			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.WHITE);
		/*
		 * Creating new Panel Object
		 */
		p = new JPanel();
	
		/*
		 * Creating new JButton Objects
		 */
		terminate = new JButton("Terminate This Associate");
		sbln = new JButton("Search by Last Name");
		newAssociate = new JButton("Add a new Associate");
		exit = new JButton("Exit This Form");
		picture = new JButton("Click here to Add/Change Picture");
		
	
		/*
		 * Creating new JCombobox Objects
		 */
		dept = new JComboBox(department);
		
		/*
		 * Creating new JLabel objects
		 */
		lab = new JLabel("This is a test label");
		
		/*
		 * Add to JPanel
		 */
		p.add(terminate);
		p.add(sbln);
		p.add(newAssociate);
		p.add(exit);
		p.add(picture);
		p.add(lab);
		p.add(dept);
		
		/*
		 * Add Border Layout South to JPanel P for the JFrame
		 */
		f.add(p,BorderLayout.SOUTH);
		
	
		
		
	}
	
	
	public static void main(String[] args) {
		/*
		 * Calling HomePage Class into Main Method
		 */
		new HomePage();
	}

}
