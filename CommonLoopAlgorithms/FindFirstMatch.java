
import java.util.Scanner;
/**
 * Write a description of class FindFirstMatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindFirstMatch
{
   public static void main(String[]args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a string ");
       String str = scan.nextLine();
       boolean found = false;
       int index = 0;
       char ch = '$';
       while(index < str.length())
       {
           ch = str.charAt(index);
           if(ch ==' ')
           {
               found = true;
               break;
           }
           index ++; 
        }
      if (ch == ' ')
      {
          System.out.println("Index of first space: " + index );
        }
      else
        {
            System.out.println("There is no space in this string");
        }
    }
}