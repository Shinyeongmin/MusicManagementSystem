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
		System.out.print("��ȣ : ");
    	int num = input.nextInt();
    	this.setNum(num);
    	
    	System.out.print("���� : ");
    	String title = input.next();
    	this.setTitle(title);
    	
    	System.out.print("���� : ");
    	String singer = input.next();
    	this.setSinger(singer);
    	
    	System.out.print("�ٹ� : ");
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
	    System.out.print("�帣:"+ngenre);
		System.out.print(" ��ȣ:"+num);
		System.out.print(" ����:"+title);
		System.out.print(" ����:"+singer);
		System.out.println(" �ٹ�:"+album);
	}
}