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
		System.out.print("번호:"+num);
		System.out.print(" 제목:"+title);
		System.out.print(" 가수:"+singer);
		System.out.println(" 앨범:"+album);
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











