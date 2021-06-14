package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.MusicViewer;
import gui.WindowFrame;
import manager.MusicManager;

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
		MusicViewer musicViewer = f.getMv();
		MusicManager mm = getObject("musicmanager.ser");
		musicViewer.setMm(mm);
		
		f.getContentPane().removeAll();
		f.getContentPane().add(musicViewer);
		f.revalidate();
		f.repaint();
	}
	
	public static MusicManager getObject(String fileName)
    {
    	MusicManager mm = null;
		try 
		{
			FileInputStream file = new FileInputStream(fileName);
	    	ObjectInputStream in = new ObjectInputStream(file);
	    	
	    	mm = (MusicManager) in.readObject();
	    	
	    	in.close();
	    	file.close();
		} 
		catch (FileNotFoundException e) 
		{
 			return mm;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return mm;
    }
}
