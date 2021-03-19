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
         num = input.nextInt();
         switch (num)
         {
         case 1 :
            System.out.print("노래 제목 : ");
            String SongTitle = input.next();
            System.out.print("가수 : ");
            String Singer = input.next();
            System.out.println();
            break;
         case 2 :
            
         case 3 :
            
         case 4 :
            
         }
         
      }
   }
}