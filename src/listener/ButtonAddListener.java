package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MusicAdder;
import gui.MusicViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener 
{
	WindowFrame f;
	
	public ButtonAddListener(WindowFrame f) 
	{
		this.f = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton b = (JButton) e.getSource();
		MusicAdder ma = f.getMa();
		f.setupPanel(ma);
	}
}
