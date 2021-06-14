package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MusicManager;
	
public class WindowFrame extends JFrame
{
	MusicManager mm;
	
	MenuSelection ms;
	MusicAdder ma;
	MusicViewer mv;
	
	public WindowFrame(MusicManager mm) 
	{
		this.mm = mm;
		this.ms = new MenuSelection(this);
		this.ma = new MusicAdder(this, this.mm);
		this.mv = new MusicViewer(this, this.mm);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame");
		
		this.setupPanel(ms);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel p)
	{
		this.getContentPane().removeAll();
		this.getContentPane().add(p);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMs() 
	{
		return ms;
	}

	public void setMs(MenuSelection ms) 
	{
		this.ms = ms;
	}

	public MusicAdder getMa() 
	{
		return ma;
	}

	public void setMa(MusicAdder ma) 
	{
		this.ma = ma;
	}

	public MusicViewer getMv() 
	{
		return mv;
	}

	public void setMv(MusicViewer mv)
	{
		this.mv = mv;
	}
}
