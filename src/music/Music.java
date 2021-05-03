package music;

import java.util.Scanner;

public class Music 
{
	protected MusicGenre genre = MusicGenre.Ballade;
	protected int num;
	protected String title;
	protected String singer;
	protected String album;
	
	public Music() 
	{
		
	}
	
	public Music(MusicGenre genre) 
	{
		this.genre = genre;
	}
	
	public Music(int num)
	{
		this.num = num;
	}
	
	public Music(int num, String title, String singer, String album)
	{
		this.num = num;
		this.title = title;
		this.singer = singer;
		this.album = album;
	}
	
	public Music(MusicGenre genre, int num, String title, String singer, String album)
	{	
		this.genre = genre;
		this.num = num;
		this.title = title;
		this.singer = singer;
		this.album = album;
	}
	
	public MusicGenre getGenre() {
		return genre;
	}

	public void setGenre(MusicGenre genre) {
		this.genre = genre;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
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
}