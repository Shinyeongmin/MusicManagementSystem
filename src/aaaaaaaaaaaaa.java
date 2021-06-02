import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MusicManagementSystem 
{
	static EventLogger logger = new EventLogger("log.txt");
	
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MusicManager mm = getObject("musicmanager.ser");
        if (mm == null)
        {
        	mm = new MusicManager(input);
        }     
        selectMenu(input, mm);
        putObject(mm, "musicmanager.ser");
    }
    public static void selectMenu(Scanner input, MusicManager mm)
    {
    	int num = 0;
        
        while (num != 5)
        {
        	try
        	{
	        	showMenu();
	            num = input.nextInt();
	            switch (num)
	            {
	            case 1 :
	            	mm.addMusic();
	            	logger.log("add a music");
		    		System.out.println();
	            	break;
	            case 2 :
	            	mm.deleteMusic();
	            	logger.log("delete a music");
	            	break;
	            case 3 :
	            	mm.editMusic();
	            	logger.log("edit a music");
	            	break;
	            case 4 :
	            	mm.viewMusics();
	            	logger.log("view a list of music");
	            	break;
	            default :
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
    	System.out.println("메뉴를 선택하세요");
        System.out.println("1. 노래 추가");
        System.out.println("2. 노래 제거");
        System.out.println("3. 노래 수정");
        System.out.println("4. 노래 확인");
        System.out.println("5. Exit");
        System.out.println();
    }
    
    public static MusicManager getObject(String fileName)
    {
    	MusicManager mm = null;
		try 
		{
			FileInputStream file = new FileInputStream(fileName);
	    	ObjectInputStream in = new ObjectInputStream(file);
	    	
	    	mm = (MusicManager) in.readObject();
	    	
	    	in.close();
	    	file.close();
		} 
		catch (FileNotFoundException e) 
		{
 			return mm;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		return mm;
    }
    public static void putObject(MusicManager mm, String fileName)
    {
		try 
		{
			FileOutputStream file = new FileOutputStream(fileName);
	    	ObjectOutputStream out = new ObjectOutputStream(file);
	    	
	    	out.writeObject(mm);
	    	
	    	out.close();
	    	file.close();
		} 
		catch (FileNotFoundException e) 
		{
 			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
    }
}