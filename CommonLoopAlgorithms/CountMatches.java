
import java.util.Scanner;
/**
 * Write a description of class CountMatches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountMatches
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= scan.nextLine(); // read entire line; not just a word
        int numSpaces = 0;
        for( int index = 0; index <str.length(); index ++ )
        {
            char ch = str.charAt(index);
            if( ch == ' ')
            {
                numSpaces++;
            }
        }
        System.out.println("Number of spaces: " + numSpaces);
    
    }
}