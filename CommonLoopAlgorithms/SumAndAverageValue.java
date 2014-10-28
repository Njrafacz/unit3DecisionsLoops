import java.util.Scanner;

/**
 * Write a description of class SumAndAverageValue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumAndAverageValue
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter multiple numbers or 'q' to quit. ");
        double total = 0;
        int count = 0;
        
        while( scan.hasNextDouble() )
        {
            double value = scan.nextDouble();
            total += value;
            count ++;
        }
        double average;
        if (count >0)
        {
            average = total/count ;
            System.out.println(" Total: " + total + "Average: " + average);
        }
    }
}
