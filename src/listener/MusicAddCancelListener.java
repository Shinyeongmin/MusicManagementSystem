package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MusicAdder;
import gui.MusicViewer;
import gui.WindowFrame;

public class MusicAddCancelListener implements ActionListener 
{
	WindowFrame f;
	
	public MusicAddCancelListener(WindowFrame f) 
	{
		this.f = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		f.getContentPane().removeAll();
		f.getContentPane().add(f.getMs()); 
		f.revalidate();
		f.repaint();
	}
}
