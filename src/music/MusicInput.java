package music;

import java.util.Scanner;

public interface MusicInput 
{	
	public int getNum();
	
	public void setNum(int num);
	
	public void setTitle(String title);
	
	public void setSinger(String singer);
	
	public void setAlbum(String album);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setMusicNum(Scanner input);
	
	public void setMusicTitle(Scanner input);
	
	public void setMusicSinger(Scanner input);
	
	public void setMusicAlbum(Scanner input);
}
