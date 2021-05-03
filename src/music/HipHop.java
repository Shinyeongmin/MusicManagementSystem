package music;

import java.util.Scanner;

public class HipHop extends Music 
{
	public HipHop(MusicGenre genre) 
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
}