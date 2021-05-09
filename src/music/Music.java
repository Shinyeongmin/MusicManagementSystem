package music;

import java.util.Scanner;

public abstract class Music 
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
	public abstract void printInfo();
}