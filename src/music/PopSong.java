package music;

import java.util.Scanner;

public class PopSong extends Music
{
	public PopSong(MusicGenre genre) 
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
	    System.out.print("장르:"+ngenre);
		System.out.print(" 번호:"+num);
		System.out.print(" 제목:"+title);
		System.out.print(" 가수:"+singer);
		System.out.println(" 앨범:"+album);
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