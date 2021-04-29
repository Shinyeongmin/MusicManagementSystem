import java.util.ArrayList;
import java.util.Scanner;

import music.HipHop;
import music.Music;
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
	    	System.out.println("�帣�� �����ϼ���");
	    	System.out.println("1 for Ballade");
	    	System.out.println("2 for PopSong");
	    	System.out.println("3 for Rock");
	    	System.out.println("4 for HipHop");
	    	genre = input.nextInt();
	    	
	    	if (genre == 1)
	    	{
	    		music = new Music();
	    		music.getUserInput(input);
	    		musics.add(music);
	    		music.printInfo();
	    		System.out.println();
	    		break;
	    	}
	    	else if (genre == 2)
	    	{
	    		music = new PopSong();
	    		music.getUserInput(input);
	    		musics.add(music);
	    		music.printInfo();
	    		System.out.println();
	    		break;
	    	}
	    	else if (genre == 3)
	    	{
	    		music = new Rock();
	    		music.getUserInput(input);
	    		musics.add(music);
	    		music.printInfo();
	    		System.out.println();
	    		break;
	    	}
	    	else if (genre == 4)
	    	{
	    		music = new HipHop();
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
		System.out.print("��ȣ : ");
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
			System.out.println(num+"�� �뷡�� �����Ǿ����ϴ�.");
			System.out.println();
		}
		else
		{
			System.out.println(num+"�� �뷡�� ���� ��ϵ��� �ʾҽ��ϴ�.");
			System.out.println();
			return;
		}
	}
	public void editMusic()
	{
		System.out.print("��ȣ : ");
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
					System.out.println("������ �׸��� �����ϼ���");
		            System.out.println("1. ��ȣ ����");
		            System.out.println("2. ���� ����");
		            System.out.println("3. ���� ����");
		            System.out.println("4. �ٹ� ����");
		            System.out.println("5. Exit");
		            j = input.nextInt();
		            if (j == 1)
		            {
		            	System.out.print("�뷡 ��ȣ : ");
		            	int num = input.nextInt();
		            	music.setNum(num);
		            }
		            else if (j == 2)
		            {
		            	System.out.print("�뷡 ���� : ");
		            	String title = input.next();
		            	music.setTitle(title);
		            }
		            else if (j == 3)
		            {
		            	System.out.print("���� : ");
		            	String singer = input.next();
		            	music.setSinger(singer);
		            }
		            else if (j == 4)
		            {
		            	System.out.print("�ٹ� : ");
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
		System.out.println("��ϵ� ���ǵ�:"+musics.size());
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
