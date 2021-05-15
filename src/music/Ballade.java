package music;

import java.util.Scanner;

public class Ballade extends Music
{
	public Ballade(MusicGenre genre) 
	{
		super(genre);
	}
	
	public void getUserInput(Scanner input)
	{
		setMusicNum(input);
		setMusicTitle(input);
		setMusicSinger(input);
		setMusicAlbum(input);
	}
	
	public void printInfo()
	{
		String ngenre = getKindString();
	    System.out.print("�帣:"+ngenre);
		System.out.print(" ��ȣ:"+num);
		System.out.print(" ����:"+title);
		System.out.print(" ����:"+singer);
		System.out.println(" �ٹ�:"+album);
	}
	
	public String getKindString()
	{
		String ngenre = "none";
	    switch (this.genre)
	    {
	    case PopSong:
	    	ngenre = "PopSong";
	    	break;
	    case Rock:
	    	ngenre = "Rock";
	    	break;
	    case HipHop:
	    	ngenre = "HipHop";
	    	break;
	    case Ballade:
	    	ngenre = "ballade";
	    	break;
	    default:
	    }
	    return ngenre;
	}
}