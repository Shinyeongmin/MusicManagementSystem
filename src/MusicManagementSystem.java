import java.util.InputMismatchException;
import java.util.Scanner;

public class MusicManagementSystem 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MusicManager mms = new MusicManager(input);
        selectMenu(input, mms);
    }
    public static void selectMenu(Scanner input, MusicManager mms)
    {
    	int num = 0;
        
        while (num < 6)
        {
        	try
        	{
	        	showMenu();
	            num = input.nextInt();
	            switch (num)
	            {
	            case 1 :
	            	mms.addMusic();
	            	break;
	            case 2 :
	            	mms.deleteMusic();
	            	break;
	            case 3 :
	            	mms.editMusic();
	            	break;
	            case 4 :
	            	mms.viewMusics();
	            	break;
	            case 5 :
	            	mms.exit();
	            	break;
	            default:
	            	continue;
	            }
        	}
        	catch(InputMismatchException e)
        	{
        		System.out.println("Please put an integer between 1 and 5");
        		if (input.hasNext())
        		{
        			input.next();
        		}
        		num = -1;
        	}
        }
    }
    public static void showMenu()
    {
    	System.out.println("�޴��� �����ϼ���");
        System.out.println("1. �뷡 �߰�");
        System.out.println("2. �뷡 ����");
        System.out.println("3. �뷡 ����");
        System.out.println("4. �뷡 Ȯ��");
        System.out.println("5. Exit");
        System.out.println();
    }
}