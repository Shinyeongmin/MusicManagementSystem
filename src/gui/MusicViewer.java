package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.MusicManager;
import music.MusicInput;

public class MusicViewer extends JPanel
{
	WindowFrame f;
	
	MusicManager mm;

	public MusicManager getMm() 
	{
		return mm;
	}
	public void setMm(MusicManager mm) 
	{
		this.mm = mm;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUM");
		model.addColumn("TITLE");
		model.addColumn("SINGER");
		model.addColumn("ALBUM");
		
		for (int i = 0;  i < mm.size(); i++)
		{
			Vector row = new Vector();
			MusicInput mi = mm.get(i);
			row.add(mi.getNum());
			row.add(mi.getTitle());
			row.add(mi.getSinger());
			row.add(mi.getAlbum());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public MusicViewer(WindowFrame f, MusicManager mm) 
	{
		this.f = f;
		this.mm = mm;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUM");
		model.addColumn("TITLE");
		model.addColumn("SINGER");
		model.addColumn("ALBUM");
		
		for (int i = 0;  i < mm.size(); i++)
		{
			Vector row = new Vector();
			MusicInput mi = mm.get(i);
			row.add(mi.getNum());
			row.add(mi.getTitle());
			row.add(mi.getSinger());
			row.add(mi.getAlbum());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
