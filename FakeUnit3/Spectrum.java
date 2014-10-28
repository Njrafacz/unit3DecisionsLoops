import java.util.Scanner;

public class Spectrum
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a wavelength: ");
        double wavelength = scan.nextDouble();
        if(wavelength > Math.pow(10,-1))
        {
            System.out.println("This is a radio wave");
        }
        else if ( wavelength > Math.pow(10,-3))
        {
            System.out.println("This is a microwave");
        }
        else if (wavelength > 7 *Math.pow(10,-7))
        {
            System.out.println("This is an infared wave");
        }
        else if (wavelength > 4 * Math.pow(10,-7) && wavelength < 7 * Math.pow(10,-7))
        {
            System.out.println("This is a visible light wave");
        }
        else if (wavelength > Math.pow(10,-8))
        {
            System.out.println("This is an ultraviolet ray");
        }
        else if (wavelength > Math.pow(10,-11))
        {
            System.out.println("This is an x-ray wave");
        }
        else
        {
            System.out.println("This is a gamma ray");
        }
    }
}