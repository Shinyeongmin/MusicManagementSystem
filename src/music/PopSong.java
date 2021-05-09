package music;

import java.util.Scanner;

public class PopSong extends Music implements MusicInput
{
	public PopSong(MusicGenre genre) 
	{
		super(genre);
	}
	
	public void getUserInput(Scanner input)
	{
		System.out.print("번호 : ");
    	int num = input.nextInt();
    	this.setNum(num);
    	
    	System.out.print("제목 : ");
    	String title = input.next();
    	this.setTitle(title);
    	
    	System.out.print("가수 : ");
    	String singer = input.next();
    	this.setSinger(singer);
    	
    	System.out.print("앨범 : ");
    	String album = input.next();
    	this.setAlbum(album);
	}
	
	public void printInfo()
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
	    System.out.print("장르:"+ngenre);
		System.out.print(" 번호:"+num);
		System.out.print(" 제목:"+title);
		System.out.print(" 가수:"+singer);
		System.out.println(" 앨범:"+album);
	}
}