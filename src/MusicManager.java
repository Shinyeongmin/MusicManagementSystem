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
    	System.out.print("노래 번호 : ");
    	music.num = input.nextInt();
    	System.out.print("노래 제목 : ");
    	music.title = input.next();
    	System.out.print("가수 : ");
    	music.singer = input.next();
    	System.out.print("앨범 : ");
    	music.album = input.next();
    	System.out.println("노래 번호 : "+music.num);
    	System.out.println("노래 제목 : "+music.title);
    	System.out.println("가수 : "+music.singer);
    	System.out.println("앨범 : "+music.album);
    	System.out.println(music.num+"번 노래가 추가되었습니다.");	
    	System.out.println();
    }
	public void deleteMusic()
	{
		System.out.print("노래 번호 : ");
		int num = input.nextInt();
		if (music.num == num)
		{
			music = null;
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
		System.out.print("노래 번호 : ");
		int num = input.nextInt();
		if (music.num == num)
		{
			System.out.println(num+"번 노래가 수정되었습니다");
			System.out.println();
		}
		else
		{
			System.out.println(num+"번 노래가 아직 등록되지 않았습니다.");
			System.out.println();
			return;
		}
	}	
	public void viewMusic()
	{
		System.out.print("노래 번호 : ");
		int num = input.nextInt();
		if (music.num == num)
		{
			music.printInfo();
			System.out.println();
		}
		else
		{
			System.out.println(num+"번 노래가 아직 등록되지 않았습니다.");
			System.out.println();
			return;
		}
	}
	public static void exit()
	{
		System.out.println();
	}
}
