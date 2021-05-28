package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame 
{
	public MenuSelection()
	{
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel l = new JLabel("Menu Selection");
		
		JButton b1 = new JButton("Add Music");
		JButton b2 = new JButton("Delete Music");
		JButton b3 = new JButton("Edit Music");
		JButton b4 = new JButton("View List");
		JButton b5 = new JButton("Exit Program");

		
		
	
		p1.add(l);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);

		this.setVisible(true);
	}
}
