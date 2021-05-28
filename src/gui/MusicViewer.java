package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MusicViewer extends JFrame 
{
	public MusicViewer() 
	{
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUM");
		model.addColumn("TITLE");
		model.addColumn("SINGER");
		model.addColumn("ALBUM");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
