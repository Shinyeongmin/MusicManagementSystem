package music;

import java.util.Scanner;

public class HipHop extends Music 
{
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
