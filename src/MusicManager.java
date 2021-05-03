import java.util.ArrayList;
import java.util.Scanner;

import music.Ballade;
import music.HipHop;
import music.Music;
import music.MusicGenre;
import music.PopSong;
import music.Rock;

public class MusicManager 
{
	ArrayList<Music> musics = new ArrayList<Music>();
	Scanner input;
	
	MusicManager(Scanner input)
	{
		this.input = input;
	}
	
    public void addMusic()
	{
    	int genre = 0;
    	Music music;
    	while (genre !=1 && genre!=2)
    	{
	    	System.out.println("장르를 선택하세요");
	    	System.out.println("1 for Ballade");
	    	System.out.println("2 for PopSong");
	    	System.out.println("3 for Rock");
	    	System.out.println("4 for HipHop");
	    	genre = input.nextInt();
	    	
	    	if (genre == 1)
	    	{
	    		music = new Ballade(MusicGenre.Ballade);
	    		music.getUserInput(input);
	    		musics.add(music);
	    		music.printInfo();
	    		System.out.println();
	    		break;
	    	}
	    	else if (genre == 2)
	    	{
	    		music = new PopSong(MusicGenre.PopSong);
	    		music.getUserInput(input);
	    		musics.add(music);
	    		music.printInfo();
	    		System.out.println();
	    		break;
	    	}
	    	else if (genre == 3)
	    	{
	    		music = new Rock(MusicGenre.Rock);
	    		music.getUserInput(input);
	    		musics.add(music);
	    		music.printInfo();
	    		System.out.println();
	    		break;
	    	}
	    	else if (genre == 4)
	    	{
	    		music = new HipHop(MusicGenre.HipHop);
	    		music.getUserInput(input);
	    		musics.add(music);
	    		music.printInfo();
	    		System.out.println();
	    		break;
	    	}
    	}
    }
	public void deleteMusic()
	{
		System.out.print("번호 : ");
		int num = input.nextInt();
		int index = -1;
		for (int i=0; i<musics.size(); i++)
		{
			if (musics.get(i).getNum() == num)
			{
				index = i;
				break;
			}
		}
		
		if (index >= 0)
		{
			musics.remove(index);
			System.out.println(num+"번 노래가 삭제되었습니다.");
			System.out.println();
		}
		else
		{
			System.out.println(num+"번 노래가 아직 등록되지 않았습니다.");
			System.out.println();
			return;
		}
	}
	public void editMusic()
	{
		System.out.print("번호 : ");
		int musicNum = input.nextInt();
		for (int i=0; i<musics.size(); i++)
		{
			Music music = musics.get(i);
			if (music.getNum() == musicNum)
			{
				music.printInfo();
				int j = -1;
				while (j != 5)
				{
					System.out.println("수정할 항목을 선택하세요");
		            System.out.println("1. 번호 수정");
		            System.out.println("2. 제목 수정");
		            System.out.println("3. 가수 수정");
		            System.out.println("4. 앨범 수정");
		            System.out.println("5. Exit");
		            j = input.nextInt();
		            if (j == 1)
		            {
		            	System.out.print("노래 번호 : ");
		            	int num = input.nextInt();
		            	music.setNum(num);
		            }
		            else if (j == 2)
		            {
		            	System.out.print("노래 제목 : ");
		            	String title = input.next();
		            	music.setTitle(title);
		            }
		            else if (j == 3)
		            {
		            	System.out.print("가수 : ");
		            	String singer = input.next();
		            	music.setSinger(singer);
		            }
		            else if (j == 4)
		            {
		            	System.out.print("앨범 : ");
		            	String album = input.next();
		            	music.setAlbum(album);
		            }
		            else
		            {
		            	continue;
		            }
				}
				break;
			}
		}
	}	
	public void viewMusics()
	{
		System.out.println("등록된 음악들:"+musics.size());
		for (int i=0; i<musics.size(); i++)
		{
			musics.get(i).printInfo();
		}
	}
	public static void exit()
	{
		System.out.println();
	}
}
