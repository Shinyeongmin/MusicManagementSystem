import java.util.Scanner;

public class MusicManagementSystem 
{

   public static void main(String[] args)
   {
      int num = 0;
      Scanner input = new Scanner(System.in);
      
      while (num < 6)
      {
         System.out.println("메뉴를 선택하세요");
         System.out.println("1. 노래 추가");
         System.out.println("2. 노래 제거");
         System.out.println("3. 노래 수정");
         System.out.println("4. 재생목록 보기");
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
 	  
 	  System.out.print("노래 제목 : ");
 	  String songtitle = input.next();
	  System.out.print("가수 : ");
	  String singer = input.next();
	  System.out.print("앨범 : ");
 	  String album = input.next();
	  System.out.println("노래 제목 : "+songtitle);
	  System.out.println("가수 : "+singer);
	  System.out.println("앨범 : "+album);
	  System.out.println();
   }
   public static void deleteMusic()
   {
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("노래 제목 : ");
	   String songtitle = input.next();
	   System.out.print("가수 : ");
	   String singer = input.next();
	   System.out.println("노래 제목 : "+songtitle);
	   System.out.println("가수 : "+singer);
	   System.out.println();
   }
   public static void editMusic()
   {
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("노래 제목 : ");
	   String songtitle = input.next();
	   System.out.print("가수 : ");
	   String singer = input.next();
	   System.out.println("노래 제목 : "+songtitle);
	   System.out.println("가수 : "+singer);
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