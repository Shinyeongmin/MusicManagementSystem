import java.util.Scanner;

public class MusicManagementSystem 
{

   public static void main(String[] args)
   {
      int num = 0;
      Scanner input = new Scanner(System.in);
      
      while (num < 6)
      {
         System.out.println("�޴��� �����ϼ���");
         System.out.println("1. �뷡 �߰�");
         System.out.println("2. �뷡 ����");
         System.out.println("3. �뷡 ����");
         System.out.println("4. ������ ����");
         System.out.println("5. Exit");
         System.out.println();
         num = input.nextInt();
         switch (num)
         {
         case 1 :
             addMusic();
             break;
         case 2 :
             deleteMusic();
             break;
         case 3 :
             editMusic();
             break;
         case 4 :
             viewMusic();
             break;
         case 5 :
             viewChart();
             break;
         }
         
      }
            
   }
   public static void addMusic()
   {
 	  Scanner input = new Scanner(System.in);
 	  
 	  System.out.print("�뷡 ���� : ");
 	  String songtitle = input.next();
	  System.out.print("���� : ");
	  String singer = input.next();
	  System.out.print("�ٹ� : ");
 	  String album = input.next();
	  System.out.println("�뷡 ���� : "+songtitle);
	  System.out.println("���� : "+singer);
	  System.out.println("�ٹ� : "+album);
	  System.out.println();
   }
   public static void deleteMusic()
   {
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("�뷡 ���� : ");
	   String songtitle = input.next();
	   System.out.print("���� : ");
	   String singer = input.next();
	   System.out.println("�뷡 ���� : "+songtitle);
	   System.out.println("���� : "+singer);
	   System.out.println();
   }
   public static void editMusic()
   {
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("�뷡 ���� : ");
	   String songtitle = input.next();
	   System.out.print("���� : ");
	   String singer = input.next();
	   System.out.println("�뷡 ���� : "+songtitle);
	   System.out.println("���� : "+singer);
	   System.out.println();
   }
   public static void viewMusic()
   {
	   System.out.println();
   }
   public static void viewChart()
   {
	   System.out.println();
   }
}