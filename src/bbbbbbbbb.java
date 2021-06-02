import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import music.Ballade;
import music.HipHop;
import music.MusicGenre;
import music.MusicInput;
import music.PopSong;
import music.Rock;

public class MusicManager implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5437755636628284253L;
	
	ArrayList<MusicInput> musics = new ArrayList<MusicInput>();
	transient Scanner input;
	
	MusicManager(Scanner input)
	{
		this.input = input;
	}
	
    public void addMusic()
	{
    	int genre = 0;
    	MusicInput musicInput;
    	while (genre < 1 || genre > 3)
    	{
    		try
    		{
		    	System.out.println("�帣�� �����ϼ���");
		    	System.out.println("1 for Ballade");
		    	System.out.println("2 for PopSong");
		    	System.out.println("3 for Rock");
		    	System.out.println("4 for HipHop");
		    	genre = input.nextInt();
		    	if (genre == 1)
		    	{
		    		musicInput = new Ballade(MusicGenre.Ballade);
		    		musicInput.getUserInput(input);
		    		musics.add(musicInput);
		    		musicInput.printInfo();
		    		break;
		    	}
		    	else if (genre == 2)
		    	{
		    		musicInput = new PopSong(MusicGenre.PopSong);
		    		musicInput.getUserInput(input);
		    		musics.add(musicInput);
		    		musicInput.printInfo();
		    		System.out.println();
		    		break;
		    	}
		    	else if (genre == 3)
		    	{
		    		musicInput = new Rock(MusicGenre.Rock);
		    		musicInput.getUserInput(input);
		    		musics.add(musicInput);
		    		musicInput.printInfo();
		    		System.out.println();
		    		break;
		    	}
		    	else if (genre == 4)
		    	{
		    		musicInput = new HipHop(MusicGenre.HipHop);
		    		musicInput.getUserInput(input);
		    		musics.add(musicInput);
		    		musicInput.printInfo();
		    		System.out.println();
		    		break;
		    	}
    		}
    		catch(InputMismatchException e)
    		{
    			System.out.println("Please put an integer between 1 and 3");
        		if (input.hasNext())
        		{
        			input.next();
        		}
        		genre = -1;
    		}
    	}
    }
	public void deleteMusic()
	{
		System.out.print("��ȣ : ");
		int num = input.nextInt();
		int index = findIndex(num);
		removefromMusics(index, num);
	}
	public int findIndex(int num)
	{
		int index = -1;
		for (int i=0; i<musics.size(); i++)
		{
			if (musics.get(i).getNum() == num)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	public int removefromMusics(int index, int num)
	{
		if (index >= 0)
		{
			musics.remove(index);
			System.out.println(num+"�� �뷡�� �����Ǿ����ϴ�.");
			System.out.println();
			return 1;
		}
		else
		{
			System.out.println(num+"�� �뷡�� ���� ��ϵ��� �ʾҽ��ϴ�.");
			System.out.println();
			return -1;
		}
	}
	
	public void editMusic()
	{
		System.out.print("��ȣ : ");
		int musicNum = input.nextInt();
		for (int i=0; i<musics.size(); i++)
		{
			MusicInput musicInput = musics.get(i);
			if (musicInput.getNum() == musicNum)
			{
				musicInput.printInfo();
				int j = -1;
				while (j != 5)
				{
					showEditMenu();
		            j = input.nextInt();
		            switch(j)
		            {
		            case 1:
		            	musicInput.setMusicNum(input);
		            	break;
		            case 2:
		            	musicInput.setMusicTitle(input);
		            	break;
		            case 3:
		            	musicInput.setMusicSinger(input);
		            	break;
		            case 4:
		            	musicInput.setMusicAlbum(input);
		            	break;
		            default:
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
	public void showEditMenu()
	{
		System.out.println("������ �׸��� �����ϼ���");
        System.out.println("1. ��ȣ ����");
        System.out.println("2. ���� ����");
        System.out.println("3. ���� ����");
        System.out.println("4. �ٹ� ����");
        System.out.println("5. Exit");
	}
}
