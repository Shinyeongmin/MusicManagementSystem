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
         num = input.nextInt();
         switch (num)
         {
         case 1 :
            System.out.print("�뷡 ���� : ");
            String SongTitle = input.next();
            System.out.print("���� : ");
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