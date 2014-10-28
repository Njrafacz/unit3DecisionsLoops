import java.util.Scanner;
public class FindMax
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a series of numbers (type 'q' to quit) ");
        double max = scan.nextDouble();
        while (scan.hasNextDouble() )
        {
            double value = scan.nextDouble();
            if (value > max)
            {
                max = value ;
            }
        
        }
        System.out.println(" Maximum value: " + max);
}
}