package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MusicViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener 
{
	WindowFrame f;
	
	public ButtonViewListener(WindowFrame f) 
	{
		this.f = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton b = (JButton) e.getSource();
		MusicViewer mv = f.getMv();
		f.setupPanel(mv);
	}
}
