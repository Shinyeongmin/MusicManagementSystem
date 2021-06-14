package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import manager.MusicManager;
import music.Ballade;
import music.MusicGenre;
import music.MusicInput;

public class MusicAdderListener implements ActionListener 
{
	JTextField fieldNum;
	JTextField fieldTitle;
	JTextField fieldSinger;
	JTextField fieldAlbum;
	
	MusicManager mm;
	
	public MusicAdderListener
	(
			JTextField fieldNum, 
			JTextField fieldTitle, 
			JTextField fieldSinger,
			JTextField fieldAlbum,
			MusicManager mm
	) 
	{
		this.fieldNum = fieldNum;
		this.fieldTitle = fieldTitle;
		this.fieldSinger = fieldSinger;
		this.fieldAlbum = fieldAlbum;
		this.mm = mm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		MusicInput music = new Ballade(MusicGenre.Ballade);
		
		music.setNum(Integer.parseInt(fieldNum.getText()));
		music.setTitle(fieldTitle.getName());
		music.setSinger(fieldSinger.getText());
		music.setAlbum(fieldAlbum.getText());
		mm.addMusic(music);
		putObject(mm, "musicmanager.ser");
		music.printInfo();
	}
	
	public static void putObject(MusicManager mm, String fileName)
    {
		try 
		{
			FileOutputStream file = new FileOutputStream(fileName);
	    	ObjectOutputStream out = new ObjectOutputStream(file);
	    	
	    	out.writeObject(mm);
	    	
	    	out.close();
	    	file.close();
		} 
		catch (FileNotFoundException e) 
		{
 			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
    }

}
