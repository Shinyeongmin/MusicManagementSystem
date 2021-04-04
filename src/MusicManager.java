import java.util.Scanner;

public class MusicManager 
{
	Music music;
	Scanner input;
	
	MusicManager(Scanner input)
	{
		this.input = input;
	}
	
    public void addMusic()
	{
    	music = new Music();
    	System.out.print("�뷡 ��ȣ : ");
    	music.num = input.nextInt();
    	System.out.print("�뷡 ���� : ");
    	music.title = input.next();
    	System.out.print("���� : ");
    	music.singer = input.next();
    	System.out.print("�ٹ� : ");
    	music.album = input.next();
    	System.out.println("�뷡 ��ȣ : "+music.num);
    	System.out.println("�뷡 ���� : "+music.title);
    	System.out.println("���� : "+music.singer);
    	System.out.println("�ٹ� : "+music.album);
    	System.out.println(music.num+"�� �뷡�� �߰��Ǿ����ϴ�.");	
    	System.out.println();
    }
	public void deleteMusic()
	{
		System.out.print("�뷡 ��ȣ : ");
		int num = input.nextInt();
		if (music.num == num)
		{
			music = null;
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
		System.out.print("�뷡 ��ȣ : ");
		int num = input.nextInt();
		if (music.num == num)
		{
			System.out.println(num+"�� �뷡�� �����Ǿ����ϴ�");
			System.out.println();
		}
		else
		{
			System.out.println(num+"�� �뷡�� ���� ��ϵ��� �ʾҽ��ϴ�.");
			System.out.println();
			return;
		}
	}	
	public void viewMusic()
	{
		System.out.print("�뷡 ��ȣ : ");
		int num = input.nextInt();
		if (music.num == num)
		{
			music.printInfo();
			System.out.println();
		}
		else
		{
			System.out.println(num+"�� �뷡�� ���� ��ϵ��� �ʾҽ��ϴ�.");
			System.out.println();
			return;
		}
	}
	public static void exit()
	{
		System.out.println();
	}
}
