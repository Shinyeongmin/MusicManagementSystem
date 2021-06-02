package music;

import java.util.Scanner;

public interface MusicInput 
{	
	public int getNum();
	
	public void setNum(int num);
	
	public String getTitle();
	
	public void setTitle(String title);
	
	public String getSinger();
	
	public void setSinger(String singer);
	
	public String getAlbum();
	
	public void setAlbum(String album);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setMusicNum(Scanner input);
	
	public void setMusicTitle(Scanner input);
	
	public void setMusicSinger(Scanner input);
	
	public void setMusicAlbum(Scanner input);
}
