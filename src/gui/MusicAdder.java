package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MusicAdder extends JPanel
{
	WindowFrame f;
	
	public MusicAdder(WindowFrame f)
	{
		this.f = f;
		
		JPanel p = new JPanel(new SpringLayout());
		
		JLabel labelNum = new JLabel("Num: ", JLabel.TRAILING);
		JTextField fieldNum = new JTextField(10);
		labelNum.setLabelFor(fieldNum);
		p.add(labelNum);
		p.add(fieldNum);
		
		JLabel labelTitle = new JLabel("Title: ", JLabel.TRAILING);
		JTextField fieldTitle = new JTextField(10);
		labelTitle.setLabelFor(fieldTitle);
		p.add(labelTitle);
		p.add(fieldTitle);
		
		JLabel labelSinger = new JLabel("Singer: ", JLabel.TRAILING);
		JTextField fieldSinger = new JTextField(10);
		labelSinger.setLabelFor(fieldSinger);
		p.add(labelSinger);
		p.add(fieldSinger);
		
		JLabel labelAlbum = new JLabel("Album: ", JLabel.TRAILING);
		JTextField fieldAlbum = new JTextField(10);
		labelAlbum.setLabelFor(fieldAlbum);
		p.add(labelAlbum);
		p.add(fieldAlbum);
		
		p.add(new JButton("save"));
		p.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(p, 5, 2, 6, 6, 6, 6);
		
		this.add(p);
	}
}
